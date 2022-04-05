package com.bootcamp.products.processor;

import com.bootcamp.products.common.models.SessionData;
import com.bootcamp.products.common.models.TitularProduct;
import com.bootcamp.products.entity.Client;
import com.bootcamp.products.entity.Product;
import com.bootcamp.products.models.*;
import com.bootcamp.products.repository.ClientRepository;
import com.bootcamp.products.repository.ProductRepository;
import com.bootcamp.products.util.ClientMapper;
import com.bootcamp.products.util.ProductMapper;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.springframework.stereotype.Component;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class ProductsProcessor {

    private ClientRepository clientRepository;
    private ProductRepository productRepository;

    public ProductsProcessor(ClientRepository clientRepository, ProductRepository productRepository) {
        this.clientRepository = clientRepository;
        this.productRepository = productRepository;
    }

    //validaciones

    // validar productos del titular
    public Maybe<SessionData> validateClientsProduct(ProductsRequest request){
        System.out.println("validateClientsProduct");
        // buscar titular en clientes para obtener el tipo de cliente
        return  Maybe.just(request)
                .map(ProductsRequest::getProductoData)
                .map(ProductoData::getTitulares)
                .flatMapPublisher(Flowable::fromIterable)
                .map(titular ->  this.validateTitular(titular, request))
                .map(booleanMaybe ->
                        booleanMaybe.filter(aBoolean -> aBoolean == Boolean.FALSE )
                                .map(aBoolean -> returnSessionDataValidate(aBoolean, request))
                                .defaultIfEmpty(returnSessionDataValidate(Boolean.TRUE, request))
                )
                .blockingFirst().toMaybe()
                .doOnError(RuntimeException::new);

    }

    private static SessionData returnSessionDataValidate(Boolean booleanMaybe, ProductsRequest request) {
        return new SessionData()
                .toBuilder()
                .validationProducts(booleanMaybe).build();
    }

    private Maybe<Boolean> validateTitular(Titular titular, ProductsRequest request) {
        System.out.println("validateTitular");
        return  clientRepository.
                findByTipDocAndNumDocAndType(titular.getTipodoc(), titular.getNumdoc(), "P")
                .firstElement()
                .map(client -> client.getProducts()
                        .stream()
                        // P-CC / P-CA / P-PF   --- A-CP cuenta personal / A-CE cuenta empresarial / A-TC tarjeta credito
                        .noneMatch(product -> request.getProductoData().getTipo().equals("P") ||  // A= F
                                ((product.getSubType().equals("P-CC")
                                        || product.getSubType().equals("P-CA")
                                        || product.getSubType().equals("P-PF"))  &&  // F
                                        request.getProductoData().getTipo().equals("P")) ) //F
                )
                .switchIfEmpty(Maybe.defer(()->
                        clientRepository.
                                findByTipDocAndNumDocAndType(titular.getTipodoc(), titular.getNumdoc(), "E")
                                .firstElement()
                                .map(client -> client.getProducts()
                                        .stream()
                                        .anyMatch(product ->  request.getProductoData().getSubtipo().equals("P-CC"))
                                )
                                .switchIfEmpty(Maybe.defer(()-> Maybe.just(Boolean.TRUE)))
                ));
    }

    public ProductsResponse addClientProducts(ProductsRequest request) {
        return new ProductsResponse().productResp(request.getProductoData()
                .getTitulares()
                .stream()
                .map(titular -> new SessionData().toBuilder()
                        .owner(new TitularProduct()
                                .toBuilder()
                                .name(titular.getNombre())
                                .lastname("lastname")
                                .tipDoc(titular.getTipodoc())
                                .numDoc(titular.getNumdoc())
                                .type(titular.getTipodoc().equals("DNI") ? "P" : "E")
                                .build())
                        .build()
                )
                .map(sessionData -> clientRepository.
                        findByTipDocAndNumDocAndType(sessionData.getOwner().getTipDoc(), sessionData.getOwner().getNumDoc(),
                                sessionData.getOwner().getTipDoc().equals("DNI") ? "P" : "E")
                        .first(addProductAndClient(sessionData, request))
                        .map(client -> buildClient(client, request))
                        .map(client -> clientRepository.insert(client).subscribe(client1 -> System.out.println("Entity has been saved: " + client1)))
                )
                .collect(Collectors.toList()).stream()
                .map(clientMono -> new TitularResponse("clientMaybe.block().getIdClient()"
                        , "clientMaybe.block().getName()", "clientMaybe.block().getTipDoc()", "clientMaybe.block().getNumDoc()",
                        null))
                .collect(Collectors.toList()));

    }

    private Client buildClient(Client client, ProductsRequest request){
        client.getProducts().addAll(ClientMapper.addProduct(request, client.getProducts()));
        return client;
    }

    private Client addProductAndClient(SessionData sessionData1, ProductsRequest request) {
        System.out.println("addClient " + sessionData1.toString());
        return ClientMapper.buildClientRepository(sessionData1, request);
    }

}

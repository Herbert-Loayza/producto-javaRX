package com.bootcamp.products.business.impl;

import com.bootcamp.products.business.IProductBusiness;
import com.bootcamp.products.common.models.Product;
import com.bootcamp.products.common.models.SessionData;
import com.bootcamp.products.common.models.TitularProduct;
import com.bootcamp.products.entity.Client;
import com.bootcamp.products.models.*;
import com.bootcamp.products.processor.ProductsProcessor;
import com.bootcamp.products.repository.ClientRepository;
import com.bootcamp.products.repository.ProductRepository;
import com.bootcamp.products.util.ClientMapper;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductBusinessImpl implements IProductBusiness {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Maybe<ProductsResponse> addProduct(ProductsRequest request) {
        ProductsProcessor productsProcessor = new ProductsProcessor(clientRepository, productRepository);
        return  productsProcessor.validateClientsProduct(request)
                .doOnSuccess(sessionData -> System.out.println("Session : " + sessionData.toString()))
                .filter(sessionData -> sessionData.getValidationProducts() == Boolean.TRUE)
                .map(sessionData -> productsProcessor.addClientProducts(request));
    }


}

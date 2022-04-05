package com.bootcamp.products.util;

import com.bootcamp.products.entity.Product;
import com.bootcamp.products.common.models.SessionData;
import com.bootcamp.products.entity.Client;
import com.bootcamp.products.models.ProductsRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class ClientMapper {

    public static Client buildClientRepository(SessionData sessionData, ProductsRequest request){
        System.out.println("buildClientRepository ");
        List<Product> products = new ArrayList<>();
        products.add(new Product(String.valueOf(new SecureRandom().nextInt() & Integer.MAX_VALUE)  ,
                request.getProductoData().getName(),
                request.getProductoData().getTipo(),
                request.getProductoData().getSubtipo(),
                "TCE","1"));

        return new Client(
                sessionData.getOwner().getName(),
                sessionData.getOwner().getLastname(),
                sessionData.getOwner().getTipDoc(),
                sessionData.getOwner().getNumDoc(),
                sessionData.getOwner().getType(),
                products
                );
    }

    public static List<Product> addProduct(ProductsRequest request, List<Product> products){
        System.out.println("addProduct before " + products.toString());
         products.add(new Product(String.valueOf(new SecureRandom().nextInt() & Integer.MAX_VALUE)  ,
                request.getProductoData().getName(),
                request.getProductoData().getTipo(),
                request.getProductoData().getSubtipo(),
                "TCE","1"));
        System.out.println("addProduct products :" + products.toString());
         return products;

    }

}

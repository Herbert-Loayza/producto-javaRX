package com.bootcamp.products.util;

import com.bootcamp.products.common.models.SessionData;
import com.bootcamp.products.entity.Client;
import com.bootcamp.products.entity.Product;
import com.bootcamp.products.models.ProductoData;
import com.bootcamp.products.models.ProductsRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class ProductMapper {

    public static Product buildProductRepository(ProductoData request){
        System.out.println("buildProductRepository ");
        return new Product(String.valueOf(new SecureRandom().nextInt() & Integer.MAX_VALUE),
                request.getName(),
                request.getTipo(),
                request.getSubtipo(),
                "1", // SUBTIP-TC,
                "1"
                );
    }
/*
  this.id = id;
        this.name = name;
        this.type = type;
        this.subType = subType;
        this.subTypeTc = subTypeTc;
        this.state = state;
 */
}

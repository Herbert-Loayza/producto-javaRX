package com.bootcamp.products.service.impl;

import com.bootcamp.products.business.IProductBusiness;
import com.bootcamp.products.common.serivice.ICacheService;
import com.bootcamp.products.models.ProductsRequest;
import com.bootcamp.products.models.ProductsResponse;
import com.bootcamp.products.service.IProductService;
import io.reactivex.rxjava3.core.Maybe;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final ICacheService cacheService;

    @Autowired
    private IProductBusiness iProductBusiness;

    @Override
    public Maybe<ProductsResponse> createProduct(ProductsRequest productsRequest) {
        return iProductBusiness.addProduct(productsRequest);
    }
}

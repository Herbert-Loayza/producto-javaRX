package com.bootcamp.products.service;

import com.bootcamp.products.models.ProductsRequest;
import com.bootcamp.products.models.ProductsResponse;
import io.reactivex.rxjava3.core.Maybe;

public interface IProductService {

    public Maybe<ProductsResponse> createProduct(ProductsRequest productsRequest);

}

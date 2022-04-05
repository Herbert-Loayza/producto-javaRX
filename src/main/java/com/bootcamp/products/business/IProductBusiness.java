package com.bootcamp.products.business;

import com.bootcamp.products.models.ProductsRequest;
import com.bootcamp.products.models.ProductsResponse;
import io.reactivex.rxjava3.core.Maybe;

public interface IProductBusiness {

    public Maybe<ProductsResponse> addProduct(ProductsRequest request);

}

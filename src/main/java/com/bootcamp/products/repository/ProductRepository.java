package com.bootcamp.products.repository;

import com.bootcamp.products.entity.Product;
import io.reactivex.rxjava3.core.Flowable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

    public Flowable<Product> findByState(String state);

}

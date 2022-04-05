package com.bootcamp.products.repository;

import com.bootcamp.products.entity.Client;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, String> {

    public Flowable<Client> findByTipDocAndNumDocAndType(String tipDoc, String numDoc, String type);

    public Flowable<Client> findByTipDocAndNumDoc(String tipDoc, String numDoc);

    Mono<Client> insert(Maybe<Client> clientMaybe);

}

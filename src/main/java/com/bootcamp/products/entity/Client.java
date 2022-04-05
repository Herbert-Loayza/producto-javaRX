package com.bootcamp.products.entity;

import lombok.*;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@ToString
@Getter
@Setter
@Document(collection = "client")
public class Client {
    @Id
    private String id;
    private String name;
    private String lastname;
    private String tipDoc;
    private String numDoc;
    private String type; // P = PERSONAL / E = EMPRESARIAL

    private List<Product> products;

    public Client(String name, String lastname, String tipDoc, String numDoc, String type, List<Product> products) {
        this.name = name;
        this.lastname = lastname;
        this.tipDoc = tipDoc;
        this.numDoc = numDoc;
        this.type = type;
        this.products = products;
    }

}

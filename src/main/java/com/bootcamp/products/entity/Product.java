package com.bootcamp.products.entity;

import lombok.*;

@Builder(toBuilder = true)
@ToString
@Getter
@Setter
public class Product {
    private String id;
    private String name;
    private String type;  // P=PASICO - A=ACTIVO
    private String subType; // P-CC / P-CA / P-PF   --- A-CP cuenta personal / A-CE cuenta empresarial / A-TC tarjeta credito
    private String subTypeTc; // Sub tipo Tarjeta Credito : TCP= tarjeta credito Personal / TCE = tc Empresarial
    private String state;

    public Product(String id, String name, String type, String subType, String subTypeTc, String state) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.subType = subType;
        this.subTypeTc = subTypeTc;
        this.state = state;
    }
}

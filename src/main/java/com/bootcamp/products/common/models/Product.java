package com.bootcamp.products.common.models;

import lombok.*;

@Setter
@Getter
@Builder(toBuilder = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String id;
    private String name;
    private String type;
    private String subType;


}

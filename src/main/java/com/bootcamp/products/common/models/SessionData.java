package com.bootcamp.products.common.models;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder(toBuilder = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SessionData {

    private Product product;
    private TitularProduct owner;
    private Boolean validationProducts;


}

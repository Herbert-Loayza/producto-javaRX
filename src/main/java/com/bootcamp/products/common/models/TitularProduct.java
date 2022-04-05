package com.bootcamp.products.common.models;

import lombok.*;
import nonapi.io.github.classgraph.json.Id;

@Setter
@Getter
@Builder(toBuilder = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TitularProduct {

    private String idClient;
    private String tipDoc;
    private String lastname;
    private String name;
    private String numDoc;
    private String type; // P

}

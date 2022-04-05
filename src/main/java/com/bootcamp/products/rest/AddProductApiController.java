package com.bootcamp.products.rest;

import com.bootcamp.products.models.ProductsRequest;
import com.bootcamp.products.models.ProductsResponse;
import com.bootcamp.products.service.IProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.rxjava3.core.Maybe;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-29T21:25:39.003Z[GMT]")
@RestController
public class AddProductApiController implements AddProductApi {

    private static final Logger log = LoggerFactory.getLogger(AddProductApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private IProductService productService;

    @org.springframework.beans.factory.annotation.Autowired
    public AddProductApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public Maybe<ResponseEntity<ProductsResponse>> addProducts(@Parameter(in = ParameterIn.HEADER, description = "Token de autorizacion" ,required=true,schema=@Schema()) @RequestHeader(value="Authorization", required=true) String authorization, @Parameter(in = ParameterIn.HEADER, description = "Este campo es un valor estandar ya existente y sera usado como identificador." ,required=true,schema=@Schema()) @RequestHeader(value="Request-ID", required=true) String requestID, @Parameter(in = ParameterIn.HEADER, description = "Codigo de la aplicacion  que invoca el servicio. Se debe usar    el codigo de 2 caracteres que tienen asignada las aplicaciones, puede ser    el canal." ,required=true,schema=@Schema()) @RequestHeader(value="app-code", required=true) String appCode, @Parameter(in = ParameterIn.HEADER, description = "Llave de Sesion: Identificador unico que permitira vincular todos los eventos relacionados a una sesion del usuario." ,required=true,schema=@Schema()) @RequestHeader(value="session-UID", required=true) String sessionUID, @Parameter(in = ParameterIn.DEFAULT, description = "Request para Productos.", required=true, schema=@Schema()) @Valid @RequestBody ProductsRequest body) {
        return productService.createProduct(body).map(ResponseEntity::ok);
    }

}

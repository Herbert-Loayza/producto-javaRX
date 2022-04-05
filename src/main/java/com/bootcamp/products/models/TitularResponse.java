package com.bootcamp.products.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.bootcamp.products.models.ProductoResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TitularResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-31T03:52:43.509Z[GMT]")


public class TitularResponse   {
  @JsonProperty("idcliente")
  private String idcliente = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("tipodoc")
  private String tipodoc = null;

  @JsonProperty("numdoc")
  private String numdoc = null;

  @JsonProperty("products")
  @Valid
  private List<ProductoResponse> products = new ArrayList<ProductoResponse>();


  public TitularResponse(String idcliente, String nombre, String tipodoc, String numdoc, List<ProductoResponse> products) {
    this.idcliente = idcliente;
    this.nombre = nombre;
    this.tipodoc = tipodoc;
    this.numdoc = numdoc;
    this.products = products;
  }

  public TitularResponse idcliente(String idcliente) {
    this.idcliente = idcliente;
    return this;
  }

  /**
   * Id de la empresa de destino
   * @return idcliente
   **/
  @Schema(example = "1234567", required = true, description = "Id de la empresa de destino")
      @NotNull

    public String getIdcliente() {
    return idcliente;
  }

  public void setIdcliente(String idcliente) {
    this.idcliente = idcliente;
  }

  public TitularResponse nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Id de la cuenta de destino
   * @return nombre
   **/
  @Schema(example = "1234567", required = true, description = "Id de la cuenta de destino")
      @NotNull

    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public TitularResponse tipodoc(String tipodoc) {
    this.tipodoc = tipodoc;
    return this;
  }

  /**
   * Id de la empresa de destino
   * @return tipodoc
   **/
  @Schema(example = "1234567", required = true, description = "Id de la empresa de destino")
      @NotNull

    public String getTipodoc() {
    return tipodoc;
  }

  public void setTipodoc(String tipodoc) {
    this.tipodoc = tipodoc;
  }

  public TitularResponse numdoc(String numdoc) {
    this.numdoc = numdoc;
    return this;
  }

  /**
   * Id de la cuenta de destino
   * @return numdoc
   **/
  @Schema(example = "1234567", required = true, description = "Id de la cuenta de destino")
      @NotNull

    public String getNumdoc() {
    return numdoc;
  }

  public void setNumdoc(String numdoc) {
    this.numdoc = numdoc;
  }

  public TitularResponse products(List<ProductoResponse> products) {
    this.products = products;
    return this;
  }

  public TitularResponse addProductsItem(ProductoResponse productsItem) {
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<ProductoResponse> getProducts() {
    return products;
  }

  public void setProducts(List<ProductoResponse> products) {
    this.products = products;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitularResponse titularResponse = (TitularResponse) o;
    return Objects.equals(this.idcliente, titularResponse.idcliente) &&
        Objects.equals(this.nombre, titularResponse.nombre) &&
        Objects.equals(this.tipodoc, titularResponse.tipodoc) &&
        Objects.equals(this.numdoc, titularResponse.numdoc) &&
        Objects.equals(this.products, titularResponse.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idcliente, nombre, tipodoc, numdoc, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitularResponse {\n");
    
    sb.append("    idcliente: ").append(toIndentedString(idcliente)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    tipodoc: ").append(toIndentedString(tipodoc)).append("\n");
    sb.append("    numdoc: ").append(toIndentedString(numdoc)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

package com.bootcamp.products.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProductoData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-29T21:25:39.003Z[GMT]")


public class ProductoData   {
  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tipo")
  private String tipo = null;

  @JsonProperty("subtipo")
  private String subtipo = null;

  @JsonProperty("titulares")
  @Valid
  private List<Titular> titulares = new ArrayList<Titular>();

  public ProductoData productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Id de producto
   * @return productId
   **/
  @Schema(example = "1234567", required = true, description = "Id de producto")
      @NotNull

    public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public ProductoData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de Producto
   * @return name
   **/
  @Schema(example = "1234567", required = true, description = "Nombre de Producto")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductoData tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Nombre de Producto
   * @return tipo
   **/
  @Schema(example = "1234567", required = true, description = "Nombre de Producto")
      @NotNull

    public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public ProductoData subtipo(String subtipo) {
    this.subtipo = subtipo;
    return this;
  }

  /**
   * Nombre de Producto
   * @return subtipo
   **/
  @Schema(example = "1234567", required = true, description = "Nombre de Producto")
      @NotNull

    public String getSubtipo() {
    return subtipo;
  }

  public void setSubtipo(String subtipo) {
    this.subtipo = subtipo;
  }

  public ProductoData titulares(List<Titular> titulares) {
    this.titulares = titulares;
    return this;
  }

  public ProductoData addTitularesItem(Titular titularesItem) {
    this.titulares.add(titularesItem);
    return this;
  }

  /**
   * Get titulares
   * @return titulares
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<Titular> getTitulares() {
    return titulares;
  }

  public void setTitulares(List<Titular> titulares) {
    this.titulares = titulares;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductoData productoData = (ProductoData) o;
    return Objects.equals(this.productId, productoData.productId) &&
        Objects.equals(this.name, productoData.name) &&
        Objects.equals(this.tipo, productoData.tipo) &&
        Objects.equals(this.subtipo, productoData.subtipo) &&
        Objects.equals(this.titulares, productoData.titulares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, tipo, subtipo, titulares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductoData {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    subtipo: ").append(toIndentedString(subtipo)).append("\n");
    sb.append("    titulares: ").append(toIndentedString(titulares)).append("\n");
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

package com.bootcamp.products.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductoResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-31T03:52:43.509Z[GMT]")


public class ProductoResponse   {
  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tipo")
  private String tipo = null;

  @JsonProperty("subtipo")
  private String subtipo = null;

  public ProductoResponse(String productId, String name, String tipo, String subtipo) {
    this.productId = productId;
    this.name = name;
    this.tipo = tipo;
    this.subtipo = subtipo;
  }

  public ProductoResponse productId(String productId) {
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

  public ProductoResponse name(String name) {
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

  public ProductoResponse tipo(String tipo) {
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

  public ProductoResponse subtipo(String subtipo) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductoResponse productoResponse = (ProductoResponse) o;
    return Objects.equals(this.productId, productoResponse.productId) &&
        Objects.equals(this.name, productoResponse.name) &&
        Objects.equals(this.tipo, productoResponse.tipo) &&
        Objects.equals(this.subtipo, productoResponse.subtipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, tipo, subtipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductoResponse {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    subtipo: ").append(toIndentedString(subtipo)).append("\n");
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

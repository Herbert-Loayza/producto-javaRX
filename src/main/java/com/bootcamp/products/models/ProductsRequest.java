package com.bootcamp.products.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ProductsRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-29T21:25:39.003Z[GMT]")


public class ProductsRequest   {
  @JsonProperty("productoData")
  private ProductoData productoData = null;

  public ProductsRequest productoData(ProductoData productoData) {
    this.productoData = productoData;
    return this;
  }

  /**
   * Get productoData
   * @return productoData
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ProductoData getProductoData() {
    return productoData;
  }

  public void setProductoData(ProductoData productoData) {
    this.productoData = productoData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductsRequest productsRequest = (ProductsRequest) o;
    return Objects.equals(this.productoData, productsRequest.productoData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productoData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsRequest {\n");
    
    sb.append("    productoData: ").append(toIndentedString(productoData)).append("\n");
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

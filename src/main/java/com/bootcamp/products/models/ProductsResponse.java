package com.bootcamp.products.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.bootcamp.products.models.TitularResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-31T04:15:07.412Z[GMT]")


public class ProductsResponse   {
  @JsonProperty("productResp")
  @Valid
  private List<TitularResponse> productResp = new ArrayList<TitularResponse>();

  public ProductsResponse productResp(List<TitularResponse> productResp) {
    this.productResp = productResp;
    return this;
  }

  public ProductsResponse addProductRespItem(TitularResponse productRespItem) {
    this.productResp.add(productRespItem);
    return this;
  }

  /**
   * Get productResp
   * @return productResp
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<TitularResponse> getProductResp() {
    return productResp;
  }

  public void setProductResp(List<TitularResponse> productResp) {
    this.productResp = productResp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductsResponse productsResponse = (ProductsResponse) o;
    return Objects.equals(this.productResp, productsResponse.productResp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productResp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsResponse {\n");
    
    sb.append("    productResp: ").append(toIndentedString(productResp)).append("\n");
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

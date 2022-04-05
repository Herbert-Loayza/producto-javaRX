package com.bootcamp.products.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Datos del error tecnico.
 */
@Schema(description = "Datos del error tecnico.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-29T21:25:39.003Z[GMT]")


public class ApiExceptionDetail   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("component")
  private String component = null;

  @JsonProperty("description")
  private String description = null;

  public ApiExceptionDetail code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Codigo de error del Detalle/Proveedor
   * @return code
   **/
  @Schema(example = "MB0008", description = "Codigo de error del Detalle/Proveedor")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ApiExceptionDetail component(String component) {
    this.component = component;
    return this;
  }

  /**
   * Nombre del componente de falla
   * @return component
   **/
  @Schema(example = "MB.CardInqV2", description = "Nombre del componente de falla")
  
    public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public ApiExceptionDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripcion del Detalle
   * @return description
   **/
  @Schema(example = "Codigo invalido para el canal", description = "Descripcion del Detalle")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiExceptionDetail apiExceptionDetail = (ApiExceptionDetail) o;
    return Objects.equals(this.code, apiExceptionDetail.code) &&
        Objects.equals(this.component, apiExceptionDetail.component) &&
        Objects.equals(this.description, apiExceptionDetail.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, component, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiExceptionDetail {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

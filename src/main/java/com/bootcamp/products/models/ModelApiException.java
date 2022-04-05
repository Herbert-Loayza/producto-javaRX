package com.bootcamp.products.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Datos del error de sistema.
 */
@Schema(description = "Datos del error de sistema.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-29T21:25:39.003Z[GMT]")


public class ModelApiException   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("errorType")
  private String errorType = null;

  @JsonProperty("exceptionDetails")
  @Valid
  private List<ApiExceptionDetail> exceptionDetails = null;

  @JsonProperty("properties")
  private Object properties = null;

  public ModelApiException code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Codigo de error de Sistema
   * @return code
   **/
  @Schema(example = "TL0001", description = "Codigo de error de Sistema")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ModelApiException description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripcion del error de Sistema
   * @return description
   **/
  @Schema(example = "Error al llamar al servicio", description = "Descripcion del error de Sistema")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModelApiException errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Tipo de Error de Sistema
   * @return errorType
   **/
  @Schema(example = "TECHNICAL", description = "Tipo de Error de Sistema")
  
    public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public ModelApiException exceptionDetails(List<ApiExceptionDetail> exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
    return this;
  }

  public ModelApiException addExceptionDetailsItem(ApiExceptionDetail exceptionDetailsItem) {
    if (this.exceptionDetails == null) {
      this.exceptionDetails = new ArrayList<ApiExceptionDetail>();
    }
    this.exceptionDetails.add(exceptionDetailsItem);
    return this;
  }

  /**
   * Lista de detalles del error
   * @return exceptionDetails
   **/
  @Schema(description = "Lista de detalles del error")
      @Valid
    public List<ApiExceptionDetail> getExceptionDetails() {
    return exceptionDetails;
  }

  public void setExceptionDetails(List<ApiExceptionDetail> exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
  }

  public ModelApiException properties(Object properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Lista de propiedades especiales.
   * @return properties
   **/
  @Schema(description = "Lista de propiedades especiales.")
  
    public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiException _apiException = (ModelApiException) o;
    return Objects.equals(this.code, _apiException.code) &&
        Objects.equals(this.description, _apiException.description) &&
        Objects.equals(this.errorType, _apiException.errorType) &&
        Objects.equals(this.exceptionDetails, _apiException.exceptionDetails) &&
        Objects.equals(this.properties, _apiException.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, errorType, exceptionDetails, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiException {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    exceptionDetails: ").append(toIndentedString(exceptionDetails)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

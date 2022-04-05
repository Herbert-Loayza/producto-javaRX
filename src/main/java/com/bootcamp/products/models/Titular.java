package com.bootcamp.products.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Titular
 */
@Builder(toBuilder = true)
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-29T21:25:39.003Z[GMT]")


public class Titular   {
  @JsonProperty("idcliente")
  private String idcliente = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("tipodoc")
  private String tipodoc = null;

  @JsonProperty("numdoc")
  private String numdoc = null;

  public Titular idcliente(String idcliente) {
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

  public Titular nombre(String nombre) {
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

  public Titular tipodoc(String tipodoc) {
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

  public Titular numdoc(String numdoc) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Titular titular = (Titular) o;
    return Objects.equals(this.idcliente, titular.idcliente) &&
        Objects.equals(this.nombre, titular.nombre) &&
        Objects.equals(this.tipodoc, titular.tipodoc) &&
        Objects.equals(this.numdoc, titular.numdoc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idcliente, nombre, tipodoc, numdoc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Titular {\n");
    
    sb.append("    idcliente: ").append(toIndentedString(idcliente)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    tipodoc: ").append(toIndentedString(tipodoc)).append("\n");
    sb.append("    numdoc: ").append(toIndentedString(numdoc)).append("\n");
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

package com.semperti.hipotecario.poc.fuse.model;

public class TarjetaCreditoPatrimonial  {
  
  private Integer id = null;
  private Integer idMarcaTCPatrimonial = null;
  private Integer idEntidad = null;
  private Float limiteCompra = null;
  private Float deuda = null;
  private Float pagoPromedio = null;
  private Integer idPersona = null;

 /**
   * identificador de la tarjeta de credito patrimonial
   * @return id
  **/
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
 /**
   * Marca de la tarjeta (VISA, CABAL, MASTERCARD, etc)
   * @return idMarcaTCPatrimonial
  **/
  public Integer getIdMarcaTCPatrimonial() {
    return idMarcaTCPatrimonial;
  }
  public void setIdMarcaTCPatrimonial(Integer idMarcaTCPatrimonial) {
    this.idMarcaTCPatrimonial = idMarcaTCPatrimonial;
  }
 /**
   * Entidad de la tarjerta
   * @return idEntidad
  **/
  public Integer getIdEntidad() {
    return idEntidad;
  }
  public void setIdEntidad(Integer idEntidad) {
    this.idEntidad = idEntidad;
  }
 /**
   * Límite de compra
   * @return limiteCompra
  **/
  public Float getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(Float limiteCompra) {
    this.limiteCompra = limiteCompra;
  }
 /**
   * Deuda
   * @return deuda
  **/
  public Float getDeuda() {
    return deuda;
  }
  public void setDeuda(Float deuda) {
    this.deuda = deuda;
  }
 /**
   * Pago promedio
   * @return pagoPromedio
  **/
  public Float getPagoPromedio() {
    return pagoPromedio;
  }
  public void setPagoPromedio(Float pagoPromedio) {
    this.pagoPromedio = pagoPromedio;
  }
 /**
   * Relacion con el objeto persona
   * @return idPersona
  **/
  public Integer getIdPersona() {
    return idPersona;
  }
  public void setIdPersona(Integer idPersona) {
    this.idPersona = idPersona;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TarjetaCreditoPatrimonial {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idMarcaTCPatrimonial: ").append(toIndentedString(idMarcaTCPatrimonial)).append("\n");
    sb.append("    idEntidad: ").append(toIndentedString(idEntidad)).append("\n");
    sb.append("    limiteCompra: ").append(toIndentedString(limiteCompra)).append("\n");
    sb.append("    deuda: ").append(toIndentedString(deuda)).append("\n");
    sb.append("    pagoPromedio: ").append(toIndentedString(pagoPromedio)).append("\n");
    sb.append("    idPersona: ").append(toIndentedString(idPersona)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package com.semperti.hipotecario.poc.fuse.model;

public class Telefono  {
  
  private Integer id = null; //
  private Integer idTipoTelefono = null; //
  private Integer codigoPais = null; //
  private Integer codigoArea = null; //
  private Integer prefijo = null; //
  private Integer caracteristica = null; //
  private Integer numero = null; //
  private Integer interno = null; //
  private Integer prioridad = null;
  private Boolean esListaNegra = null;
  private String numeroNormalizado = null; //
  private Integer idPersona = null; //

 /**
   * Identificador del teléfono
   * @return id
  **/
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
 /**
   * Identificador del tipo de teléfono
   * @return idTipoTelefono
  **/
  public Integer getIdTipoTelefono() {
    return idTipoTelefono;
  }
  public void setIdTipoTelefono(Integer idTipoTelefono) {
    this.idTipoTelefono = idTipoTelefono;
  }
 /**
   * Número que representa el código del pais
   * @return codigoPais
  **/
  public Integer getCodigoPais() {
    return codigoPais;
  }
  public void setCodigoPais(Integer codigoPais) {
    this.codigoPais = codigoPais;
  }
 /**
   * Número que representa el código de area
   * @return codigoArea
  **/
  public Integer getCodigoArea() {
    return codigoArea;
  }
  public void setCodigoArea(Integer codigoArea) {
    this.codigoArea = codigoArea;
  }
 /**
   * Número que representa el prefijo
   * @return prefijo
  **/
  public Integer getPrefijo() {
    return prefijo;
  }
  public void setPrefijo(Integer prefijo) {
    this.prefijo = prefijo;
  }
 /**
   * Número que representa la caracteristica
   * @return caracteristica
  **/
  public Integer getCaracteristica() {
    return caracteristica;
  }
  public void setCaracteristica(Integer caracteristica) {
    this.caracteristica = caracteristica;
  }
 /**
   * Número completo del telefono
   * @return numero
  **/
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }
 /**
   * Numero que representa al interno
   * @return interno
  **/
  public Integer getInterno() {
    return interno;
  }
  public void setInterno(Integer interno) {
    this.interno = interno;
  }
 /**
   * Orden de prioridad del telefono dentro de los telefonos de la persona
   * @return prioridad
  **/
  public Integer getPrioridad() {
    return prioridad;
  }
  public void setPrioridad(Integer prioridad) {
    this.prioridad = prioridad;
  }
 /**
   * Indica si el teléfono esta dentro de la lista negra
   * @return esListaNegra
  **/
  public Boolean getEsListaNegra() {
    return esListaNegra;
  }
  public void setEsListaNegra(Boolean esListaNegra) {
    this.esListaNegra = esListaNegra;
  }
 /**
   * Número de teléfono normalizado para el discador
   * @return numeroNormalizado
  **/
  public String getNumeroNormalizado() {
    return numeroNormalizado;
  }
  public void setNumeroNormalizado(String numeroNormalizado) {
    this.numeroNormalizado = numeroNormalizado;
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
    sb.append("class Telefono {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoTelefono: ").append(toIndentedString(idTipoTelefono)).append("\n");
    sb.append("    codigoPais: ").append(toIndentedString(codigoPais)).append("\n");
    sb.append("    codigoArea: ").append(toIndentedString(codigoArea)).append("\n");
    sb.append("    prefijo: ").append(toIndentedString(prefijo)).append("\n");
    sb.append("    caracteristica: ").append(toIndentedString(caracteristica)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    interno: ").append(toIndentedString(interno)).append("\n");
    sb.append("    prioridad: ").append(toIndentedString(prioridad)).append("\n");
    sb.append("    esListaNegra: ").append(toIndentedString(esListaNegra)).append("\n");
    sb.append("    numeroNormalizado: ").append(toIndentedString(numeroNormalizado)).append("\n");
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
  
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefono other = (Telefono) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
  
}


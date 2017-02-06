package com.semperti.hipotecario.poc.fuse.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "Domicilio")
@XmlAccessorType(XmlAccessType.FIELD)
public class Domicilio  {
  
  private Integer id = null;
  private Integer idTipoDomicilio = null;
  private String calle = null;
  private Integer numero = null;
  private String piso = null;
  private String departamento = null;
  private String calleEntre1 = null;
  private String calleEntre2 = null;
  private Integer idCodigoPostal = null;
  private Integer idCiudad = null;
  private Integer idProvincia = null;
  private Integer idPais = null;
  private String ubicacion = null;
  private String barrio = null;
  private String latitud = null;
  private String longitud = null;
  private Integer idPersona = null;
  
  public Domicilio() {
	  
  }

 /**
   * Identificador del domicilio
   * @return id
  **/
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
 /**
   * Identificador del tipo del domicilio
   * @return idTipoDomicilio
  **/
  public Integer getIdTipoDomicilio() {
    return idTipoDomicilio;
  }
  public void setIdTipoDomicilio(Integer idTipoDomicilio) {
    this.idTipoDomicilio = idTipoDomicilio;
  }
 /**
   * Calle donde se ubica el inmueble
   * @return calle
  **/
  public String getCalle() {
    return calle;
  }
  public void setCalle(String calle) {
    this.calle = calle;
  }
 /**
   * Numero de la calle
   * @return numero
  **/
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }
 /**
   * Piso del bien en caso de ser propiedad vertical
   * @return piso
  **/
  public String getPiso() {
    return piso;
  }
  public void setPiso(String piso) {
    this.piso = piso;
  }
 /**
   * Get departamento
   * @return departamento
  **/
  public String getDepartamento() {
    return departamento;
  }
  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }
 /**
   * Calle 1 entre la que se ubica el inmueble
   * @return calleEntre1
  **/
  public String getCalleEntre1() {
    return calleEntre1;
  }
  public void setCalleEntre1(String calleEntre1) {
    this.calleEntre1 = calleEntre1;
  }
 /**
   * Calle 2 entre la que se ubica el inmueble
   * @return calleEntre2
  **/
  public String getCalleEntre2() {
    return calleEntre2;
  }
  public void setCalleEntre2(String calleEntre2) {
    this.calleEntre2 = calleEntre2;
  }
 /**
   * Identificador del codigo postal
   * @return idCodigoPostal
  **/
  public Integer getIdCodigoPostal() {
    return idCodigoPostal;
  }
  public void setIdCodigoPostal(Integer idCodigoPostal) {
    this.idCodigoPostal = idCodigoPostal;
  }
 /**
   * Identificador de la ciudad
   * @return idCiudad
  **/
  public Integer getIdCiudad() {
    return idCiudad;
  }
  public void setIdCiudad(Integer idCiudad) {
    this.idCiudad = idCiudad;
  }
 /**
   * Identificador de la provincia
   * @return idProvincia
  **/
  public Integer getIdProvincia() {
    return idProvincia;
  }
  public void setIdProvincia(Integer idProvincia) {
    this.idProvincia = idProvincia;
  }
 /**
   * Identificador del pais
   * @return idPais
  **/
  public Integer getIdPais() {
    return idPais;
  }
  public void setIdPais(Integer idPais) {
    this.idPais = idPais;
  }
 /**
   * informacion extra referida a la ubicacion del domicilio
   * @return ubicacion
  **/
  public String getUbicacion() {
    return ubicacion;
  }
  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }
 /**
   * Nombre del barrio del domicilio
   * @return barrio
  **/
  public String getBarrio() {
    return barrio;
  }
  public void setBarrio(String barrio) {
    this.barrio = barrio;
  }
 /**
   * Latitud del domicilio
   * @return latitud
  **/
  public String getLatitud() {
    return latitud;
  }
  public void setLatitud(String latitud) {
    this.latitud = latitud;
  }
 /**
   * Longitud del domicilio
   * @return longitud
  **/
  public String getLongitud() {
    return longitud;
  }
  public void setLongitud(String longitud) {
    this.longitud = longitud;
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
    sb.append("class Domicilio {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoDomicilio: ").append(toIndentedString(idTipoDomicilio)).append("\n");
    sb.append("    calle: ").append(toIndentedString(calle)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    piso: ").append(toIndentedString(piso)).append("\n");
    sb.append("    departamento: ").append(toIndentedString(departamento)).append("\n");
    sb.append("    calleEntre1: ").append(toIndentedString(calleEntre1)).append("\n");
    sb.append("    calleEntre2: ").append(toIndentedString(calleEntre2)).append("\n");
    sb.append("    idCodigoPostal: ").append(toIndentedString(idCodigoPostal)).append("\n");
    sb.append("    idCiudad: ").append(toIndentedString(idCiudad)).append("\n");
    sb.append("    idProvincia: ").append(toIndentedString(idProvincia)).append("\n");
    sb.append("    idPais: ").append(toIndentedString(idPais)).append("\n");
    sb.append("    ubicacion: ").append(toIndentedString(ubicacion)).append("\n");
    sb.append("    barrio: ").append(toIndentedString(barrio)).append("\n");
    sb.append("    latitud: ").append(toIndentedString(latitud)).append("\n");
    sb.append("    longitud: ").append(toIndentedString(longitud)).append("\n");
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


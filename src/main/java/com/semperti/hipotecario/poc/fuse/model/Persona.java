package com.semperti.hipotecario.poc.fuse.model;

import java.util.List;
import java.util.ArrayList;

public class Persona  {
	private Integer idNumeroDocumento = null;
	private Integer numeroDocumento = null;
	private Integer idSexo = null;
	private Integer id = null;
	private String apellidos = null;
	private String nombres = null;
	private Boolean esPersonaFisica = null;
	private Boolean esPersonaJuridica = null;
	private String valorLealtadCliente = null;
	private List<PrestamoPatrimonial> prestamosPatrimoniales = new ArrayList<>();
	private List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimoniales = new ArrayList<>();

	/**
	 * Identificador del tipo del documento
	 * @return idNumeroDocumento
	 **/
	public Integer getIdNumeroDocumento() {
		return idNumeroDocumento;
	}

	public void setIdNumeroDocumento(Integer idNumeroDocumento) {
		this.idNumeroDocumento = idNumeroDocumento;
	}

	/**
	 * Get numeroDocumento
	 * @return numeroDocumento
	 **/
	public Integer getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(Integer numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * Identificador del sexo
	 * @return idSexo
	 **/
	public Integer getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(Integer idSexo) {
		this.idSexo = idSexo;
	}

	/**
	 * Número de tributario
	 * @return id
	 **/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Apellidos de la persona
	 * @return apellidos
	 **/
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Nombres de la persona
	 * @return nombres
	 **/
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * Indica si es una persona física
	 * @return esPersonaFisica
	 **/
	public Boolean getEsPersonaFisica() {
		return esPersonaFisica;
	}

	public void setEsPersonaFisica(Boolean esPersonaFisica) {
		this.esPersonaFisica = esPersonaFisica;
	}

	/**
	 * Indica si es una persona juridica
	 * @return esPersonaJuridica
	 **/
	public Boolean getEsPersonaJuridica() {
		return esPersonaJuridica;
	}

	public void setEsPersonaJuridica(Boolean esPersonaJuridica) {
		this.esPersonaJuridica = esPersonaJuridica;
	}

	/**
	 * Score VLC del cliente
	 * @return valorLealtadCliente
	 **/
	public String getValorLealtadCliente() {
		return valorLealtadCliente;
	}
	public void setValorLealtadCliente(String valorLealtadCliente) {
		this.valorLealtadCliente = valorLealtadCliente;
	}

	/**
	 * Todos los prestamos de otras entidades declaradas por la persona
	 * @return prestamosPatrimoniales
	 **/
	public List<PrestamoPatrimonial> getPrestamosPatrimoniales() {
		return prestamosPatrimoniales;
	}
	public void setPrestamosPatrimoniales(List<PrestamoPatrimonial> prestamosPatrimoniales) {
		this.prestamosPatrimoniales = prestamosPatrimoniales;
	}

	/**
	 * Todas las tarjetas de credito declaradas por la persona
	 * @return tarjetasCreditoPatrimoniales
	 **/
	public List<TarjetaCreditoPatrimonial> getTarjetasCreditoPatrimoniales() {
		return tarjetasCreditoPatrimoniales;
	}

	public void setTarjetasCreditoPatrimoniales(List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimoniales) {
		this.tarjetasCreditoPatrimoniales = tarjetasCreditoPatrimoniales;
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
		Persona other = (Persona) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

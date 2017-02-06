package com.semperti.hipotecario.poc.fuse.model;

public class Error  {
	private Integer codigo = null;
	private String mensajeAlDesarrollador = null;
	private String mensajeAlUsuario = null;
	private String detalle = null;
	private String masInformacion = null;

	/**
	 * Get codigo
	 * @return codigo
	 **/
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	/**
	 * Get mensajeAlDesarrollador
	 * @return mensajeAlDesarrollador
	 **/
	public String getMensajeAlDesarrollador() {
		return mensajeAlDesarrollador;
	}

	public void setMensajeAlDesarrollador(String mensajeAlDesarrollador) {
		this.mensajeAlDesarrollador = mensajeAlDesarrollador;
	}

	/**
	 * Get mensajeAlUsuario
	 * @return mensajeAlUsuario
	 **/
	public String getMensajeAlUsuario() {
		return mensajeAlUsuario;
	}

	public void setMensajeAlUsuario(String mensajeAlUsuario) {
		this.mensajeAlUsuario = mensajeAlUsuario;
	}

	/**
	 * Get detalle
	 * @return detalle
	 **/
	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	/**
	 * Get masInformacion
	 * @return masInformacion
	 **/
	public String getMasInformacion() {
		return masInformacion;
	}

	public void setMasInformacion(String masInformacion) {
		this.masInformacion = masInformacion;
	}
}

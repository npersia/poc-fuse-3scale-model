package com.semperti.hipotecario.poc.fuse.model;

import java.io.Serializable;

import java.util.List;
import java.util.ArrayList;

public class Domicilios implements Serializable {
	List<Domicilio> domicilios = new ArrayList<>();

	public Domicilios() {}

	public Domicilios(List<Domicilio> domicilios) {
		this.domicilios = domicilios;
	}

	public List<Domicilio> getDomicilios() {
		return domicilios;
	}

	public void setDomicilios(List<Domicilio> domicilios) {
		this.domicilios = domicilios;
	}
}

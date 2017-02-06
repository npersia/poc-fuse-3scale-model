package com.semperti.hipotecario.poc.fuse.model;

import java.io.Serializable;

import java.util.List;
import java.util.ArrayList;

public class Personas implements Serializable {
	List<Persona> personas = new ArrayList<>();

	public Personas() {}

	public Personas(List<Persona> personas) {
		this.personas = personas;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
}

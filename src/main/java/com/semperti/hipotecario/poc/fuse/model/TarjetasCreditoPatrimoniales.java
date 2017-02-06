package com.semperti.hipotecario.poc.fuse.model;

import java.util.List;
import java.util.ArrayList;

import java.io.Serializable;

public class TarjetasCreditoPatrimoniales implements Serializable {
	protected List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimoniales = new ArrayList<TarjetaCreditoPatrimonial>();

	public TarjetasCreditoPatrimoniales() {}

	public TarjetasCreditoPatrimoniales(List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimoniales) {
		this.tarjetasCreditoPatrimoniales = tarjetasCreditoPatrimoniales;
	}

	public List<TarjetaCreditoPatrimonial> getTarjetasCreditoPatrimoniales() {
		return tarjetasCreditoPatrimoniales;
	}

	public void setTarjetasCreditoPatrimoniales(List<TarjetaCreditoPatrimonial> tarjetasCreditoPatrimoniales) {
		this.tarjetasCreditoPatrimoniales = tarjetasCreditoPatrimoniales;
	}
}

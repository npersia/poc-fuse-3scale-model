package com.semperti.hipotecario.poc.fuse.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces({ MediaType.APPLICATION_JSON })
public interface CobisRestService  {
	@GET
	@Path("/personas")
	public Response obtenerPersonas() throws Exception;

	@GET
	@Path("/personas/{id}")
	public Response obtenerPersona(@PathParam("id") Integer id) throws Exception;

	@GET
	@Path("/personas/{id}/telefonos")
	public Response obtenerTelefonosDePersona(@PathParam("id") Integer id) throws Exception;

	@GET
	@Path("/personas/{id}/tarjetas-credito-patrimoniales")
	public Response obtenerTarjetasCreditoPatrimonialesDePersona(@PathParam("id") Integer id) throws Exception;

	@GET
	@Path("/personas/{id}/prestamos-patrimoniales")
	public Response obtenerPrestamosPatrimonialesDePersona(@PathParam("id") Integer id) throws Exception;

	@GET
	@Path("/telefonos")
	public Response obtenerTelefonos() throws Exception;

	@GET
	@Path("/telefonos/{id}")
	public Response obtenerTelefono(@PathParam("id") Integer id) throws Exception;

	@GET
	@Path("/tarjetas-credito-patrimoniales")
	public Response obtenerTarjetasCreditoPatrimoniales() throws Exception;

	@GET
	@Path("/tarjetas-credito-patrimoniales/{id}")
	public Response obtenerTarjetaCreditoPatrimonial(@PathParam("id") Integer id) throws Exception;

	@GET
	@Path("/prestamos-patrimoniales")
	public Response obtenerPrestamosPatrimoniales() throws Exception;

	@GET
	@Path("/prestamos-patrimoniales/{id}")
	public Response obtenerPrestamoPatrimonial(@PathParam("id") Integer id) throws Exception;
}

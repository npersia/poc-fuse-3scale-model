package com.semperti.hipotecario.poc.fuse.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces({ MediaType.APPLICATION_JSON })
public interface BupRestService  {
	@GET
	@Path("/domicilios")
	public Response obtenerDomicilios() throws Exception;

	@GET
	@Path("/domicilios/{id}")
	public Response obtenerDomicilio(@PathParam("id") Integer id) throws Exception;

	@GET
	@Path("/personas")
	public Response obtenerPersonas() throws Exception;

	@GET
	@Path("/personas/{id}/domicilios")
	public Response obtenerDomiciliosDePersona(@PathParam("id") Integer id) throws Exception;

	@GET
	@Path("/personas/{id}")
	public Response obtenerPersona(@PathParam("id") Integer id) throws Exception;

	@GET
	@Path("/personas/{id}/telefonos")
	public Response obtenerTelefonosDePersona(@PathParam("id") Integer id) throws Exception;

	@GET
	@Path("/telefonos")
	public Response obtenerTelefonos() throws Exception;

	@GET
	@Path("/telefonos/{id}")
	public Response obtenerTelefono(@PathParam("id") Integer id) throws Exception;
}

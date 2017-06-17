package Prueba;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tec.eTECServer.Usuarios.Cliente;

@Path("/prueba")
public class prueba {
	
	
	public prueba(){
		
	}
	
	@GET
	@Path("/centros")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCentros(){
		return Response.ok().entity("{\"centros\":[1,2,3]}").build();
	}
	
	@GET
	@Path("/productos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPrueba(){
		return Response.ok().entity("{\"productos\":[{\"nombre\":\"Adriana Hot\",\"precio\":\"20500\",\"descripcion\":\"ppppp\",\"tiendas\":\"tienda1\"},{\"nombre\":\"Britany(pepa pig)\",\"precio\":\"30000\",\"descripcion\":\"fff\",\"tiendas\":\"tienda2\"}]}").build();
	}

}

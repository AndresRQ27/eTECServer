package tec.eTECServer;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tec.eTECServer.Usuarios.Cliente;
import tec.eTECServer.trees.BinaryTree;

@Path("/clientes")
public class Clientes {
	
	private static final BinaryTree<Cliente> clientes = new BinaryTree<>();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response nuevoCliente(Cliente nuevo){
		if(nuevo != null){
			clientes.insert(nuevo);
			return Response.status(201).build();
		}else{
			return Response.status(406).build();
		}
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCliente(@PathParam("id") String id){
		Cliente cliente = clientes.search(new Cliente(id));
		if(cliente != null){
			return Response.ok().entity(cliente).build();
		}else{
			return Response.status(404).build();
		}
	}
	
}

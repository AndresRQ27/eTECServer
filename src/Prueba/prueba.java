package Prueba;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/prueba")
public class prueba {

    public prueba(){
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPrueba(){
        String x = "hola";
        return Response.ok().entity(x).build();
	}

}

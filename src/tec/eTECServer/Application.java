package tec.eTECServer;

import org.glassfish.jersey.server.ResourceConfig;

import Prueba.prueba;

public class Application extends ResourceConfig {
	public Application(){
		register(prueba.class);
	}

}

package tec.eTECServer.Usuarios;

import tec.eTECServer.Producto.Producto;

public class Cliente implements Comparable<Cliente>{
	private String nombre, correo, ctroDistribucion;
	
	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}

	public Cliente(){
		
	}
	

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCtroDistribucion() {
		return ctroDistribucion;
	}

	public void setCtroDistribucion(String ctroDistribucion) {
		this.ctroDistribucion = ctroDistribucion;
	}
	
	
}

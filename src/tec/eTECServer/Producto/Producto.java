package tec.eTECServer.Producto;



public class Producto implements Comparable<Producto> {
	private String nombre, origen, descripcion;
	private int precio;
	
	public Producto(){
		
	}	

	@Override
	public int compareTo(Producto o) {
		return this.nombre.compareTo(o.getNombre());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}

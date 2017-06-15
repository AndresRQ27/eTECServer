package tec.eTECServer.Producto;

import java.util.ArrayList;

public class Paquete {
	private ArrayList<Producto> productos = new ArrayList<>();
	private String estado;
	
	public Paquete(){
		this.estado = "Transito";
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}

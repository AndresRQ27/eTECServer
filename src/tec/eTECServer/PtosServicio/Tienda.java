package tec.eTECServer.PtosServicio;

import tec.eTECServer.Producto.Producto;
import tec.eTECServer.trees.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class Tienda {
	private BinaryTree<Producto> bodega;

	private int id;
	public static List<Tienda> listaTiendas = new LinkedList();
	
	public Tienda(int id){
		this.bodega = new BinaryTree<>();
		this.id = id;
	}

	public BinaryTree<Producto> getBodega() {
		return bodega;
	}

	public void setBodega(BinaryTree<Producto> bodega) {
		this.bodega = bodega;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

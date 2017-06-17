package tec.eTECServer.PtosServicio;

import tec.eTECServer.Producto.Producto;
import tec.eTECServer.trees.BinaryTree;

class Tienda {
	private BinaryTree<Producto> bodega;
	
	public Tienda(){
		this.bodega = new BinaryTree<>();
	}

	public BinaryTree<Producto> getBodega() {
		return bodega;
	}

	public void setBodega(BinaryTree<Producto> bodega) {
		this.bodega = bodega;
	}
	
	
}

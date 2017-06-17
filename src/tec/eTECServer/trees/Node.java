package tec.eTECServer.trees;
import java.util.ArrayList;


public class Node<T> {
	//CasoCl�nico caso;
	private T Element;
	private int balanceF;
	private Node<T> left;
	private Node<T> right;
	private Node<T> father;
	private ArrayList<Node<T>> ruta;
	
	
	public Node(T element){
		this(element, null);
	}
	private Node(T element, Node<T> left){
		this.Element = element;
		this.balanceF = 0;
		this.right = null;
		this.left = left;
		this.father = null;
		
	}
	//Gets
	public Node<T> getLeft(){
		return left;
	}

	public Node<T> getRight(){
		return right;
	}
	
	public Node<T> getFather(){
		return father;
	}
	public T getElement(){
		return Element;
	}
	
	
	
	//Sets
	public void setRight(Node<T> right){
		this.right = right;
	}
	

	public void setLeft(Node<T> left){
		this.left = left;
	}
	
	public void setFather(Node<T> father){
		this.father = father;
	}
	
	public void setElement(T element){
		this.Element = element;
	}
	
	
	public void setBalanceF(int bf){
		this.balanceF = bf;
	}

	public int getBalanceF(){
		int rightHeight = 0;
		int leftHeight = 0;
		if(this.getRight()!=null){
	    	rightHeight = this.getRight().getHeight();
	   	}
	   	if(this.getLeft()!=null){		    
	   		leftHeight = this.getLeft().getHeight();
	   	}
		return (rightHeight - leftHeight);
	}
	
	public int getHeight(){
		int leftH;
		int rightH;
		
		if(this.getElement()==null){
		  return 0;
    	}


		if(this.getLeft()!=null){	
			leftH = this.getLeft().getHeight();
		}else{
			leftH = 0;
		}
    	
    	if(this.getRight()!=null){   
    		rightH = this.getRight().getHeight();
    	}else{
    		rightH = 0;
    	}
    	return Math.max(leftH, rightH) + 1;
	}
	
	
	

	public static void main(String[] args){
		
		BinaryTree<Integer> tree = new BinaryTree();
		
		tree.insert(10);
		tree.insert(5);
		tree.insert(13);
		tree.insert(1);
		tree.insert(6);
		tree.insert(17);
		tree.insert(16);
		//tree.remove(10);
		//tree.remove(5);
		//tree.remove(6);
		System.out.println(tree.route());
		
		tree.postOrden(tree.getRoot()); //Binario
		//tree.postOrden(tree.getRoot()); //Splay
		//System.out.println(tree.postOrden()); //AVL
		
		
	
	}		

}
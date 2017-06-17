package tec.eTECServer.trees;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class BinaryTree<T extends Comparable<T>> {
	private Node<T> root;
	//Comparador.
    private Comparator<T> comparator;

	public BinaryTree(){
		this.root=null;
	}
	
	public Node<T> getRoot(){
		return root;
	}
	
	//Insertar en un �rbol binario
	public void insert(T element){
		this.root = this.insert(element, this.root);
	}
	private Node<T> insert(T element, Node<T> current){

		if (current == null){
			return new Node<>(element);
		} else if (element.compareTo(current.getElement())<0){
			current.setLeft(this.insert(element, current.getLeft())) ;
		}else if (element.compareTo(current.getElement())>0){
			current.setRight(this.insert(element, current.getRight()));
		}
		return current;
	}
	
	
	//Buscar en un �rbol binario
	public T search(T element){
		return this.search(element, this.root);
	}

	private T search(T element, Node<T> node){
		if (node==null){
			return null;
		} else if (element.compareTo(node.getElement())<0){
			return search(element, node.getLeft());
		} else if (element.compareTo(node.getElement())>0){
			return search(element, node.getRight());	
		} else{
			return node.getElement();
		}
	}

	//Buscar menor
	public Node<T> findMin(){
		return findMin(this.root);
	}
	private Node<T> findMin(Node<T> node){
		if(node == null){
			return null;
		} else if (node.getLeft() == null){
			return node;
		} else {
			return findMin(node.getLeft());
		}
	}

	//Eliminar en un �rbol binario
	public void remove(T element){
		this.root = remove(element, this.root);
	}
	private Node<T> remove(T element, Node<T> node){
		if (node == null){
			return null;
		} else if (element.compareTo(node.getElement())<0){
			node.setLeft(remove(element,node.getLeft()));
		} else if (element.compareTo(node.getElement())>0) {
			node.setRight(remove(element, node.getRight())) ;
		} else if (node.getLeft() != null && node.getRight() != null){
			node.setElement(findMin(node.getRight()).getElement()) ;
			node.setRight(remove(node.getElement(), node.getRight())) ;
		} else{
			node = node.getLeft() != null ? node.getLeft(): node.getRight();	
		}
		return node;
	}

	private void inOrden(Node<T> n){
		if (n != null){
			inOrden (n.getLeft());
			System.out.println(n.getElement() + ", ");
			inOrden(n.getRight());
		}
	}

	//M�todo para recorrer el �rbol PreOrden
    private void preOrden(Node<T> n){
		if (n != null){
			System.out.println(n.getElement() + ", ");
			preOrden (n.getLeft());
			preOrden (n.getRight());
		}
	}

	//M�todo para recorrer el �rbol PostOrden
	public void postOrden(Node<T> n){
		if (n != null){
			postOrden(n.getLeft());
			postOrden(n.getRight());
			System.out.println(n.getElement() + ", ");
		}
	}

	//Devuelve la profundidad del nodo, si no est� en el �rbol devurlve -1
    public int profundidad(T element){
    	Node<T> node = new Node<>(element);
    	int profundidad = 0;
    	while(comparateElement(node.getElement(), this.getRoot().getElement())!=0){
    		profundidad++;
    		node = father(node);

    	}

    	return profundidad;

    }

  //Devuelve la altura del nodo, sino esta en el �rbol devuelve -1
    public int altura(T dato){
    	Node<T> node = this.getNode(dato);
    	if(!this.contains(dato)){
    		return -1;
    	}

    	return node.getHeight();
    }


  //Compara dos elementos
  int comparateElement(T t1, T t2){
    	if(this.comparator==null){
    		return t1.compareTo(t2);
    	}else{
    		return this.comparator.compare(t1,t2);
    	}
    }
    

    
  //Obtiene el nodo padre
  private Node<T> father(Node<T> nodo){
  		Node<T> tmpRoot = this.getRoot();
  		Stack<Node<T>> pila = new Stack<>();
      	pila.push(tmpRoot);	
      	while(tmpRoot.getRight()!=null || tmpRoot.getLeft()!=null){
  	    	if(this.comparateElement(nodo.getElement(), tmpRoot.getElement())>0){
  	    		if(tmpRoot.getRight()!=null){   	
  	    			tmpRoot = tmpRoot.getRight();
  	    		}
  	    	}
  	    	else if(this.comparateElement(nodo.getElement(), tmpRoot.getElement())<0){	
  	    		if(tmpRoot.getLeft()!=null){   
  		    		tmpRoot = tmpRoot.getLeft();
  	    		}
  	    	}
  	    	if(this.comparateElement(nodo.getElement(), tmpRoot.getElement())==0){
  	    		return pila.pop();
  	    	}

  	    	pila.push(tmpRoot);	
      	}
      	return pila.pop();
  	}
  	
  //Devuelve el nodo del elemento ingresado
  Node<T> getNode(T dato){
     	Node<T> tmpRoot = this.getRoot();
     	
     	if(this.isEmpty()){
     		return null;
     	}
    	
   		while(tmpRoot.getRight()!=null || tmpRoot.getLeft()!=null){

	    	if(this.comparateElement(dato, tmpRoot.getElement())>0){
	    		if(tmpRoot.getRight()!=null){   		
	    			tmpRoot = tmpRoot.getRight();
	    		}else{
	    			return null;
	    		}
	    	}else if(this.comparateElement(dato, tmpRoot.getElement())<0){	
	    		if(tmpRoot.getLeft()!=null){   
		    		tmpRoot = tmpRoot.getLeft();
	    		}else{
	    			return null;
	    		}
	    	}
	    	
	    	if(this.comparateElement(dato, tmpRoot.getElement())==0){
	    		return tmpRoot;
	    	}
    	}
    	
    	return tmpRoot;
    }
    
  //Si esta vacio es true
  boolean isEmpty(){
    	return this.size()==0;

    }
    
    int size(){
    	return this.preOrden().size();
    }
    
  //Imprime en orden primero ra�z, despues izquierda y despues derecha
  List<T> preOrden(){
    	List<T> list = new ArrayList<>();
    	Node<T> node = this.getRoot();  	
    	Stack<Node<T>> pila = new Stack<>();

     	while((node!=null && node.getElement()!=null) || !pila.empty()){
     		if(node!=null){
     			list.add(node.getElement());
     			pila.push(node);
     			node = node.getLeft();
     		}else{
     			node = pila.pop();
     			node = node.getRight();
     		}
     	} 	
    	
    	return list;
    }
    
  //Buscar un nodo
  boolean contains(Object o) throws ClassCastException, NullPointerException{
    	Node<T> raizTmp = this.getRoot();
    	if(this.isEmpty()){
    		return false;
    	}
    	
    	//si es la raiz el buscado
    	if(this.comparateElement((T)o, raizTmp.getElement())==0){
	    	return true;
	    }
	    
    	while(raizTmp.getRight()!=null || raizTmp.getLeft()!=null){

	    	if(this.comparateElement((T)o, raizTmp.getElement())>0){
	    		if(raizTmp.getRight()!=null){   		
	    			raizTmp = raizTmp.getRight();
	    		}else{
	    			return false;
	    		}
	    	}else if(this.comparateElement((T)o, raizTmp.getElement())<0){	
	    		if(raizTmp.getLeft()!=null){   
		    		raizTmp = raizTmp.getLeft();
	    		}else{
	    			return false;
	    		}
	    	}
	    	
	    	if(this.comparateElement((T)o, raizTmp.getElement())==0){
	    		return true;
	    	}
    	}
    	return false;
    }
    
private final ArrayList<T> camino = new ArrayList<>();
    
    public ArrayList<T> route(){
		return this.route((T) "17", this.root);
	}
    ArrayList<T> route(T element, Node<T> node){
		
		if (node==null){
			return null;
		} else if (element.compareTo(node.getElement())<0){
			camino.add(node.getElement());
			return route(element, node.getLeft());
		} else if (element.compareTo(node.getElement())>0){
			camino.add(node.getElement());
			return route(element, node.getRight());	
		} else{
			
			camino.add(node.getElement());
			return camino;
		}
	}

    public int longRoute(T element){
		return this.longRoute(element, this.root);
	}
    int longRoute(T element, Node<T> node){
		
		if (node==null){
			return 0;
		} else if (element.compareTo(node.getElement())<0){
			camino.add(node.getElement());
			return longRoute(element, node.getLeft());
		} else if (element.compareTo(node.getElement())>0){
			camino.add(node.getElement());
			return longRoute(element, node.getRight());	
		} else{
			
			camino.add(node.getElement());
			return camino.size();
		}
	}
	
    
    
    
}


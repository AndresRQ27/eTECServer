package Grafo.Clases;

/**
 * Created by Melany on 15/06/2017.
 * eTECServer
 * ${PACKAGE_NAME}
 */
public class Nodo {

    private  int nombre ;
    private boolean visitado ;
    private boolean etiqueta;
    private int acumulado; // lleva el acoulado de cada nodo
    private Nodo Predecesor;

    public Nodo(){
        this.nombre =-1;
        this.visitado = false;
        this.etiqueta = false;
        this.Predecesor  = null;
        this.acumulado =0;

    }

    public int getNombre() {
        return nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public boolean isEtiqueta() {
        return !etiqueta;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public Nodo getPredecesor() {
        return Predecesor;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setVisitado() {
        this.visitado = true;
    }

    public void setEtiqueta() {
        this.etiqueta = true;
    }

    public void setAcumulado(int acomulado) {
        this.acumulado = acomulado;
    }

    public void setPredecesor(Nodo Predecesor) {
        this.Predecesor = Predecesor;
    }


}



package Grafo.Clases;

import static Grafo.Ventanas.VentanaPrincipal.jPanel1;
import static Grafo.Ventanas.VentanaPrincipal.R_repaint;

import java.awt.Color;
import javax.swing.JOptionPane;



/**
 * Created by Melany on 15/06/2017.
 * eTECServer
 * ${PACKAGE_NAME}
 */
public class Algoritmo_Dijkstra {
    private final Grafo grafo;
    private int subTope;
    private final Nodo[] nodo;
    private final int tope;
    private int permanente;
    private final int nodoFin;


    public Algoritmo_Dijkstra (Grafo grafo, int tope,int permanente, int nodoFin){
        this.grafo = grafo;
        this.tope = tope;
        this.nodo= new Nodo[tope];
        this.permanente = permanente;
        this.nodoFin = nodoFin;

    }

    public int getAcumulado(){
        return nodo[nodoFin].getAcumulado();
    }

    public void dijkstra(){
        for (int i = 0; i < tope; i++)  // creamos el vector nodo del tamaño de tope el cual tiene el numero de nodo pintados
            nodo[i]= new Nodo();

        if(permanente != nodoFin){
            jPanel1.paint(jPanel1.getGraphics());
            R_repaint(tope, grafo);
            Pintar.clickSobreNodo(jPanel1.getGraphics(), grafo.getCordeX(permanente), grafo.getCordeY(permanente), Color.GREEN); // pinta de color GREEN los nodos


            nodo[permanente].setVisitado();
            nodo[permanente].setNombre(permanente);

            do{
                int subAcomulado = 0;
                int auxAumulado = 2000000000;
                nodo[permanente].setEtiqueta();
                for (int j = 0; j < tope; j++) {
                    if(grafo.getmAdyacencia(j, permanente)==1){
                        subAcomulado = nodo[permanente].getAcumulado()+grafo.getmCoeficiente(j, permanente);
                        if(subAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado() && nodo[j].isEtiqueta()){
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado();
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]);
                        }
                        else if(!nodo[j].isVisitado()){
                            nodo[j].setAcumulado(subAcomulado);
                            nodo[j].setVisitado();
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[permanente]);
                        }
                    }
                }
                for (int i = 0; i <tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como permanente
                    if(nodo[i].isVisitado() && nodo[i].isEtiqueta()){
                        if(nodo[i].getAcumulado()<= auxAumulado){
                            permanente= nodo[i].getNombre();
                            auxAumulado = nodo[i].getAcumulado();
                        }
                    }
                }
                subTope++;
            }while(subTope<tope+1);
            Nodo auxi = nodo[nodoFin];
            if(auxi.getPredecesor() == null )
                JOptionPane.showMessageDialog(null,"No se Pudo LLegar Al Nodo "+nodoFin);
            while(auxi.getPredecesor() != null){
                Pintar.pintarCamino(jPanel1.getGraphics(), grafo.getCordeX(auxi.getNombre()), grafo.getCordeY(auxi.getNombre()), grafo.getCordeX(auxi.getPredecesor().getNombre()), grafo.getCordeY(auxi.getPredecesor().getNombre()),Color.GREEN);
                Pintar.clickSobreNodo(jPanel1.getGraphics(), grafo.getCordeX(auxi.getNombre()), grafo.getCordeY(auxi.getNombre()), Color.GREEN);
                auxi = auxi.getPredecesor();
            }
            Pintar.clickSobreNodo(jPanel1.getGraphics(), grafo.getCordeX(nodoFin), grafo.getCordeY(nodoFin), Color.GREEN);
        }
        else Pintar.clickSobreNodo(jPanel1.getGraphics(), grafo.getCordeX(nodoFin), grafo.getCordeY(nodoFin), Color.GREEN);
    }



}



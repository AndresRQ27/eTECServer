package Grafo.General;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andres on 16/06/17.
 * eTECServer
 * Grafo.General
 */
public class Listas {
    public static final List<Tipos> listaTipos = new ArrayList();
    public static final List<Aristas> listaAristas = new ArrayList();

    private Listas() {
    }

    public static class Aristas {

        int nodo1;
        int nodo2;
        int tiempo;
        String peligrosidad;

        public Aristas(int nodo1, int nodo2, int tiempo, String peligrosidad){
            this.nodo1 = nodo1;
            this.nodo2 = nodo2;
            this.tiempo = tiempo;
            this.peligrosidad = peligrosidad;
        }
    }
}

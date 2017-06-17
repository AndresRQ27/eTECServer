package Grafo.Clases;

/**
 * Created by Melany on 15/06/2017.
 * eTECServer
 * ${PACKAGE_NAME}
 */
public class Grafo {

    private final int[][] mCoeficiente = new int [51][51];
    private final int[][] mAdyacencia  = new int [51][51];
    private final String[][] nCoeficiente  = new String [51][51];
    private final int[] cordeX  = new int [51];
    private final int[] cordeY  = new int [51];
    private final int[] nombre  = new int [51];
    private int enArbol [];



    public Grafo(){

    }

    public int getmCoeficiente(int i, int j ) {
        return mCoeficiente[i][j];
    }

    public int getmAdyacencia(int i,int j) {
        return mAdyacencia[i][j];
    }

    public int getCordeX(int i) {
        return cordeX[i];
    }

    public int getCordeY(int i) {
        return cordeY[i];
    }

    public int getNombre(int i) {
        return nombre[i];
    }

    public int getEnArbol(int i) {
        return enArbol[i];
    }

    public void setmCoeficiente(int i,int j ,int mCoeficiente) {
        this.mCoeficiente[i][j] = mCoeficiente;
    }

    public void setmAdyacencia(int i,int j ,int mAdyacencia) {
        this.mAdyacencia[i][j] = mAdyacencia;
    }

    public void setCordeX(int i,int cordeX) {
        this.cordeX[i] = cordeX;
    }

    public void setCordeY(int i, int cordeY) {
        this.cordeY[i] = cordeY;
    }

    public void setNombre(int i,int nombre) {
        this.nombre[i] = nombre;
    }

    public void setEnArbol(int i,int enArbol) {
        this.enArbol[i] = enArbol;
    }
    public void crearEnArbol(int i){
        enArbol = new int [i];
    }

    public String getnCoeficiente(int i, int j) {
        return nCoeficiente[i][j];
    }

    public void setnCoeficiente(int i, int j, String nCoeficiente){
        this.nCoeficiente[i][j] = nCoeficiente;
    }
}



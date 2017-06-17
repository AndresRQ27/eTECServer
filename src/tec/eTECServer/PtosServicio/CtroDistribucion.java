package tec.eTECServer.PtosServicio;

import java.util.LinkedList;
import java.util.List;

public class CtroDistribucion {

    private int id;
    public static List<CtroDistribucion> listaCentros = new LinkedList<>();

    public CtroDistribucion(int tope) {
        this.id = tope;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

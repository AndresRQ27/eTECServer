package Grafo.General;

import java.awt.*;

/**
 * Created by andres on 16/06/17.
 * eTECServer
 * PACKAGE_NAME
 */
public enum Tipos {
    CENTRO_DE_DISTRIBUCION, GASOLINERA, TIENDA;

    public static Color getColorCentro(){
        return Color.BLUE;
    }
    public static Color getColorTienda(){
        return Color.RED;
    }
    public static Color getColorGasolinera(){
        return Color.YELLOW;
    }

    public static Color getColor(Tipos tipos){
        switch (tipos){
            case TIENDA:
                return getColorTienda();

            case GASOLINERA:
                return getColorGasolinera();

            case CENTRO_DE_DISTRIBUCION:
                return getColorCentro();
        }
        return null;
    }
}

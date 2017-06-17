package Grafo.Clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


/**
 * Created by Melany on 15/06/2017.
 * eTECServer
 * ${PACKAGE_NAME}
 */
public class Pintar {

    public Pintar() {

    }

    public static void pintarCirculo(Graphics g,int x,int y,String n, Color color){
        //g.drawOval(x, y-10, 20, 20);
        g.setColor(color);
        ((Graphics2D)g).setStroke(new BasicStroke(4));//leda el grosor al circulo
        g.fillOval(x, y, 15, 15);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 15, 15);

        g.setColor(Color.BLACK);
        Font fuente=new Font("Monospaced",Font.BOLD, 16);
        g.setFont(fuente);
        g.drawString(n, x, y);

    }

    public static void pintarLinea(Graphics g, int x1,int y1,int x2,int y2,int tam, String peligr){
        int xAux = 0; int yAux = 0;
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);
        g.drawLine(x1+10, y1+10, x2+10, y2+10);
        if(x1<=x2)
            xAux=((x2-x1)/2)+x1;
        if(x1>x2)
            xAux=((x1-x2)/2)+x2;
        if(y1<y2)
            yAux=((y2-y1)/2)+y1;
        if(y1>=y2)
            yAux=((y1-y2)/2)+y2;
        // ((Graphics2D)g).setColor(Color.black);
        Font fuente=new Font("Monospaced",Font.PLAIN, 15);
        g.setFont(fuente);
        g.drawString(String.valueOf(tam)+"-"+peligr, xAux, yAux);
    }
    public static void pintarCamino(Graphics g, int x1,int y1,int x2,int y2, Color color){
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1+10, y1+10, x2+10, y2+10);
        //g.drawString(String.valueOf(tam), x1, y1);
    }
    public static void clickSobreNodo(Graphics g, int x, int y, Color co){
        //g.drawOval(x, y-10, 20, 20);
        g.setColor(co);
        ((Graphics2D)g).setStroke(new BasicStroke(4));//le da el grosor al circulo
        g.fillOval(x, y, 15, 15);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 15, 15);

    }
}



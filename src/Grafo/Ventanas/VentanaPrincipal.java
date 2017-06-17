package Grafo.Ventanas;

import Grafo.Clases.Grafo;
import Grafo.Clases.Pintar;
import Grafo.Clases.Algoritmo_Dijkstra;
import Grafo.Clases.Algoritmo_Prim;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Created by Melany on 15/06/2017.
 * eTECServer
 * ${PACKAGE_NAME}
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPincipal
     */
    private final Pintar pintar =new Pintar();
    private final Grafo grafo = new Grafo();
    public static void R_repaint(int tope, Grafo grafo){//pinta lo que esta antes en el panel
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if(grafo.getmAdyacencia(j, k) == 1)
                    Pintar.pintarLinea(jPanel1.getGraphics(),grafo.getCordeX(j),grafo.getCordeY(j), grafo.getCordeX(k), grafo.getCordeY(k),grafo.getmCoeficiente(j, k));
            }
        }
        for (int j = 0; j < tope; j++)
            Pintar.pintarCirculo(jPanel1.getGraphics(), grafo.getCordeX(j),grafo.getCordeY(j),String.valueOf(grafo.getNombre(j)));

    }

    public static int ingresarNodoOrigen(String nodoOrige, String noExiste,int tope){
        int nodoOrigen = -1;
        try{
            nodoOrigen = Integer.parseInt(JOptionPane.showInputDialog(""+nodoOrige));
            if(nodoOrigen>=tope){
                JOptionPane.showMessageDialog(null,""+noExiste+"\nDebe de ingresar  un Nodo existente");
                nodoOrigen = ingresarNodoOrigen(nodoOrige,noExiste, tope);
            } else {

            }
        }catch(Exception ex){
            JOptionPane.getRootFrame().dispose();
        }
        return nodoOrigen;
    }
    private int ingresarTamano(String tama){
        int tamano;
        try{
            tamano = Integer.parseInt(JOptionPane.showInputDialog(""+tama));
            if(tamano<1){ JOptionPane.showMessageDialog(null,"Debe Ingresar un Tamaño Aceptado..");
                tamano = ingresarTamano(tama);//no es nesario hacer esto
            }
        }catch(Exception ex){
            tamano = ingresarTamano(tama);
        }
        return tamano;
    }
    private boolean clickDerechoSobreNodo(int xxx, int yyy, int clickCount){

        for (int j = 0; j < tope; j++) {// consultamos si se ha sado  click sobre algun nodo
            if((xxx+2) > grafo.getCordeX(j) && xxx < (grafo.getCordeX(j)+13) && (yyy+2) > grafo.getCordeY(j) && yyy<(grafo.getCordeY(j)+13) ) {
                if (clickCount !=2) {

                    if (n == 0) {
                        id = j;
                        R_repaint(tope, grafo);
                        Pintar.clickSobreNodo(jPanel1.getGraphics(), grafo.getCordeX(j), grafo.getCordeY(j), null, Color.orange);
                        n++;
                    } else {
                        id2 = j;
                        n++;
                        Pintar.clickSobreNodo(jPanel1.getGraphics(), grafo.getCordeX(j), grafo.getCordeY(j), null, Color.orange);
                        if (id == id2) {// si id == id2 por q se volvio a dar click sobre el mismos nodo, se cancela el click anterio
                            n = 0;
                            Pintar.pintarCirculo(jPanel1.getGraphics(), grafo.getCordeX(id), grafo.getCordeY(id), String.valueOf(grafo.getNombre(id)));
                            id = -1;
                            id2 = -1;
                        }
                    }
                }
                nn=0;
                return true;
            }
        }
        return false;
    }
    private void clickIzqSobreNodo(int xxx, int yyy){
        for (int j = 0; j <tope; j++) {
            if((xxx+2) > grafo.getCordeX(j) && xxx < (grafo.getCordeX(j)+13) && (yyy+2) > grafo.getCordeY(j) && yyy<(grafo.getCordeY(j)+13) ) {
                if(nn==0){
                    permanente =j;
                    R_repaint(tope, grafo);
                }
                else{ nodoFin = j;}
                nn++;
                n=0;
                id =-1;
                Pintar.clickSobreNodo(jPanel1.getGraphics(), grafo.getCordeX(j), grafo.getCordeY(j), null,Color.GREEN);
                break;
            }

        }


    }
    private void adaptarImagen(File file){
        try{

            BufferedImage read = ImageIO.read(file);
            Image scaledInstance = read.getScaledInstance(jmapa.getWidth(),jmapa.getHeight(), Image.SCALE_DEFAULT);

            jmapa.setIcon(new ImageIcon(scaledInstance));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al cargar la imagen");
        }
    }


    public VentanaPrincipal() {
        initComponents();
        jPanel2.setVisible(false);
        jDialog1.setLocationRelativeTo(null);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jmapa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jDialog1.setMaximumSize(new java.awt.Dimension(700, 450));
        jDialog1.setMinimumSize(new java.awt.Dimension(700, 450));
        jDialog1.setPreferredSize(new java.awt.Dimension(700, 450));
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(null);

        jFileChooser2.setMaximumSize(new java.awt.Dimension(21475, 21474));
        jFileChooser2.addActionListener(evt -> jFileChooser2ActionPerformed(evt));
        jDialog1.getContentPane().add(jFileChooser2);
        jFileChooser2.setBounds(10, 20, 670, 390);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("eTECServer Grafo Painter");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(142, 35, 35)));
        jPanel1.setMinimumSize(new java.awt.Dimension(770, 522));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mousePressed(java.awt.event.MouseEvent e) {

                jPanel1MousePressed(e);

            }
        });

        jPanel1.setLayout(null);
        jPanel1.add(jmapa);
        jmapa.setBounds(10, 10, 750, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 10, 770, 520);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        jButton1.setText("Guardar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        getContentPane().add(jButton1);
        jButton1.setBounds(30, 110, 150, 50);

        jButton2.setText("Guarda & Salir");
        jButton2.addActionListener(this::jButton1ActionPerformed);

        getContentPane().add(jButton2);
        jButton2.setBounds(30, 210, 150, 50);

        jButton3.setText("Salir");
        jButton3.addActionListener(this::jButton1ActionPerformed);

        getContentPane().add(jButton3);
        jButton3.setBounds(30, 310, 150, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 40, 130, 130);

        jMenu1.setText("Archivos");
        jMenu1.add(jSeparator1);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Camino Más Corto");
        jMenuItem13.addActionListener(evt -> jMenuItem13ActionPerformed(evt));
        jMenu1.add(jMenuItem13);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Recubrir");
        jMenuItem3.addActionListener(evt -> jMenuItem3ActionPerformed(evt));
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Nueva Arista");
        jMenuItem2.addActionListener(evt -> jMenuItem2ActionPerformed(evt));
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem5.setText("Matriz De coeficiente");
        jMenuItem5.addActionListener(evt -> jMenuItem5ActionPerformed(evt));
        jMenu1.add(jMenuItem5);

        jMenuItem7.setText("Matiz De adyacencia");
        jMenuItem7.addActionListener(evt -> jMenuItem7ActionPerformed(evt));
        jMenu1.add(jMenuItem7);

        jMenu1.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Cargar Mapa");
        jMenuItem6.addActionListener(evt -> jMenuItem6ActionPerformed(evt));
        jMenu1.add(jMenuItem6);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Cargar Grafo");
        // TODO cargar archivo xml
        jMenuItem1.addActionListener(evt -> jMenuItem1ActionPerformed(evt));
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator5);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Salir");
        jMenuItem8.addActionListener(this::jMenuItem8ActionPerformed);
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Eliminar");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setText("Eliminar Nodo");
        jMenuItem10.addActionListener(evt -> jMenuItem10ActionPerformed(evt));
        jMenu2.add(jMenuItem10);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Eliminar Arista");
        jMenuItem9.addActionListener(evt -> jMenuItem9ActionPerformed(evt));
        jMenu2.add(jMenuItem9);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Eliminar Todas Las Arsitas ");
        jMenuItem11.addActionListener(evt -> jMenuItem11ActionPerformed(evt));
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem12.setText("Color");
        jMenuItem12.addActionListener(evt -> jMenuItem12ActionPerformed(evt));

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1012, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        int xxx, yyy;
        xxx=evt.getX();
        yyy=evt.getY();
        if(evt.isMetaDown()){
            clickIzqSobreNodo(xxx, yyy );
            if(nn==2){
                nn=0;
                Algoritmo_Dijkstra Dijkstra = new Algoritmo_Dijkstra(grafo,tope,permanente, nodoFin);
                Dijkstra.dijkstra();
            }
        }
        else{
            if(!clickDerechoSobreNodo(xxx,yyy,evt.getClickCount()) && evt.getClickCount()==2){// si  click sobre nodo es falso entra
                if(tope<50){
                    grafo.setCordeX(tope,xxx);
                    grafo.setCordeY(tope,yyy);
                    grafo.setNombre(tope, tope);

                    String[] possibleValues = { "Tienda", "Gasolinera", "Centro de Distribución" };
                    String selectedValue = (String) JOptionPane.showInputDialog(null,
                            "Choose one", "Input",
                            JOptionPane.INFORMATION_MESSAGE, null,
                            possibleValues, possibleValues[0]);

                    Pintar.pintarCirculo(jPanel1.getGraphics(),grafo.getCordeX(tope), grafo.getCordeY(tope),String.valueOf(grafo.getNombre(tope)));
                    tope++;
                }
                else JOptionPane.showMessageDialog(null,"Se ha llegado al Maximo de nodos..");
            }
            if(n==2){
                n=0;
                int  ta = ingresarTamano("Ingrese Tamaño");
                if(aristaMayor < ta) aristaMayor=ta;
                grafo.setmAdyacencia(id2, id, 1);
                grafo.setmAdyacencia(id, id2, 1);
                grafo.setmCoeficiente(id2, id,ta );
                grafo.setmCoeficiente(id, id2, ta);
                Pintar.pintarLinea(jPanel1.getGraphics(),grafo.getCordeX(id), grafo.getCordeY(id), grafo.getCordeX(id2), grafo.getCordeY(id2), ta);
                Pintar.pintarCirculo(jPanel1.getGraphics(),grafo.getCordeX(id), grafo.getCordeY(id),String.valueOf(grafo.getNombre(id)));
                Pintar.pintarCirculo(jPanel1.getGraphics(),grafo.getCordeX(id2), grafo.getCordeY(id2),String.valueOf(grafo.getNombre(id2)));
                id=-1;
                id2=-1;
            }
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed

    }//GEN-LAST:event_jMenuItem4MousePressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //jMenuItem2.setEnabled(false);
        jPanel1.paint(jPanel1.getGraphics());
        n=0;
        id=-1;
        id2=-1;
        int Matriz[][]={{0,1,0,1,1,0,0,1},
                {1,0,1,0,0,0,0,0},
                {0,1,0,1,1,0,0,0},
                {1,0,1,0,0,0,0,0},
                {1,0,1,0,0,1,0,0},
                {0,0,0,0,1,0,1,1},
                {0,0,0,0,0,1,0,0},
                {1,0,0,0,0,1,0,0}
        };
        int coe[][]={{0,50,0,46,216,0,0,578},
                {50,0,59,0,0,0,0,0},
                {0,59,0,89,174,0,0,0},
                {46,0,89,0,0,0,0,0},
                {216,0,174,0,0,471,0,0} ,
                {0,0,0,0,471,0,194,398},
                {0,0,0,0,0,194,0,0},
                {578,0,0,0,0,398,0,0},

        };
        int xx1[]={202,102,8,198,248,352,481,416};
        int yy1[]={12,74,165,113,233,300,368,177};
        int nom[]={0,1,2,3,4,5,6,7};
        aristaMayor=600;
        for (int j = 0; j < 8; j++) {
            grafo.setCordeX(j, xx1[j]);
            grafo.setCordeY(j, yy1[j]);
            grafo.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 8; j++) {
            for (int k = 0; k < 8; k++) {
                grafo.setmAdyacencia(j,k, Matriz[j][k]);
                grafo.setmCoeficiente(j, k, coe[j][k]);
            }
        }
        tope=8;
        R_repaint(tope,grafo);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(tope<1)
            JOptionPane.showMessageDialog(null,"Aun no se ha creado Un nodo");
        else{
            Algoritmo_Prim Prim = new Algoritmo_Prim(grafo,tope, aristaMayor);
            Prim.prim();
            jtacumulado.setText(""+Prim.getCumulado());
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if(tope==0)
            JOptionPane.showMessageDialog(null,"Aun no se ha credo un nodo : ");

        else{
            this.setEnabled(false);
            new Matrices(tope,grafo,2,this).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if(tope==0)
            JOptionPane.showMessageDialog(null,"Aun no se ha credo un nodo : ");

        else{
            this.setEnabled(false);
            new Matrices(tope,grafo,1,this).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(tope<=1)
            JOptionPane.showMessageDialog(null,"Cree nuevo nodo : ");

        else{
            this.setEnabled(false);
            new VentanaArista(grafo,pintar,tope,this).setVisible(true);
            jPanel1.paint(jPanel1.getGraphics());
            R_repaint(tope,grafo);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed


        for (int j = 0; j < tope; j++) {
            grafo.setCordeX(j,0);
            grafo.setCordeY(j,0);
            grafo.setNombre(j,0);
        }
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                grafo.setmAdyacencia(j, k, 0);
                grafo.setmCoeficiente(j, k, 0);
            }
        }
        tope= 0;
        jPanel1.repaint();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if(tope>=2){
            this.setEnabled(false);
            new EliminarAristas(pintar,grafo,tope,this).setVisible(true);
            jPanel1.paint(jPanel1.getGraphics());
            R_repaint(tope,grafo);
        }
        else  JOptionPane.showMessageDialog(null,"No Hay Nodos Enlazados... ");

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        int Eliminar= ingresarNodoOrigen("Ingrese Nodo a Eliminar ","Nodo No existe",tope);
        if(Eliminar<=tope && Eliminar>=0 && tope>0){
            for (int j = 0; j < tope; j++) {
                for (int k = 0; k < tope; k++){
                    if(j==Eliminar ||k==Eliminar){
                        grafo.setmAdyacencia(j, k, -1);
                    }
                }
            }
            for (int l = 0; l < tope-1; l++) {
                for (int m = 0; m < tope; m++) {
                    if(grafo.getmAdyacencia(l, m)==-1){
                        grafo.setmAdyacencia(l, m,grafo.getmAdyacencia(l+1, m));
                        grafo.setmAdyacencia(l+1, m,-1);
                        grafo.setmCoeficiente(l, m,grafo.getmCoeficiente(l+1, m));
                    }
                }
            }
            for (int l = 0; l < tope; l++) {
                for (int m = 0; m < tope-1; m++) {

                    if(grafo.getmAdyacencia(l, m)==-1){
                        grafo.setmAdyacencia(l, m,grafo.getmAdyacencia(l, m+1));
                        grafo.setmAdyacencia(l, m+1,-1);
                        grafo.setmCoeficiente(l, m,grafo.getmCoeficiente(l, m+1));

                    }
                }
            }

            grafo.setCordeX(Eliminar,-10);
            grafo.setCordeY(Eliminar,-10);
            grafo.setNombre(Eliminar, -10);
            for (int j = 0; j < tope; j++) {
                for (int k = 0; k < tope-1; k++) {
                    if(grafo.getCordeX(k)==-10){
                        grafo.setCordeX(k, grafo.getCordeX(k+1));
                        grafo.setCordeX(k+1, -10);
                        grafo.setCordeY(k, grafo.getCordeY(k+1));
                        grafo.setCordeY(k+1, -10);
                        grafo.setNombre(k, grafo.getNombre(k+1));
                        grafo.setNombre(k+1,-10);
                    }
                }
            }
            for (int j = 0; j < tope; j++)
                grafo.setNombre(j,j);// renombramos

            // eliminamos los -1 y  los -10
            for (int j = 0; j < tope+1; j++) {
                for (int k = 0; k < tope+1; k++) {
                    if( grafo.getmAdyacencia(j, k)!=-1)
                        grafo.setmAdyacencia(j, k, grafo.getmAdyacencia(j, k));
                    else
                        grafo.setmAdyacencia(j, k, 0);
                    if(grafo.getmCoeficiente(j, k) !=-10)
                        grafo.setmCoeficiente(j, k, grafo.getmCoeficiente(j, k));
                    else
                        grafo.setmCoeficiente(j, k, 0);
                }
            }
            tope--;
            jPanel1.paint(jPanel1.getGraphics());
            R_repaint(tope,grafo);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                grafo.setmAdyacencia(j, k, 0);
                grafo.setmAdyacencia(k, j, 0);
                grafo.setmCoeficiente(j, k, 0);
                grafo.setmCoeficiente(k, j, 0);
            }
        }
        jPanel1.paint(jPanel1.getGraphics());
        R_repaint(tope,grafo);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jPanel2.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        jPanel2.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        if(tope>=2){
            permanente =  ingresarNodoOrigen("Ingrese Nodo Origen..","nodo Origen No existe",tope);// hacemos el llamano de la funcion
            nodoFin =  ingresarNodoOrigen("Ingrese Nodo Fin..","nodo fin No existe",tope);
            Algoritmo_Dijkstra Dijkstra = new Algoritmo_Dijkstra(grafo,tope,permanente,nodoFin);
            Dijkstra.dijkstra();
        }
        else JOptionPane.showMessageDialog(null,"Se deben de crear mas nodos ... ");
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jtacumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtacumuladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtacumuladoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jDialog1.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed

        JFileChooser selectorArchios = (JFileChooser) evt.getSource();
        String comando = evt.getActionCommand();
        if(comando.equals(JFileChooser.APPROVE_SELECTION)){
            File archiSeleccionado = selectorArchios.getSelectedFile();
            adaptarImagen(archiSeleccionado);
            jDialog1.setVisible(false);
            //JOptionPane.showMessageDialog(null, ""+archiSeleccionado+"  nOMBRE"+archiSeleccionado.getName());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }
    private int tope=0;// lleva el # de nodos creado
    private int nodoFin;
    private int permanente;
    private int n=0;
    private int nn=0;
    private int id;
    private int id2;// permite controlar que se halla dado click sobre un nodo
    private int aristaMayor;





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private JFileChooser jFileChooser2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel jmapa;
    private javax.swing.JTextField jtacumulado;
    // End of variables declaration//GEN-END:variables
}


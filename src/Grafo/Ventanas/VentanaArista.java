package Grafo.Ventanas;

import Grafo.Clases.Grafo;
import Grafo.Clases.Pintar;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 * Created by Melany on 15/06/2017.
 * eTECServer
 * ${PACKAGE_NAME}
 */
class VentanaArista extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private final Pintar pintar ;
    private final Grafo grafos ;
    private final Frame frame1;
    public VentanaArista(Grafo grafos,Pintar pinta ,int I,Frame frame){
        this.pintar =pinta;
        this.grafos=grafos;
        this.i=I;
        frame1 = frame;

        initComponents();



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel panel = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        tm = new javax.swing.JTextField();
        pe = new javax.swing.JTextField();
        javax.swing.JButton jButton1 = new javax.swing.JButton();

        setTitle("::Crear::");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Arista"));
        panel.setLayout(null);

        jLabel1.setText("Digite el Nodo 1");
        panel.add(jLabel1);
        jLabel1.setBounds(10, 30, 270, 20);

        jLabel2.setText("Digite el Nodo 2");
        panel.add(jLabel2);
        jLabel2.setBounds(10, 80, 270, 20);

        jLabel3.setText("Digite el Tiempo");
        panel.add(jLabel3);
        jLabel3.setBounds(10, 130, 270, 20);

        jLabel4.setText("Escriba la Peligrosidad");
        panel.add(jLabel4);
        jLabel4.setBounds(10, 180, 270, 20);

        n1.addActionListener(this::n1ActionPerformed);
        n1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                n1KeyPressed(evt);
            }
            public void keyReleased(KeyEvent evt) {
                n1KeyReleased(evt);
            }
        });
        panel.add(n1);
        n1.setBounds(450, 30, 100, 20);

        n2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                n2KeyReleased(evt);
            }
        });
        panel.add(n2);
        n2.setBounds(450, 80, 100, 20);

        tm.addActionListener(this::tmActionPerformed);
        tm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                tmKeyReleased(evt);
            }
        });
        panel.add(tm);
        tm.setBounds(450, 130, 100, 20);

        panel.add(pe);
        pe.setBounds(450, 180, 100, 20);

        getContentPane().add(panel);
        panel.setBounds(10, 10, 565, 230);

        jButton1.setText("Trazar");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 270, 90, 23);

        setBounds(160, 180, 583, 309);
    }// </editor-fold>//GEN-END:initComponents

    private void peActionPerformed(ActionEvent actionEvent) {

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x;int y;int ta;
        if(n1.getText().length()<1 || n2.getText().length()<1 ||tm.getText().length()<1)
            JOptionPane.showMessageDialog(null,"Error.. Faltan datos : ");
        else{
            x=Integer.parseInt(n1.getText());
            y=Integer.parseInt(n2.getText());
            ta=Integer.parseInt(tm.getText());

            if(x==y)
                JOptionPane.showMessageDialog(null,"Error.. Debe digitar un nodo diferente a : "+y);
            else if(x<0 || x>=i || y<0 || y>=i){
                JOptionPane.showMessageDialog(null,"Error.. Nodos No validos ");
            }else{
                grafos.setmAdyacencia(x, y, 1);
                grafos.setmAdyacencia(y, x, 1);
                grafos.setmCoeficiente(x, y, ta);
                grafos.setmCoeficiente(y, x, ta);
                grafos.setnCoeficiente(x, y, pe.getText());
                grafos.setnCoeficiente(y, x, pe.getText());
                n1.setText(null);
                n2.setText(null);
                tm.setText(null);
                pe.setText(null);
                Pintar.pintarLinea(VentanaPrincipal.jPanel1.getGraphics(),grafos.getCordeX(x), grafos.getCordeY(x), grafos.getCordeX(y), grafos.getCordeY(y), ta, pe.getText());

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void n1KeyReleased(KeyEvent evt) {//GEN-FIRST:event_n1KeyReleased
        String tem = n1.getText();
        StringBuilder tem2= new StringBuilder();
        for (int j = 0; j < tem.length(); j++) {
            if(Character.isDigit(tem.charAt(j))){
                tem2.append(tem.charAt(j));
            }
        }
        n1.setText(""+tem2);
    }//GEN-LAST:event_n1KeyReleased

    private void n1KeyPressed(KeyEvent evt) {//GEN-FIRST:event_n1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1KeyPressed

    private void n2KeyReleased(KeyEvent evt) {//GEN-FIRST:event_n2KeyReleased
        String tem = n2.getText();
        StringBuilder tem2= new StringBuilder();
        for (int j = 0; j < tem.length(); j++) {
            if(Character.isDigit(tem.charAt(j))){
                tem2.append(tem.charAt(j));
            }
        }
        n2.setText(""+tem2);        // TODO add your handling code here:
    }//GEN-LAST:event_n2KeyReleased

    private void tmKeyReleased(KeyEvent evt) {//GEN-FIRST:event_tmKeyReleased
        String tem = tm.getText();
        StringBuilder tem2= new StringBuilder();
        for (int j = 0; j < tem.length(); j++) {
            if(Character.isDigit(tem.charAt(j))){
                tem2.append(tem.charAt(j));
            }
        }
        tm.setText(""+tem2);
    }//GEN-LAST:event_tmKeyReleased

    private void tmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmActionPerformed
    }//GEN-LAST:event_tmActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
    }//GEN-LAST:event_n1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frame1.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | javax.swing.UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaArista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // new VentanaArista().setVisible(true);
        });
    }
    private int i=0;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField tm;
    private javax.swing.JTextField pe;
    // End of variables declaration//GEN-END:variables
}


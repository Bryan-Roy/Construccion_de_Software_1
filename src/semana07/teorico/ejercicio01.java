/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07.teorico;

import java.util.ArrayList;

/**
 *
 * @author BRYANROY
 */
public class ejercicio01 extends javax.swing.JFrame {

    /**
     * Creates new form Ejemplo01
     */
    ArrayList<Double> lista;
//    double acumulador;
//    double contador;
    public ejercicio01() {
        initComponents();
        lista=new ArrayList<>();
//        acumulador=0.0;
//        contador=0.0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblnotas = new javax.swing.JLabel();
        txtnotas = new javax.swing.JTextField();
        bntguardar = new javax.swing.JButton();
        gtnmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txanotas = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblnrdenotas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblpromedio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnotas.setText("Notas");
        getContentPane().add(lblnotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 40, 20));

        txtnotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnotasActionPerformed(evt);
            }
        });
        getContentPane().add(txtnotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 260, -1));

        bntguardar.setText("Guardar");
        bntguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntguardarActionPerformed(evt);
            }
        });
        getContentPane().add(bntguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        gtnmostrar.setText("Mostrar");
        gtnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtnmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(gtnmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        txanotas.setColumns(20);
        txanotas.setRows(5);
        jScrollPane1.setViewportView(txanotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 350, 130));

        jLabel1.setText("Nro Notas:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        lblnrdenotas.setText("0");
        getContentPane().add(lblnrdenotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel3.setText("Promedio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        lblpromedio.setText("0.0");
        getContentPane().add(lblpromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnotasActionPerformed
        // TODO add your handling code here:
        if(txanotas.getText()!=null){
            
        }
    }//GEN-LAST:event_txtnotasActionPerformed

    private void bntguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntguardarActionPerformed
        // TODO add your handling code here:
        try{
            double a=Double.parseDouble(txtnotas.getText());
        lista.add(a);
//        contador++;
        txtnotas.setText("");
        txtnotas.requestFocus();
        lblnrdenotas.setText(String.valueOf(lista.size()));
        }catch(NumberFormatException e){
            e.getStackTrace();
        }
    }//GEN-LAST:event_bntguardarActionPerformed

    private void gtnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtnmostrarActionPerformed
        // TODO add your handling code here:
        txanotas.setText(cadnumero());
        double promedio=acunumero()/lista.size();
        lblpromedio.setText(String.valueOf(promedio));
    }//GEN-LAST:event_gtnmostrarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio01().setVisible(true);
            }
        });
    }
    
    String cadnumero(){
        String cad="";
        for(Double i:lista){
            cad+=i+"\n";
        }
        return cad;
    }
    double acunumero(){
        double cad=0.0;
        for(Double i:lista){
            cad+=i;
        }
        return cad;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntguardar;
    private javax.swing.JButton gtnmostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblnotas;
    private javax.swing.JLabel lblnrdenotas;
    private javax.swing.JLabel lblpromedio;
    private javax.swing.JTextArea txanotas;
    private javax.swing.JTextField txtnotas;
    // End of variables declaration//GEN-END:variables
}
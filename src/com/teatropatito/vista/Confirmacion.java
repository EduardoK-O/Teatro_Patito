/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teatropatito.vista;

/**
 *
 * @author Acer notbook
 */
public class Confirmacion extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Confirmacion() {
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

        mesajeConfirmar = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(350, 250));
        setResizable(false);
        getContentPane().setLayout(null);

        mesajeConfirmar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mesajeConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mesajeConfirmar.setToolTipText("");
        getContentPane().add(mesajeConfirmar);
        mesajeConfirmar.setBounds(10, 20, 300, 72);

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teatropatito/controlador/fotos/aceptar.jpg"))); // NOI18N
        getContentPane().add(aceptar);
        aceptar.setBounds(20, 130, 110, 20);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teatropatito/controlador/fotos/Cancelar.jpg"))); // NOI18N
        getContentPane().add(cancelar);
        cancelar.setBounds(180, 130, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teatropatito/controlador/fotos/PatoteInicial.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-140, -50, 600, 320);

        setSize(new java.awt.Dimension(336, 255));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton aceptar;
    public javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel mesajeConfirmar;
    // End of variables declaration//GEN-END:variables
}

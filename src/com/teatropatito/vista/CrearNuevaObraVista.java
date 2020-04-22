/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teatropatito.vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import lu.tudor.santec.jtimechooser.JTimeChooser;

/**
 *
 * @author GCTec
 */
public class CrearNuevaObraVista extends javax.swing.JFrame {
// Holi boli. Samuel se la come.
    /**
     * Creates new form crear
     */
    public CrearNuevaObraVista() {
        initComponents();
        
    }

    public JTextField getPrecioDiamante() {
        return precioDiamante;
    }
    

    public JLabel getEtiquetaHoraFin() {
        return etiquetaHoraFin;
    }

    public JLabel getEtiquetaInicio() {
        return etiquetaInicio;
    }

    public JLabel getEtiquetaObra() {
        return etiquetaObra;
    }

    public JTable getTabla() {
        return Tabla;
    }
    public void setTabla(JTable nTabla){
        Tabla=nTabla;
    }
    
    public JLabel getFechaLbl() {
        return fechaLbl;
    }

    public JButton getGuardar() {
        return guardar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JButton getLimpiar() {
        return limpiar;
    }

    public JButton getRegresar() {
        return regresar;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        etiquetaObra = new javax.swing.JLabel();
        txtNombreObra = new javax.swing.JTextField();
        etiquetaInicio = new javax.swing.JLabel();
        etiquetaHoraFin = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        fechaLbl = new javax.swing.JLabel();
        horaFin = new lu.tudor.santec.jtimechooser.JTimeChooser();
        horaInicio = new lu.tudor.santec.jtimechooser.JTimeChooser();
        fecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        telefono = new javax.swing.JTextField();
        telefonoAlt = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        actores = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        quitar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        precioDiamante = new javax.swing.JTextField();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teatropatito/controlador/fotos/PatoteInicial.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        etiquetaObra.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        etiquetaObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teatropatito/controlador/fotos/NOMBRE.jpg"))); // NOI18N
        getContentPane().add(etiquetaObra);
        etiquetaObra.setBounds(20, 20, 110, 42);

        txtNombreObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreObraActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreObra);
        txtNombreObra.setBounds(160, 30, 290, 30);

        etiquetaInicio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        etiquetaInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teatropatito/controlador/fotos/INICIO.jpg"))); // NOI18N
        getContentPane().add(etiquetaInicio);
        etiquetaInicio.setBounds(310, 160, 110, 50);

        etiquetaHoraFin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        etiquetaHoraFin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teatropatito/controlador/fotos/FIN.jpg"))); // NOI18N
        getContentPane().add(etiquetaHoraFin);
        etiquetaHoraFin.setBounds(580, 160, 110, 50);

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teatropatito/controlador/fotos/aceptar.jpg"))); // NOI18N
        getContentPane().add(guardar);
        guardar.setBounds(960, 480, 108, 41);

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teatropatito/controlador/fotos/LIMPIAR.jpg"))); // NOI18N
        getContentPane().add(limpiar);
        limpiar.setBounds(740, 480, 106, 40);

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teatropatito/controlador/fotos/Regresar.jpg"))); // NOI18N
        getContentPane().add(regresar);
        regresar.setBounds(850, 480, 111, 40);

        fechaLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fechaLbl.setText("Fecha: ");
        getContentPane().add(fechaLbl);
        fechaLbl.setBounds(20, 160, 100, 50);

        horaFin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(horaFin);
        horaFin.setBounds(720, 170, 130, 40);

        horaInicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(horaInicio);
        horaInicio.setBounds(430, 170, 130, 40);
        getContentPane().add(fecha);
        fecha.setBounds(120, 170, 170, 40);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "minuto inicio","hora de inicio","minuto de final", "hora de final",
                "dia", "mes", "año"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 220, 1030, 240);
        getContentPane().add(telefono);
        telefono.setBounds(100, 80, 100, 22);

        telefonoAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoAltActionPerformed(evt);
            }
        });
        getContentPane().add(telefonoAlt);
        telefonoAlt.setBounds(350, 80, 100, 22);

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        getContentPane().add(correo);
        correo.setBounds(100, 120, 100, 22);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 150, 1070, 10);

        jLabel2.setText("telefono");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 46, 16);

        jLabel3.setText("telefono Alt.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 80, 69, 16);

        jLabel4.setText("correo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 37, 16);
        getContentPane().add(descripcion);
        descripcion.setBounds(580, 30, 430, 60);

        jLabel6.setText("descripción");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 40, 70, 16);

        jLabel7.setText("actores");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 110, 60, 16);
        getContentPane().add(actores);
        actores.setBounds(580, 100, 430, 40);

        agregar.setText("agregar Horario");
        getContentPane().add(agregar);
        agregar.setBounds(910, 160, 140, 25);

        quitar.setText("quitar Horario");
        getContentPane().add(quitar);
        quitar.setBounds(910, 190, 140, 25);

        jLabel5.setText("Precio Diamante");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 120, 100, 16);
        getContentPane().add(precioDiamante);
        precioDiamante.setBounds(360, 120, 90, 22);

        setSize(new java.awt.Dimension(1106, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreObraActionPerformed

    private void telefonoAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoAltActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    public JTextField getActores() {
        return actores;
    }

    public JButton getAgregar() {
        return agregar;
    }

    public JTextField getCorreo() {
        return correo;
    }

    public JTextField getDescripcion() {
        return descripcion;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JButton getQuitar() {
        return quitar;
    }

    public JTextField getTelefono() {
        return telefono;
    }

    public JTextField getTelefonoAlt() {
        return telefonoAlt;
    }

    
    
    
    public JTextField getTxtNombreObra() {
        return txtNombreObra;
    }

    public void setTxtNombreObra(JTextField txtNombreObra) {
        this.txtNombreObra = txtNombreObra;
    }

    public JTimeChooser getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(JTimeChooser horaFin) {
        this.horaFin = horaFin;
    }

    public JTimeChooser getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(JTimeChooser horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setFecha(JDateChooser fechaa){
        this.fecha = fecha;
    }
    
    public JDateChooser getFecha(){
        return fecha;
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(CrearNuevaObraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearNuevaObraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearNuevaObraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearNuevaObraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNuevaObraVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField actores;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel etiquetaHoraFin;
    private javax.swing.JLabel etiquetaInicio;
    private javax.swing.JLabel etiquetaObra;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JButton guardar;
    private lu.tudor.santec.jtimechooser.JTimeChooser horaFin;
    private lu.tudor.santec.jtimechooser.JTimeChooser horaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField precioDiamante;
    private javax.swing.JButton quitar;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField telefonoAlt;
    private javax.swing.JTextField txtNombreObra;
    // End of variables declaration//GEN-END:variables
}
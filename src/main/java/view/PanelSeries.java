/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Alumno
 */
public class PanelSeries extends javax.swing.JPanel {

    /**
     * Creates new form PanelPeliculas
     */
    public PanelSeries() {
        initComponents();
    }
    public JLabel getlblTitulo() {
        return lblTitulo;
    }

    public JLabel getlblDirector() {
        return lblDirector;
    }

    public JLabel gettxtResumen() {
        return txtResumen;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtResumen = new javax.swing.JLabel();
        botonBorrar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonMensaje = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Titulo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 59, 31));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Director:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 43, 74, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Resumen:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 83, 31));
        jPanel1.add(lblDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 344, 31));
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 344, 31));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 26, 344, 31));

        txtResumen.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 670, 90));

        botonBorrar.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.add(botonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 45, 45));

        botonActualizar.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 65, 45, 45));

        botonMensaje.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.add(botonMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 45, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonMensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel txtResumen;
    // End of variables declaration//GEN-END:variables
}

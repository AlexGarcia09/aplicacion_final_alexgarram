/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import controller.BorrarUtil;
import controller.listarPeliculasUtil;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import model.Peliculas;
import model.Resenas;

/**
 *
 * @author Alumno
 */
public class PanelResenaA extends javax.swing.JPanel {
    private int idresena;
    /**
     * Creates new form PanelPeliculas
     */
    public PanelResenaA(int idresena) {
        initComponents();
         this.idresena = idresena;
        botonBorrar.setIcon(new FlatSVGIcon("img/borrar.svg",35,35));
       
    }
    public JLabel getlblTitulo() {
        return lblTitulo;
    }

    public JLabel getlblValoracion() {
        return lblValoracion;
    }

    public JLabel gettxtResumen() {
        return txtcomentario;
    }
    public JLabel gettxtfecha() {
        return txtfecha;
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
        lblValoracion = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcomentario = new javax.swing.JLabel();
        botonBorrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Titulo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 59, 31));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Valoracion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 43, 90, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Comentario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 117, 130, 31));

        lblValoracion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblValoracion.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        jPanel1.add(lblValoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 43, 344, 31));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTitulo.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 5, 344, 31));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 26, 344, 31));

        txtcomentario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtcomentario.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        txtcomentario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtcomentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 122, 870, 30));

        botonBorrar.setBackground(new java.awt.Color(255, 51, 51));
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 45, 45));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 0, 3, 180));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Fecha:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 83, 31));

        txtfecha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtfecha.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        txtfecha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 85, 490, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
   int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres borrar esta reseña?", "Confirmar borrado", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            BorrarUtil util = new BorrarUtil();
            util.borrarResenaPorId(idresena);
        }
    }//GEN-LAST:event_botonBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValoracion;
    private javax.swing.JLabel txtcomentario;
    private javax.swing.JLabel txtfecha;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ajustarImagen;
import java.awt.Color;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/**
 *
 * @author RAVEN
 */
public class SplashScreen extends javax.swing.JDialog {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ImageIcon icono = ajustarImagen.cargarYAjustarImagen("C:\\Users\\alexg\\Desktop\\Aplicacion_final\\src\\main\\resources\\img\\fondo.jpg", 1300, 800);
        ImageIcon logo = ajustarImagen.cargarYAjustarImagen("C:\\Users\\alexg\\Desktop\\Aplicacion_final\\src\\main\\resources\\img\\logof.png", 240, 200);    
        // Establecer la imagen ajustada en el JLabel
        labelfondo.setIcon(icono);
        labellogo.setIcon(logo);
        
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
        progressb = new javax.swing.JProgressBar();
        lbStatus = new javax.swing.JLabel();
        labellogo = new javax.swing.JLabel();
        labelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(progressb, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 160, -1));

        lbStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(200, 200, 200));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus.setText("Status");
        jPanel1.add(lbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 140, -1));

        labellogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logof.png"))); // NOI18N
        jPanel1.add(labellogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 240, 200));

        labelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        jPanel1.add(labelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    doTask("10%", 10);
                    doTask("20%", 20);
                    doTask("30%", 30);
                    doTask("40%", 40);
                    doTask("50%", 50);
                    doTask("60%", 60);
                    doTask("70%", 70);
                    doTask("80%", 80);
                    doTask("90%", 90);
                    doTask("100%", 100);
                    doTask("Finalizado", 100);
                    dispose();
                        //  To Stop animation
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }//GEN-LAST:event_formWindowOpened

private void doTask(String taskName, int progress) throws Exception {
    lbStatus.setText(taskName);
    Thread.sleep(150);

    progressb.setValue(progress);

    if (progress == 100 && isVisible()) {
        // Obtiene la posición de la ventana SplashScreen
        Point splashScreenLocation = getLocation();

        // Abre el JFrame Login después de que el SplashScreen ha terminado y la ventana aún está visible
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login loginFrame = new login();

                // Establece la posición del JFrame Login relativa a la posición de la ventana SplashScreen
                loginFrame.setLocation(splashScreenLocation.x - 10, splashScreenLocation.y - 30);
                loginFrame.setVisible(true);
                loginFrame.setAlwaysOnTop(true);
            }
        });

        // Cierra la ventana del SplashScreen
        dispose();
    }
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SplashScreen dialog = new SplashScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                        dialog.setVisible(false);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelfondo;
    private javax.swing.JLabel labellogo;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JProgressBar progressb;
    // End of variables declaration//GEN-END:variables
}

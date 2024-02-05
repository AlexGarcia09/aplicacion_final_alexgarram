
package view;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import controller.OptionPane;
import controller.ajustarImagen;
import controller.loginUtil;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alexg
 */

public class login extends javax.swing.JFrame {

  
    public login() {
        initComponents();
       btnRecordar.setBackground(Color.white);
       btnRegistro.setBackground(Color.white);
                ImageIcon icono = ajustarImagen.cargarYAjustarImagen("src\\main\\resources\\img\\fondo.jpg", 630, 800);
                ImageIcon logo = ajustarImagen.cargarYAjustarImagen("src\\main\\resources\\img\\logo.png", 65, 55);    
                ImageIcon logoletra = ajustarImagen.cargarYAjustarImagen("src\\main\\resources\\img\\letraslogo.png", 120, 30);
        
                
        labelLogotxt.setIcon(logoletra);
        labelfondo.setIcon(icono);
        labellogo.setIcon(logo);
        
        botonVerpass.setIcon(new FlatSVGIcon("img/ojonoVer.svg",20,20));
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelfondo = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        botonVerpass = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        txtPasswrd = new javax.swing.JPasswordField();
        btnRecordar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labellogo = new javax.swing.JLabel();
        labelLogotxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));
        Right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Right.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 806, -1, -1));

        labelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        Right.add(labelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 800));

        jPanel1.add(Right);
        Right.setBounds(0, 0, 630, 800);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVerpass.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        botonVerpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerpassActionPerformed(evt);
            }
        });
        Left.add(botonVerpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 40, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("LOGIN");
        Left.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Email");
        Left.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        Left.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 350, 40));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        Left.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Left.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 93, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("No tienes cuenta?");
        Left.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 760, -1, -1));

        btnRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 51, 51));
        btnRegistro.setText("Registro");
        btnRegistro.setBorder(null);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        Left.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 755, 90, 30));

        txtPasswrd.setText("jPasswordField2");
        Left.add(txtPasswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 350, 40));

        btnRecordar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRecordar.setForeground(new java.awt.Color(255, 51, 51));
        btnRecordar.setText("Recordar");
        btnRecordar.setBorder(null);
        btnRecordar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecordar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRecordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordarActionPerformed(evt);
            }
        });
        Left.add(btnRecordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 465, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Has olvidado la contraseña?");
        Left.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Left.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 180, -1));

        labellogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        Left.add(labellogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        labelLogotxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelLogotxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/letraslogo.png"))); // NOI18N
        Left.add(labelLogotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        jPanel1.add(Left);
        Left.setBounds(630, 0, 670, 800);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        abrirVentanaRegistro();
        
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnRecordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordarActionPerformed
        abrirVentanaRecordar();
    }//GEN-LAST:event_btnRecordarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String correo = txtEmail.getText();
    String contrasena = new String(txtPasswrd.getPassword());
    OptionPane optionPane = new OptionPane();
    optionPane.colorOptionpane();
    int idUsuario = loginUtil.autenticarUsuario(correo, contrasena);

    if (idUsuario != 0) {

        abrirVentanaPrincipal(idUsuario);
    } else {
        JOptionPane.showMessageDialog(this, "Inicio de sesión fallido. Verifica tu correo y contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonVerpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerpassActionPerformed
        System.out.println(botonVerpass.isSelected());
        if (botonVerpass.isSelected()){
            txtPasswrd.setEchoChar((char)0);
            
            botonVerpass.setIcon(new FlatSVGIcon("img/ojoVer.svg",16,12));

        }else{
            
            txtPasswrd.setEchoChar('*');
            botonVerpass.setIcon(new FlatSVGIcon("img/ojonoVer.svg",20,20));
        }
    }//GEN-LAST:event_botonVerpassActionPerformed
    private void abrirVentanaRegistro() {
        registro registroFrame = new registro();

        registroFrame.setLocationRelativeTo(this);

        registroFrame.setVisible(true);
        dispose();
        
    }
    private void abrirVentanaPrincipal(int usuarioActual) {

        Principal principalFrame = new Principal();

        principalFrame.setLocationRelativeTo(this);

        principalFrame.setVisible(true);
        dispose();
    }
    
    private void abrirVentanaRecordar() {

        recordar recordarFrame = new recordar();

        recordarFrame.setLocationRelativeTo(this);

        recordarFrame.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(recordar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JToggleButton botonVerpass;
    private javax.swing.JButton btnRecordar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelLogotxt;
    private javax.swing.JLabel labelfondo;
    private javax.swing.JLabel labellogo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPasswrd;
    // End of variables declaration//GEN-END:variables
}

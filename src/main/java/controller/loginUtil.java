/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import org.jasypt.util.text.AES256TextEncryptor;

/**
 *
 * @author alexg
 */
public class loginUtil {
    private static String usuarioActual;

    public static boolean autenticarUsuario(String correo, String contrasena) {
        String contrasenaEncriptada = RecordarUtil.obtenerContrasenaPorCorreo(correo);

        if (contrasenaEncriptada != null) {
            // Verifica la contraseña ingresada con la contraseña almacenada en la base de datos
            AES256TextEncryptor decryptor = new AES256TextEncryptor();
            decryptor.setPassword("gfdasdfsghfdtert");  // Cambia esto por tu propia sal
            String contrasenaDesencriptada = decryptor.decrypt(contrasenaEncriptada);

            if (contrasena.equals(contrasenaDesencriptada)) {
                // Las credenciales son válidas, establece el usuario actual en la sesión
                usuarioActual = correo;
                return true;
            }
        }

        return false;
    }

    public static String getUsuarioActual() {
        return usuarioActual;
    }
}
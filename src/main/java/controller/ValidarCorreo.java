/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author alexg
 */
public class ValidarCorreo {

    public static boolean esCorreoValido(String correo) {
        // Patrón para validar una dirección de correo electrónico
        String patronCorreo = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(patronCorreo);
        Matcher matcher = pattern.matcher(correo);

        return matcher.matches();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ajustarImagen {

    public static ImageIcon cargarYAjustarImagen(String ruta, int ancho, int alto) {
        try {
            ImageIcon icono = new ImageIcon(ImageIO.read(new File(ruta)));
            return ajustarImagen(icono, ancho, alto);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ImageIcon ajustarImagen(ImageIcon icono, int ancho, int alto) {
        if (icono != null) {
            Image imagen = icono.getImage();
            Image imagenAjustada = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            return new ImageIcon(imagenAjustada);
        } else {
            return null;
        }
    }
}
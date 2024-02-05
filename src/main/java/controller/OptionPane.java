/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author alexg
 */
public class OptionPane {
    public void colorOptionpane(){
        
        UIManager.put("OptionPane.background", new Color(255,255,255));
        UIManager.put("Panel.background", new Color(255,51,51)); 
        UIManager.put("Button.background", new Color(255,51,51));
        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("Button.border", new EmptyBorder(5, 15, 5, 15));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.BOLD, 14));
        
        UIManager.put("Button.cursor", Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
}

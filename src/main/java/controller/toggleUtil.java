/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JToggleButton;

public class toggleUtil extends JToggleButton{
    public void ColorComponente(Graphics g){
        Color bg, texto;
        if(isSelected()){
            bg = new Color(255,51,51);
            texto = new Color(255,255,255);
            
            
        }else{
            bg = new Color(255,255,255);
            texto = new Color(255,51,51);
        }
        setBackground(bg);
        setForeground(texto);
        super.paintComponent(g);
    }
    
}

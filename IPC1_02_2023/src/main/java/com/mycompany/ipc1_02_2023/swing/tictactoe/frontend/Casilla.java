/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.swing.tictactoe.frontend;

import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jose
 */
public class Casilla extends JLabel {
    private String imagen;
    private boolean seleccionada;

    public Casilla(String imagen) {
        this.setSize(100, 100);
        this.setPreferredSize(new Dimension(100, 100));
        this.imagen = imagen;
        agregarListener();
    }
    
    public void seleccionar() {
        this.seleccionada = true;
        setIcon(new ImageIcon(getClass().getResource(imagen)));
    }
    
    private void agregarListener() {
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionar();
            }
        });
    }
}

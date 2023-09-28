/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.swing.tictactoe.frontend;

import com.mycompany.ipc1_02_2023.swing.tictactoe.backend.MotorJuego;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jose
 */
public class Casilla extends JLabel {
    private static final String PATH_IMAGEN_O = "/com/mycompany/ipc1_02_2023/swing/tictactoe/frontend/icons8-circle-96.png";
    private static final String PATH_IMAGEN_X = "/com/mycompany/ipc1_02_2023/swing/tictactoe/frontend/icons8-cross-96.png";    
    private static final String PATH_IMAGEN_R = "/com/mycompany/ipc1_02_2023/swing/tictactoe/frontend/icons8-sun-96.png";    
    
    private MotorJuego motorJuego;
    
    private boolean seleccionada;
    
    public Casilla(MotorJuego motorJuego) {
        this.setSize(100, 100);
        this.setPreferredSize(new Dimension(100, 100));
        setIcon(new ImageIcon(getClass().getResource(PATH_IMAGEN_R)));
        agregarListener();
        this.motorJuego = motorJuego;
    }
    
    public void seleccionarParaJugador1() {
        this.seleccionada = true;
        setIcon(new ImageIcon(getClass().getResource(PATH_IMAGEN_X)));
    }
    
    public void seleccionarParaJugador2() {
        this.seleccionada = true;
        setIcon(new ImageIcon(getClass().getResource(PATH_IMAGEN_O)));
    }
    
    private void agregarListener() {
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (motorJuego.esTurnoJugador1()) {
                    seleccionarParaJugador1();
                } else {
                    seleccionarParaJugador2();
                }
            }
        });
    }
}

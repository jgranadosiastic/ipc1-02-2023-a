/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.swing.tictactoe.backend;

import com.mycompany.ipc1_02_2023.swing.tictactoe.frontend.Casilla;

/**
 *
 * @author jose
 */
public class Tablero {
    private Casilla[][] casillas = new Casilla[3][3];

    public Tablero(MotorJuego motorJuego) {
        reiniciar(motorJuego);
    }

    public void reiniciar(MotorJuego motorJuego) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = new Casilla(motorJuego);
                
            }
            
        }
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }
    
    
}

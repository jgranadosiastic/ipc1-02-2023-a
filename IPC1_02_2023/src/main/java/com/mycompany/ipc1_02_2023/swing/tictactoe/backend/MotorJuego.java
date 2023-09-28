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
public class MotorJuego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;

    public MotorJuego() {
        tablero = new Tablero(this);
    }
    
    public Casilla[][] obtenerCasillas() {
        return tablero.getCasillas();
    }
    
    public void iniciarJuego(String nombreJugador1, String nombreJugador2) {
        jugador1 = new Jugador(nombreJugador1);
        jugador2 = new Jugador(nombreJugador2);
    }
    
    public boolean esTurnoJugador1() {
        return true;
    }
}

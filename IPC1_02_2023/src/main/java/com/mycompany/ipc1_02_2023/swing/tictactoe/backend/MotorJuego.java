/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.swing.tictactoe.backend;

import com.mycompany.ipc1_02_2023.swing.tictactoe.exceptions.TicTacToeException;
import com.mycompany.ipc1_02_2023.swing.tictactoe.frontend.Casilla;
import com.mycompany.ipc1_02_2023.swing.tictactoe.frontend.TicTacToeFrame;

/**
 *
 * @author jose
 */
public class MotorJuego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;
    private boolean turnoJugador1 = true;
    private TicTacToeFrame ticTacToeFrame;

    public MotorJuego(TicTacToeFrame ticTacToeFrame) {
        tablero = new Tablero(this);
        this.ticTacToeFrame = ticTacToeFrame;
    }
    
    public Casilla[][] obtenerCasillas() {
        return tablero.getCasillas();
    }
    
    public TicTacToeFrame getTicTacToeFrame() {
        return ticTacToeFrame;
    }
    
    public void iniciarJuego(String nombreJugador1, String nombreJugador2) throws TicTacToeException {
        if (nombreJugador1 == null || nombreJugador1.isBlank()) {
            throw new TicTacToeException("El nombre del jugador 1 es obligatorio");
        }
        
        if (nombreJugador2 == null || nombreJugador2.isBlank()) {
            throw new TicTacToeException("El nombre del jugador 2 es obligatorio");
        }
        jugador1 = new Jugador(nombreJugador1);
        jugador2 = new Jugador(nombreJugador2);
        tablero.reiniciar(this);
    }
    
    public boolean esTurnoJugador1() {
        return turnoJugador1;
    }
    
    public void cambiarJugador() {
        turnoJugador1 = !turnoJugador1;
    }
    
    public Jugador obtenerJugadorEnTurno() {
        return turnoJugador1 ? jugador1 : jugador2;
    }
    
    public boolean hayGanador(String imagen) {
        return tablero.hayLineaVertical(imagen) || tablero.hayLineaHorizontal(imagen) ||
                tablero.hayLineaDiagonal(imagen);
    }
    
    public Tablero getTablero() {
        return tablero;
    }
    
    public boolean hayEmpate(String imagen) {
        return !hayGanador(imagen) && tablero.esTableroLleno();
    }
}

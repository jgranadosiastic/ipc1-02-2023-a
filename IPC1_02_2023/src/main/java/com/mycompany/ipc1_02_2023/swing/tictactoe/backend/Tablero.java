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
    private int casillasMarcadas = 0;

    public Tablero(MotorJuego motorJuego) {
        reiniciar(motorJuego);
    }

    public void reiniciar(MotorJuego motorJuego) {
        casillasMarcadas = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = new Casilla(motorJuego);
            }
        }
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public boolean hayLineaHorizontal(String imagen) {
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (casillas[i][j].esSeleccionada() && casillas[i][j].perteneceAUsuario(imagen)) {
                    contador++;
                }
            }
            if (contador == 3) {
                return true;
            }
            contador = 0;
        }

        return false;
    }

    public boolean hayLineaVertical(String imagen) {
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (casillas[j][i].esSeleccionada() && casillas[j][i].perteneceAUsuario(imagen)) {
                    contador++;
                }
            }
            if (contador == 3) {
                return true;
            }
            contador = 0;
        }

        return false;
    }

    public boolean hayLineaDiagonal(String imagen) {
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            if (casillas[i][i].esSeleccionada() && casillas[i][i].perteneceAUsuario(imagen)) {
                contador++;
            }
        }

        if (contador == 3) {
            return true;
        }
        
        contador = 0;        
        for (int i = 0; i < 3; i++) {
            if (casillas[2 - i][i].esSeleccionada() && casillas[2 - i][i].perteneceAUsuario(imagen)) {
                contador++;
            }
        }

        return contador == 3;
    }
    
    public void registrarCasillaSeleccionada() {
        casillasMarcadas++;
    }
    
    public boolean esTableroLleno() {
        return casillasMarcadas == 9;
    }
}

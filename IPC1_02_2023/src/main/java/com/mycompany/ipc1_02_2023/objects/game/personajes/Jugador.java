/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.personajes;

/**
 *
 * @author jose
 */
public class Jugador extends Personaje {
    private static final int PUNTOS_VIDA = 100;
    private static final int DEFENSA_INFERIOR = 2;
    private static final int DEFENSA_SUPERIOR = 7;
    
    public Jugador() {
        puntosVida = PUNTOS_VIDA;
        puntosDefensaInferior = DEFENSA_INFERIOR;
        puntosDefensaSuperior = DEFENSA_SUPERIOR;
    }
}

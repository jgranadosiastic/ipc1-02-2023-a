/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos;

/**
 *
 * @author jose
 */
public class Gargola extends EnemigoVolador {
    private static final int PUNTOS_VIDA = 75;
    private static final int DEFENSA_INFERIOR = 1;
    private static final int DEFENSA_SUPERIOR = 3;

    public Gargola() {
        puntosVida = PUNTOS_VIDA;
        puntosDefensaInferior = DEFENSA_INFERIOR;
        puntosDefensaSuperior = DEFENSA_SUPERIOR;
        volando = true;
    }
    
}

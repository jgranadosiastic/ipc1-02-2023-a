/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos;

import com.mycompany.ipc1_02_2023.objects.game.armas.Arma;
import com.mycompany.ipc1_02_2023.objects.game.armas.Fuego;
import com.mycompany.ipc1_02_2023.objects.game.armas.Piedra;

/**
 *
 * @author jose
 */
public class Troll extends Enemigo {
    private static final int PUNTOS_VIDA = 50;
    private static final int DEFENSA_INFERIOR = 1;
    private static final int DEFENSA_SUPERIOR = 3;

    public Troll() {
        puntosVida = PUNTOS_VIDA;
        puntosDefensaInferior = DEFENSA_INFERIOR;
        puntosDefensaSuperior = DEFENSA_SUPERIOR;
        armas = new Arma[1];
        armas[0] = new Piedra();
    }
    
    
    
}

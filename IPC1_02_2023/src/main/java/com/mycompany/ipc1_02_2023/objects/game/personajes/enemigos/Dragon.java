/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos;

import com.mycompany.ipc1_02_2023.objects.game.armas.Arma;
import com.mycompany.ipc1_02_2023.objects.game.armas.Fuego;
import com.mycompany.ipc1_02_2023.objects.game.personajes.Personaje;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Dragon extends EnemigoVolador implements DañoProximidad {
    private static final int PUNTOS_VIDA = 100;
    private static final int DEFENSA_INFERIOR = 3;
    private static final int DEFENSA_SUPERIOR = 6;

    public Dragon() {
        puntosVida = PUNTOS_VIDA;
        puntosDefensaInferior = DEFENSA_INFERIOR;
        puntosDefensaSuperior = DEFENSA_SUPERIOR;
        Random random = new Random();
        int volandoRandom = random.nextInt(2);
        volando = volandoRandom == 1;
        armas = new Arma[1];
        armas[0] = new Fuego();
    }
    
    public void aterrizar() {
        volando = false;
    }
    
    public void volar() {
        volando = true;
    }
    
    @Override
    public int aplicarDañoProximidad(Personaje atacado) {
        // TODO
        return 0;
    }
}

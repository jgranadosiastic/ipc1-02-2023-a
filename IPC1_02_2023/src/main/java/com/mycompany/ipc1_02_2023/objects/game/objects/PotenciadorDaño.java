/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.objects;

import com.mycompany.ipc1_02_2023.objects.game.personajes.Jugador;

/**
 *
 * @author jose
 */
public class PotenciadorDaño extends Objeto {
    
    @Override
    public void aplicarEfecto(Jugador jugador) {
        jugador.incrementarDañoInferior(1);
        jugador.incrementarDañoSuperior(1);
    }
    
}

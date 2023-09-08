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
public abstract class Objeto {
    private int numeroUsosDisponibles;
    
    public abstract void aplicarEfecto(Jugador jugador);
    
    
    public boolean esUsable() {
        return numeroUsosDisponibles > 0;
    }
    
    //public abstract int aplicarEfecto2(Jugador jugador);
}

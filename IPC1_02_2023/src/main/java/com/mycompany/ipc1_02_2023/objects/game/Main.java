/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game;

import com.mycompany.ipc1_02_2023.objects.game.batalla.Pelea;
import com.mycompany.ipc1_02_2023.objects.game.personajes.Jugador;
import com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos.Enemigo;
import com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos.Troll;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Troll troll = new Troll();

        Pelea pelea = new Pelea(jugador, troll);
        pelea.pelear();
    }
}

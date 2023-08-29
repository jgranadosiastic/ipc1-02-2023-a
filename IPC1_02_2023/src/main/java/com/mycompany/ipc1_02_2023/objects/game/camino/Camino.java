/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.camino;

import com.mycompany.ipc1_02_2023.objects.game.batalla.Pelea;
import com.mycompany.ipc1_02_2023.objects.game.personajes.Jugador;
import com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos.Dragon;
import com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos.Enemigo;
import com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos.Gargola;
import com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos.Troll;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Camino {

    private Jugador jugador;
    private Scanner scanner = new Scanner(System.in);

    public Camino(Jugador jugador) {
        this.jugador = jugador;
    }

    public void iniciar() {
        System.out.println("Iniciando el camino.");
        while (jugador.estaVivo()) {
            moverJugador();
            int flechas = crearFlechas();
            if (flechas > 0) {
                System.out.println("Haz encontrado " + flechas + " flechas. Presiona enter para continuar....");
                jugador.recogerFlechas(flechas);
                scanner.nextLine();
            }
            Enemigo enemigo = crearEnemigo();
            if (enemigo == null) {
                System.out.println("Ufff que suerte, no encontraste enemigo. Presiona enter para continuar....");
                scanner.nextLine();
            } else {
                System.out.format("Te encontraste con un enemigo %s. Presiona enter para continuar....\n", enemigo.getClass().getSimpleName());
                scanner.nextLine();
                Pelea pelea = new Pelea(jugador, enemigo);
                pelea.pelear();
            }
        }
        System.out.println("Fuiste derrotado. se termino el juego");
        System.out.println("Se recorrieron " + jugador.obtenerPasosAvanzados() + " pasos.");
    }

    private Enemigo crearEnemigo() {
        Random random = new Random();
        int enemigoProbabilidad = random.nextInt(100);
        if (enemigoProbabilidad >= 0 && enemigoProbabilidad < 28) {
            return new Dragon();
        } else if (enemigoProbabilidad >= 28 && enemigoProbabilidad < 56) {
            return new Gargola();
        } else if (enemigoProbabilidad >= 56 && enemigoProbabilidad < 84) {
            return null;
        } else {
            return new Dragon();
        }
    }

    private void moverJugador() {
        jugador.incrementarPasos();
        System.out.println("Presione una tecla para avanzar.");
        scanner.nextLine();
    }

    private int crearFlechas() {
        Random random = new Random();
        return random.nextInt(7) + 3;
    }

}

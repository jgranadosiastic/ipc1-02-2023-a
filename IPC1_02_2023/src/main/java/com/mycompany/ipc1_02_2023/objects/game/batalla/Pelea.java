/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.batalla;

import com.mycompany.ipc1_02_2023.objects.game.armas.Arco;
import com.mycompany.ipc1_02_2023.objects.game.armas.Arma;
import com.mycompany.ipc1_02_2023.objects.game.personajes.Jugador;
import com.mycompany.ipc1_02_2023.objects.game.personajes.Personaje;
import com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos.Enemigo;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Pelea {

    private Jugador jugador;
    private Enemigo enemigo;
    private Personaje atacante;
    private Personaje atacado;
    private boolean turnoJugador;
    private Scanner scanner = new Scanner(System.in);

    public Pelea(Jugador jugador, Enemigo enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
    }

    public void pelear() {
        // aleatorio quien empieza
        definirQuienEmpieza();

        while (!haMuertoAlguno()) {
            imprimirQuienAtaca();
            // repetir hasta que uno muera
            // si es jugador, elije arma y gokpea
            // si es enemigo, golpea
            Arma armaAAtacar = definirArma(atacante);
            scanner.nextLine();
            int daño = armaAAtacar.calcularDaño(atacado);
            int dañoRecibido = atacado.recibirDaño(daño);
            System.out.println("Se ha hecho " + dañoRecibido + " puntos de daño");
            scanner.nextLine();
            imprimirPuntosVida();
            cambiarAtacante();
        }

        imprimirGanador();

    }

    private void definirQuienEmpieza() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            atacante = jugador;
            atacado = enemigo;
            turnoJugador = true;
        } else {
            atacante = enemigo;
            atacado = jugador;
            turnoJugador = false;
        }
    }

    private void cambiarAtacante() {
        if (turnoJugador) {
            atacante = enemigo;
            atacado = jugador;
        } else {
            atacante = jugador;
            atacado = enemigo;
        }
        turnoJugador = !turnoJugador;
    }

    private boolean haMuertoAlguno() {
        return !jugador.estaVivo() || !enemigo.estaVivo();
    }

    private Arma definirArma(Personaje atacante) {
        if (atacante instanceof Jugador) {
            System.out.println("Elija un arma:");
            System.out.println("1. Espada");
            System.out.println("2. Arco");
            int opcion = Integer.valueOf(scanner.nextLine());
            Arma arma = ((Jugador) atacante).obtenerArma(opcion - 1);
            if (opcion == 1) {
                System.out.println("El jugador atacara con espada. Presione enter para continuar....");
            } else {
                System.out.println("El jugador atacara con arco. Presione enter para continuar....");
                Arco arco = (Arco) arma;
                if (!arco.tieneFlechas()) {
                    System.out.println("El jugador no tiene flechas. Presione enter para continuar....");
                }
            }

            return arma;
        }

        System.out.println("El enemigo atacará con su arma. Presione enter para continuar....");
        return ((Enemigo) atacante).obtenerArma();
    }

    private void imprimirPuntosVida() {
        System.out.println("Puntos de vida del judador:");
        System.out.println(jugador.obtenerPuntosVida());
        System.out.println("Puntos de vida del enemigo:");
        System.out.println(enemigo.obtenerPuntosVida());
        System.out.println("Presione enter para continuar....");
        scanner.nextLine();
    }

    private void imprimirGanador() {
        if (jugador.estaVivo()) {
            System.out.println("El ganador es el jugador. Presione enter para continuar....");
        } else {
            System.out.println("El ganador es el enimigo. Presione enter para continuar....");
        }
        scanner.nextLine();
    }

    private void imprimirQuienAtaca() {
        if (turnoJugador) {
            System.out.println("Ataca el jugador. Presione enter para continuar....");
        } else {
            System.out.println("Ataca el enemigo. Presione enter para continuar....");
        }
        scanner.nextLine();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.personajes;

import com.mycompany.ipc1_02_2023.objects.game.armas.Arco;
import com.mycompany.ipc1_02_2023.objects.game.armas.Arma;
import com.mycompany.ipc1_02_2023.objects.game.armas.Espada;

/**
 *
 * @author jose
 */
public class Jugador extends Personaje {
    private static final int PUNTOS_VIDA = 100;
    private static final int DEFENSA_INFERIOR = 1;
    private static final int DEFENSA_SUPERIOR = 4;
    public static final int INDICE_ESPADA = 0;
    public static final int INDICE_AARCO = 1;
    
    private int pasos;
    
    public Jugador() {
        puntosVida = PUNTOS_VIDA;
        puntosDefensaInferior = DEFENSA_INFERIOR;
        puntosDefensaSuperior = DEFENSA_SUPERIOR;
        armas = new Arma[2];
        armas[INDICE_ESPADA] = new Espada();
        armas[INDICE_AARCO] = new Arco();
    }
    
    public Arma obtenerArma(int index) {
        return armas[index];
    }
    
    public Arma obtenerEspada() {
        return armas[INDICE_ESPADA];
    }
    
    public void incrementarPasos() {
        pasos += 50;
    }
    
    public int obtenerPasosAvanzados() {
        return pasos;
    }
    
    public void recogerFlechas(int flechas) {
        ((Arco) armas[INDICE_AARCO]).recogerFlechas(flechas);
    }
}

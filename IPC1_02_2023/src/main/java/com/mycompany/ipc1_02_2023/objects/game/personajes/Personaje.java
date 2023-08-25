/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.personajes;

import com.mycompany.ipc1_02_2023.objects.game.armas.Arma;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Personaje {
    protected int puntosVida;
    protected int puntosDefensaInferior;
    protected int puntosDefensaSuperior;
    protected Arma[] armas;
    
    public int atacar(Arma arma, Personaje atacado) {
        // TODO aqui otra forma
        // pedirle al arma el daño sobre un personaje
        // indicar al personaje la cantidad de daño a realizarle.
        return 0;
    }
    
    private int defenderse() {
        // calcula la cantidad de defensa en base a los limites
        Random random = new Random();
        int defensa = random.nextInt(puntosDefensaSuperior - puntosDefensaInferior) + puntosDefensaInferior;
        
        return defensa;
    }
    
    public int recibirDaño(int daño) {
        // defenderse
        // hacer resta de daño menos defensa
        // disminuir los puntos de vida en base al resultado de la resta
        
        int defensa = defenderse();
        int dañoFinal = daño - defensa;
        if (dañoFinal < 0) {
            dañoFinal = 0;
        }
        
        puntosVida -= dañoFinal;
        if (puntosVida < 0) {
            puntosVida = 0;
        }
        
        return dañoFinal;
    }
    
    public boolean estaVivo() {
        return puntosVida > 0;
    }
    
    public int obtenerPuntosVida() {
        return puntosVida;
    }
}

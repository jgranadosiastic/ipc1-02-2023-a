/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.personajes;

/**
 *
 * @author jose
 */
public class Personaje {
    protected int puntosVida;
    protected int puntosDefensaInferior;
    protected int puntosDefensaSuperior;
    protected Arma[] armas;
    
    public void atacar(Arma arma, Personaje atacado) {
        // pedirle al arma el daño sobre un personaje
        // indicar al personaje la cantidad de daño a realizarle.
    }
    
    private void defenderse() {
        // calcula la cantidad de defensa en base a los limites
    }
    
    public void recibirDaño(int daño) {
        // defenderse
        // hacer resta de daño menos defensa
        // disminuir los puntos de vida en base al resultado de la resta
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.armas;

import com.mycompany.ipc1_02_2023.objects.game.personajes.Personaje;
import com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos.EnemigoVolador;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Arco extends Arma {

    private static int FLECHAS_INICIALES = 15;

    private static final int DAÑO_INFERIOR = 1;
    private static final int DAÑO_SUPERIOR = 3;

    private static final int DAÑO_INFERIOR_VOLANDO = 5;
    private static final int DAÑO_SUPERIOR_VOLANDO = 9;

    private int flechas;

    public Arco() {
        dañoInferior = DAÑO_INFERIOR;
        dañoSuperior = DAÑO_SUPERIOR;
        this.flechas = FLECHAS_INICIALES;
    }

    @Override
    public int calcularDaño(Personaje atacado) {
        if (flechas == 0) {
            return 0;
        }
        flechas--;
        if (atacado instanceof EnemigoVolador) {
            EnemigoVolador enemigo = (EnemigoVolador) atacado;
            if (enemigo.estaVolando()) {
                Random random = new Random();
                int daño = random.nextInt(DAÑO_SUPERIOR_VOLANDO - DAÑO_INFERIOR_VOLANDO) + DAÑO_INFERIOR_VOLANDO;
                
                return daño;
            }
        }
        return super.calcularDaño(atacado);
    }
    
    public boolean tieneFlechas() {
        return flechas > 0;
    }
    
    public void recogerFlechas(int flechas) {
        this.flechas += flechas;
    }
}

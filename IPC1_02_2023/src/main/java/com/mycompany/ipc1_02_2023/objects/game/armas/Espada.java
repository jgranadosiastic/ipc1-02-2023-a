/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.armas;

import com.mycompany.ipc1_02_2023.objects.game.personajes.Personaje;
import com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos.DañoProximidad;
import com.mycompany.ipc1_02_2023.objects.game.personajes.enemigos.EnemigoVolador;

/**
 *
 * @author jose
 */
public class Espada extends Arma {
    
    private static final int DAÑO_INFERIOR = 5;
    private static final int DAÑO_SUPERIOR = 8;
    
    public Espada() {
        dañoInferior = DAÑO_INFERIOR;
        dañoSuperior = DAÑO_SUPERIOR;
    }
    
    @Override
    public int calcularDaño(Personaje atacado) {
        if (atacado instanceof EnemigoVolador) {
            EnemigoVolador enemigo = (EnemigoVolador) atacado;
            if (enemigo.estaVolando()) {
                return 0;
            }
        } else if (atacado instanceof DañoProximidad) {
            // TODO
            //aplicar da;o extra
        }
        
        return super.calcularDaño(atacado);
    }
    
    
    
}

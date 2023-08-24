/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.armas;

import com.mycompany.ipc1_02_2023.objects.game.personajes.Personaje;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Arma {
    protected int dañoInferior;
    protected int dañoSuperior;
    
    public int calcularDaño(Personaje atacado) {
        Random random = new Random();
        int daño = random.nextInt(dañoSuperior - dañoInferior) + dañoInferior;
        
        return daño;
    }
}

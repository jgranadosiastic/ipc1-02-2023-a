/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.armas;

/**
 *
 * @author jose
 */
public class Fuego extends Arma {
    
    private static final int DAÑO_INFERIOR = 6;
    private static final int DAÑO_SUPERIOR = 10;
    
    public Fuego() {
        dañoInferior = DAÑO_INFERIOR;
        dañoSuperior = DAÑO_SUPERIOR;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.game.armas;

/**
 *
 * @author jose
 */
public class Acido extends Arma {
    
    private static final int DAÑO_INFERIOR = 1;
    private static final int DAÑO_SUPERIOR = 3;
    
    public Acido() {
        dañoInferior = DAÑO_INFERIOR;
        dañoSuperior = DAÑO_SUPERIOR;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.inheritance;

/**
 *
 * @author jose
 */
public class Camion extends Vehiculo {
    private int tonelaje;
    
    public Camion(int tonelaje) {
        this.tonelaje = tonelaje;
        calcularEspacios();
    }
    
    private void calcularEspacios() {
        espacios = tonelaje * 2;
        //setEspacios(tonelaje * 2);
    }
}

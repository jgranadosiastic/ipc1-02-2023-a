/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.busquedas;

/**
 *
 * @author jose
 */
public class BusquedaSecuencial {
    
    public void buscarDato(int[] arreglo, int valorABuscar) {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            contador++;
            int valor = arreglo[i];
            if (valor == valorABuscar) {
                System.out.format("El valor buscado %d esta en el indice %d\n", valorABuscar, i);
                System.out.println("Numero de ciclos usados: " + contador);
                return;
            }
        }
        
        System.out.println("No se encontró el valor despues de los ciclos: " + contador);
    }
    
}

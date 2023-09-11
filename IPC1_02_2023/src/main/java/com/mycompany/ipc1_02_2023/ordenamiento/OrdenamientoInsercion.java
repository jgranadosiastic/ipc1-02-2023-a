/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.ordenamiento;

/**
 *
 * @author jose
 */
public class OrdenamientoInsercion {
    
    public void ordenar(int[] arreglo) {
        
        int contador = 0;
        
        if (arreglo.length == 1) {
            return;
        }
        
        int indice1 = 0;
        int indice2 = 1;
            
                    
        while(indice2 < arreglo.length) {
            indice1 = indice2 - 1;
            int valor1 = arreglo[indice1];
            int valor2 = arreglo[indice2];
            if (valor2 < valor1) {
                int anterior = indice2 - 1;
                int actual = indice2;
                int valorActual = arreglo[actual];
                while(actual >= 1 || arreglo[anterior] < arreglo[actual] ) {
                    int valorAnterior = arreglo[anterior];
                    arreglo[actual] = valorAnterior;
                    actual--;
                }
                if (actual == 0) {
                    arreglo[actual] = valorActual;
                }
            }
            indice2++;
        }
        
        System.out.println("Se ordeno el arreglo despues de " + contador + " ciclos");
    }
}

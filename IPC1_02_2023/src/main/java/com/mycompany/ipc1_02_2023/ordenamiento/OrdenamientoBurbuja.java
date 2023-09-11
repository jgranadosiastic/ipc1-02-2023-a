/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.ordenamiento;

/**
 *
 * @author jose
 */
public class OrdenamientoBurbuja {
    
    public void ordenar(int[] arreglo) {
        
        if (arreglo.length == 1) {
            return;
        }
        
        boolean estaOrdenado = false;
        int contador = 0;
        while(!estaOrdenado) {
            estaOrdenado = true;
            for (int i = 1; i < arreglo.length; i++) {
                contador++;
                int indice1 = i - 1;
                int indice2 = i;
                
                int valor1 = arreglo[indice1];
                int valor2 = arreglo[indice2];
                
                if (valor1 > valor2) {
                    arreglo[indice1] = valor2;
                    arreglo[indice2] = valor1;
                    estaOrdenado = false;
                }
                
            }
        }
        System.out.println("Se ordeno el arreglo despues de " + contador + " ciclos");
    }
}

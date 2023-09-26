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
        
        for (int i = 1; i <= arreglo.length - 1; i++) {
            int elemento = arreglo[i];
            for (int j = i - 1; j >= 0; j--) {
                int izquierda = arreglo[j];
                if (izquierda > elemento) {
                    arreglo[j + 1] = izquierda;
                    arreglo[j] = elemento;
                } else {
                    break;
                }
                contador++;
            }
            
        }
        
        System.out.println("Se ordeno el arreglo despues de " + contador + " ciclos");
    }
}

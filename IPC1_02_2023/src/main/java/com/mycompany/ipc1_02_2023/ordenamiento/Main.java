/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.ordenamiento;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        int[] arreglo = new int[] {1,41, 82, 2, 3, 100, 42,  25};
        OrdenamientoBurbuja ordenamientoBurbuja = new OrdenamientoBurbuja();
        
        ordenamientoBurbuja.ordenar(arreglo);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
            
        }
        
        
        int[] arreglo2 = new int[] {1,41, 82, 2, 3, 100, 42,  25};
        OrdenamientoInsercion ordenamientoInsercion = new OrdenamientoInsercion();
        
        ordenamientoInsercion.ordenar(arreglo2);
        
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println(arreglo2[i]);
            
        }
        
    }
}

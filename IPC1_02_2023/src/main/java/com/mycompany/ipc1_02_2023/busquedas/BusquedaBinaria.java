/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.busquedas;

/**
 *
 * @author jose
 */
public class BusquedaBinaria {
    
    public void buscarDato(int[] arreglo, int valorABuscar) {
        int contador = 0;
        int indiceInicial = 0;
        int indiceFinal = arreglo.length - 1;
        int puntoMedio;
        
        while(indiceInicial <= indiceFinal) {
            contador++;
            puntoMedio = ((indiceFinal - indiceInicial) / 2) + indiceInicial;
            
            if (arreglo[puntoMedio] == valorABuscar) {
                System.out.format("El valor buscado %d esta en el indice %d\n", valorABuscar, puntoMedio);
                System.out.println("Numero de ciclos usados: " + contador);
                return;
            } if (valorABuscar < arreglo[puntoMedio]) {
                indiceFinal = puntoMedio - 1;
            } else {
                indiceInicial = puntoMedio + 1;
            }
        }
        
        System.out.println("No se encontró el valor despues de los ciclos: " + contador);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.busquedas;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        //int[] arreglo = new int[] {12, 5, 32, 41, 100, 54, 74, 11};
        int[] arreglo = new int[] {5, 11, 12, 32, 41, 54, 74, 100};
        
        BusquedaSecuencial busquedaSecuencial = new BusquedaSecuencial();
        busquedaSecuencial.buscarDato(arreglo, 54);
        busquedaSecuencial.buscarDato(arreglo, 40);
        
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        busquedaBinaria.buscarDato(arreglo, 54);
        busquedaBinaria.buscarDato(arreglo, 40);
    }
}

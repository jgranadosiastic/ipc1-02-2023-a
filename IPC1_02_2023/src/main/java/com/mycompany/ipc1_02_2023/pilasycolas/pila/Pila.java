/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.pilasycolas.pila;

import com.mycompany.ipc1_02_2023.pilasycolas.exceptions.PilaException;

/**
 *
 * @author jose
 */
public class Pila {
    private int size;
    private String[] arregloPila;
    private int tope;

    public Pila(int size) {
        this.size = size;
        arregloPila = new String[size];
        tope = 0;
    }
    
    
    
    public void apilar(String elemento) throws PilaException {
        if (estaLlena()) {
            throw new PilaException("La pila esta llena.");
        }
        
        arregloPila[tope] = elemento;
        tope++;
    }
    
    public String desapilar() throws PilaException{
        if (estaVacia()) {
            throw new PilaException("La pila esta vacia, nada que desapilar.");
        }
        tope--;
        String elemento = arregloPila[tope];
        
        return elemento;
    }
    
    public boolean estaLlena() {
        return tope == size;
    }
    
    public boolean estaVacia() {
        return tope == 0;
    }
}

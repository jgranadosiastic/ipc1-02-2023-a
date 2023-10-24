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
public class PilaGenerica<T> {
    private int size;
    private T[] arregloPila;
    private int tope;

    public PilaGenerica(int size) {
        this.size = size;
        arregloPila = (T[]) new Object[size];
        tope = 0;
    }
    
    
    
    public void apilar(T elemento) throws PilaException {
        if (estaLlena()) {
            throw new PilaException("La pila esta llena.");
        }
        
        arregloPila[tope] = elemento;
        tope++;
    }
    
    public T desapilar() throws PilaException{
        if (estaVacia()) {
            throw new PilaException("La pila esta vacia, nada que desapilar.");
        }
        tope--;
        T elemento = arregloPila[tope];
        
        return elemento;
    }
    
    public boolean estaLlena() {
        return tope == size;
    }
    
    public boolean estaVacia() {
        return tope == 0;
    }
}

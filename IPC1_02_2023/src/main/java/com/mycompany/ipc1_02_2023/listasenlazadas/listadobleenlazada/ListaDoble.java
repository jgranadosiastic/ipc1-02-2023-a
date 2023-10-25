/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.listasenlazadas.listadobleenlazada;

import com.mycompany.ipc1_02_2023.listasenlazadas.exception.ListaEnlazadaException;

/**
 *
 * @author jose
 */
public class ListaDoble<T> {
    private NodoDoble<T> primero;
    private NodoDoble<T> ultimo;
    private int size;
    
    public void agregar(T contenido) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(contenido);
        if (esVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
            ultimo = nuevoNodo;
        }
        
        size++;
    }
    
    public boolean esVacia() {
        return primero == null;
    }

    public T obtenerContenido(int index) throws ListaEnlazadaException {
        return obtenerNodo(index).getContenido();
    }
    
    public void eliminarUltimo() throws ListaEnlazadaException {
        if (esVacia()) {
            throw new ListaEnlazadaException("La lista esta vacia");
        }
        
        if (size == 1) {
            primero = null;
            ultimo = null;
        } else {
            NodoDoble<T> penultimo = ultimo.getAnterior();
            penultimo.setSiguiente(null);
            ultimo.setAnterior(null);
            ultimo = penultimo;
        }
        
        size--;
    }

    private NodoDoble<T> obtenerNodo(int index) throws ListaEnlazadaException {
        if (esVacia()) {
            throw new ListaEnlazadaException("La lista esta vacia.");
        }
        if (index >= size || index < 0) {
            throw new ListaEnlazadaException("El indice esta fuera del tama;o de la lista.");
        }
        
        int medio = size / 2;
        if (index < medio) {
            return obtenerNodoAvanzando(index);
        } else {
            return  obtenerNodoRetrocediendo(index);
        }
        
    }
    
    private NodoDoble<T> obtenerNodoAvanzando(int index) {
        NodoDoble<T> actual = primero;
        for (int i = 0; i < index; i++) {

            actual = actual.getSiguiente();
        }

        return actual;
    }
    
    private NodoDoble<T> obtenerNodoRetrocediendo(int index) {
        int indiceFinal = size - 1;
        int limite = indiceFinal - index;
        NodoDoble<T> actual = ultimo;
        for (int i = 0; i < limite; i++) {
            actual = actual.getAnterior();
        }

        return actual;
    }
}

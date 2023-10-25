/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.listasenlazadas.listasimple;

import com.mycompany.ipc1_02_2023.listasenlazadas.exception.ListaEnlazadaException;

/**
 *
 * @author jose
 */
public class ListaGenerica<T> {
    private NodoGenerico<T> primero;
    private NodoGenerico<T> ultimo;
    private int size = 0;

    public void agregar(T contenido) {
        NodoGenerico<T> nodoNuevo = new NodoGenerico<T>(contenido);
        if (esVacia()) {
            primero = nodoNuevo;
            ultimo = nodoNuevo;
        } else {
            ultimo.setSiguiente(nodoNuevo);
            ultimo = nodoNuevo;
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
            throw new ListaEnlazadaException("La lista esta vacia.");
        }

        if (size == 1) {
            primero = null;
            ultimo = null;
        } else {
            NodoGenerico<T> penultimo = obtenerNodo(size - 2);
            penultimo.setSiguiente(null);

            ultimo = penultimo;
        }
        size--;
    }
    
    public void imprimirLista() throws ListaEnlazadaException {
        if (esVacia()) {
            throw new ListaEnlazadaException("La lista esta vacia");
        }
        
        NodoGenerico<T> actual = primero;
        while(actual.getSiguiente() != null) {
            System.out.println("contenido: " + actual.getContenido());
            actual = actual.getSiguiente();
        }
        System.out.println("contenido: " + actual.getContenido());
    }

    private NodoGenerico<T> obtenerNodo(int index) throws ListaEnlazadaException {
        if (esVacia()) {
            throw new ListaEnlazadaException("La lista esta vacia.");
        }
        if (index >= size || index < 0) {
            throw new ListaEnlazadaException("El indice esta fuera del tama;o de la lista.");
        }

        NodoGenerico<T> actual = primero;
        for (int i = 0; i < index; i++) {
            /*Nodo temp = actual.getSiguiente();
            actual = temp;*/

            actual = actual.getSiguiente();
        }

        return actual;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.listasenlazadas.listasimple;

/**
 *
 * @author jose
 */
public class Lista {
    private Nodo primero;
    private Nodo ultimo;
    
    public void agregar(String contenido) {
        Nodo nodoNuevo = new Nodo(contenido);
        if (esVacia()) {
            primero = nodoNuevo;
            ultimo = nodoNuevo;
        } else {
            ultimo.setSiguiente(nodoNuevo);
            ultimo = nodoNuevo;
        }
    }
    
    public boolean esVacia() {
        return primero == null;
    }
}

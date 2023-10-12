/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.pilasycolas.cola;

import com.mycompany.ipc1_02_2023.pilasycolas.exceptions.ColaException;

/**
 *
 * @author jose
 */
public class Cola {
    private int size;
    private String[] arregloCola;
    
    private int disponible;

    public Cola(int size) {
        arregloCola = new String[size];
        disponible = 0;
    }
    
    public void encolar(String elemento) throws ColaException {
        if (estaLlena()) {
            throw new ColaException("La cola esta llena.");
        }
        arregloCola[disponible] = elemento;
        disponible++;
    }
 
    public String desencolar() throws ColaException {
        if (estaVacia()) {
            throw new ColaException("La cola esta vacia, nada por desencolar.");
        }
        
        String valorEnFrenteDeCola = arregloCola[0];
        
        for (int i = 1; i < disponible; i++) {
            String elemento = arregloCola[i];
            arregloCola[i - 1] = elemento;
        }
        disponible--;
        return valorEnFrenteDeCola;
    }
    
    public boolean estaLlena() {
        return disponible >= arregloCola.length;
    }
    
    public boolean estaVacia() {
        return disponible == 0;
    }
    
    public int getDisponible() {
        return disponible;
    }
    
    public String[] getArregloCola() {
        return arregloCola;
    }
}

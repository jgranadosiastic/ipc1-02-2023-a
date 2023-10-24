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
public class ClaseGenerica<T, U, V> {
    private T atributo1;
    private boolean atributo2;
    private U atributo3;
    private V atributo4;
    
    public T hacerAlgoConAtributo1() {
        return atributo1;
    }
    
    public U hacerAlgoConAtributo3() {
        return atributo3;
    }
    
    public V hacerAlgoConAtributo4() {
        return atributo4;
    }
}

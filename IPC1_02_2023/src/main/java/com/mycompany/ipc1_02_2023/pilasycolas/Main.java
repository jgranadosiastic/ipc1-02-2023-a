/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.pilasycolas;

import com.mycompany.ipc1_02_2023.pilasycolas.cola.Cola;
import com.mycompany.ipc1_02_2023.pilasycolas.exceptions.ColaException;
import com.mycompany.ipc1_02_2023.pilasycolas.frontend.PilasYColasApp;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola(8);
        
        try {
            String el1 = cola.desencolar();
        } catch (ColaException e) {
            System.out.println(e.getMessage());
        }
            
        try {
            cola.encolar("a");
            cola.encolar("b");
            cola.encolar("c");
            cola.encolar("d");
            cola.encolar("e");
            cola.encolar("f");
            cola.encolar("g");
            cola.encolar("h");
            String el = cola.desencolar();
            System.out.println("Desencolando: " + el);
            cola.encolar("i");
            el = cola.desencolar();
            System.out.println("Desencolando: " + el);
        } catch (ColaException e) {
            System.out.println(e.getMessage());
        }

        PilasYColasApp app = new PilasYColasApp();
        app.setVisible(true);
    }
}

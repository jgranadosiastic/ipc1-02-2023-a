/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.pilasycolas;

import com.mycompany.ipc1_02_2023.objects.game.armas.Arco;
import com.mycompany.ipc1_02_2023.objects.game.personajes.Jugador;
import com.mycompany.ipc1_02_2023.pilasycolas.cola.Cola;
import com.mycompany.ipc1_02_2023.pilasycolas.exceptions.ColaException;
import com.mycompany.ipc1_02_2023.pilasycolas.exceptions.PilaException;
import com.mycompany.ipc1_02_2023.pilasycolas.pila.ClaseGenerica;
import com.mycompany.ipc1_02_2023.pilasycolas.pila.Pila;
import com.mycompany.ipc1_02_2023.pilasycolas.pila.PilaGenerica;
import com.mycompany.ipc1_02_2023.pilasycolas.pila.PilaObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

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

        
        Pila pila = new Pila(6);
        
        try {
            String el1 = pila.desapilar();
        } catch (PilaException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            pila.apilar("x");
            pila.apilar("y");
            pila.apilar("z");
            String el = pila.desapilar();
            System.out.println("Desapilando: " + el);
            pila.apilar("w");
            pila.apilar("u");
            pila.apilar("v");
            pila.apilar("p");
            el = pila.desapilar();
            System.out.println("Desapilando: " + el);
            pila.apilar("o");
        } catch (PilaException e) {
            System.out.println(e.getMessage());
        }
        Arco arco = new Arco();
        PilaObject pila2 = new PilaObject(6);
        try {
            pila2.apilar(arco);
        } catch (Exception e) {
        }
        
        Jugador jugador = new Jugador();
        PilaObject pila3 = new PilaObject(6);
        try {
            pila3.apilar("ssss");
            Jugador elemento = (Jugador) pila3.desapilar();
            /*PilasYColasApp app = new PilasYColasApp();
            app.setVisible(true);*/
        } catch (PilaException ex) {
            ex.printStackTrace();
        }
        
        PilaGenerica<String> pilaStrings = new PilaGenerica<>(6);
        try {
            pilaStrings.apilar("ssss");
            String el = pilaStrings.desapilar();
        } catch (Exception e) {
        }
        
        PilaGenerica<Arco> pilaArcos = new PilaGenerica<>(6);
        try {
            pilaArcos.apilar(new Arco());
            Arco el = pilaArcos.desapilar();
        } catch (Exception e) {
        }
        
        
        ClaseGenerica<String, Arco, JFrame> claseGenericaMultiple = new ClaseGenerica<>();
        claseGenericaMultiple.hacerAlgoConAtributo1();
        claseGenericaMultiple.hacerAlgoConAtributo3();
        claseGenericaMultiple.hacerAlgoConAtributo4();
    }
}

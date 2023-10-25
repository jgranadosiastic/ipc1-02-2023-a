/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.listasenlazadas;

import com.mycompany.ipc1_02_2023.listasenlazadas.listasimple.ListaGenerica;
import javax.swing.JFrame;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        ListaGenerica<String> listaString = new ListaGenerica<>();
        
        try {
            listaString.agregar("x");
            listaString.agregar("y");
            listaString.agregar("z");
            listaString.imprimirLista();
            
            listaString.eliminarUltimo();
            listaString.eliminarUltimo();
            listaString.imprimirLista();
            
            listaString.eliminarUltimo();
            listaString.imprimirLista();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        ListaGenerica<JFrame> listaFrames = new ListaGenerica<>();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.alumnos;

import com.mycompany.ipc1_02_2023.objects.articulos.*;
import com.mycompany.ipc1_02_2023.objects.articulos.Articulo;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
      
        System.out.println("Ingrese CUI");
        String cui = scanner.nextLine();
        
        System.out.println("Ingrese Nombre");
        String nombre = scanner.nextLine();
        
        int[] notas = new int[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese una nota");
            notas[i] = Integer.valueOf(scanner.nextLine());
        }
        
        Alumno alumno = new Alumno();
        alumno.cui = cui;
        alumno.nombre = nombre;
        alumno.notas = notas;
        
        alumno.imprimirMensaje();*/
        
        AdministradorAlumnos administradorAlumnos = new AdministradorAlumnos();
        administradorAlumnos.echarPunta();
        
    }
}

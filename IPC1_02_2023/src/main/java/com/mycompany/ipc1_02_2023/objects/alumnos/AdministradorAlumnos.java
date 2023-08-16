/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.alumnos;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class AdministradorAlumnos {

    private int cantidadAlumnos;
    private Alumno[] alumnos;

    private Alumno pedirDatosAlumno() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese CUI");
        String cui = scanner.nextLine();

        System.out.println("Ingrese Nombre");
        String nombre = scanner.nextLine();

        int[] notas = new int[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese una nota");
            notas[i] = Integer.valueOf(scanner.nextLine());
        }

        Alumno alumno = new Alumno(cui, nombre, notas);

        return alumno;
    }

    private void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos");
        cantidadAlumnos = Integer.valueOf(scanner.nextLine());

        alumnos = new Alumno[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            Alumno alumno = pedirDatosAlumno();
            alumnos[i] = alumno;
        }
    }

    private void calcularAprobacion() {
        // EJERCICIO: calcular la aprobacion al momento de registrar cada alumno
        int aprobados = 0;
        int reprobados = 0;
        
        for (Alumno alumno : alumnos) {
            if (alumno.esAprobado()) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        
        System.out.println("Aprobaron " + aprobados);
        System.out.println("Reprobaron " + reprobados);
    }

    private void imprimir() {
        for (Alumno alumno : alumnos) {
            alumno.imprimirMensaje();
        }
        
        calcularAprobacion();
    }
    
    public void echarPunta() {
        pedirDatos();
        imprimir();
    }
}

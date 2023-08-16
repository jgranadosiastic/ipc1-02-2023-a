/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.alumnos;

/**
 *
 * @author jose
 */
public class Alumno {
    private String cui;
    private String nombre;
    private int[] notas;
    
    public Alumno(String cuiInicial, String nombreInicial, int[] notasInicial) {
        cui = cuiInicial;
        nombre = nombreInicial;
        notas = notasInicial;
    }
    
    public double calcularPromedio() {
        int total = 0;
        for (int nota : notas) {
            total += nota;
        }
        
        return total / notas.length;
        
    }
    
    public boolean esAprobado() {
        /*if (calcularPromedio() >= 61) {
            return true;
        } else {
            return false;
        }
        */
        return calcularPromedio() >= 61;
    }
    
    public void imprimirMensaje() {
        System.out.println("CUI: " + cui);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota promedio: " + calcularPromedio());
        if (esAprobado()) {
            System.out.println("El alumno aprobó");
        } else {
            System.out.println("El alumno perdió");
        }
    }
}

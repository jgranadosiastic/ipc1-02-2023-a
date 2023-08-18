/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.inheritance;

/**
 *
 * @author jose
 */
public class Vehiculo {

    private String placa;
    private String color;
    private int año;
    protected int espacios;

    public Vehiculo() {
        espacios = 1;
    }

    public void especificarPlaca(String placa) {
        this.placa = placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int obtenerEspacios() {
        return espacios;
    }

    /*public void setEspacios(int espacios) {
        this.espacios = espacios;
    }*/

    public void imprimirDatos() {
        System.out.println("Placa:" + placa);
        System.out.println("Color:" + color);
        System.out.println("A;o:" + año);
        System.out.println("Espacios:" + espacios);
    }
}

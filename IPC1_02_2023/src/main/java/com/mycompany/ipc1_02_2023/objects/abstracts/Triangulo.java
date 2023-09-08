/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.abstracts;

/**
 *
 * @author jose
 */
public class Triangulo extends FiguraGeometrica {

    private int base;
    private int altura;
    private int lado2;
    private int lado3;
    
    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado2 + lado3 + base;
    }
    
}

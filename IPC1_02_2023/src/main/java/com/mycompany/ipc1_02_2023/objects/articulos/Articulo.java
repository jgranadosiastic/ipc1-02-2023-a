/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.articulos;

/**
 *
 * @author jose
 */

/**
 * Default (ausencia de especificador): acceso desde el mismo paquete
 * public:  acceso desde cualquier entidad externa
 * private: acceso unicamente desde la misma clase
 * protected:   accesso desde el mismo paquete y de clases que heredan de la clase
 */
public class Articulo {
    
    public static final double INCREMENTO_AL_MAYOR = 0.15;
    public static final double INCREMENTO_AL_DETALLE = 0.30;
    
    private double costoBase;
    
    public double calcularPrecioAlMayor() {
        double incremento = costoBase * INCREMENTO_AL_MAYOR;
        return costoBase + incremento;
    }
    
    public double calcularPrecioAlDetalle() {
        double incremento = costoBase * INCREMENTO_AL_DETALLE;
        return costoBase + incremento;
        
    }
    
    public void definirCostoBase(double valor) {
        costoBase = valor;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.articulos;

import com.mycompany.ipc1_02_2023.objects.articulos.Articulo;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el costo base del articulo");
        double costoBase = Double.valueOf(scanner.nextLine());
        
        Articulo miArticulo = new Articulo();
        miArticulo.definirCostoBase(costoBase);
        
        System.out.println("El precio al mayor es:");
        System.out.println(miArticulo.calcularPrecioAlMayor());
        
        System.out.println("El precio al detalle es:");
        System.out.println(miArticulo.calcularPrecioAlDetalle());
        
        System.out.println("Ingrese el costo base del articulo");
        double costoBase2 = Double.valueOf(scanner.nextLine());
        
        Articulo miArticulo2 = new Articulo();
        miArticulo2.definirCostoBase(costoBase2);
        
        System.out.println("El precio al mayor es:");
        System.out.println(miArticulo2.calcularPrecioAlMayor());
        
        System.out.println("El precio al detalle es:");
        System.out.println(miArticulo2.calcularPrecioAlDetalle());
    }
}

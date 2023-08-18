/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.objects.inheritance;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        Moto moto = new Moto();
        Camion camion = new Camion(5);
        Carro carro = new Carro();
        
        moto.setAño(2000);
        moto.setColor("rojo");
        moto.setPlaca("Masd524");
        moto.imprimirDatos();
        
        camion.setAño(2015);
        camion.setColor("Blanco");
        camion.setPlaca("Csda587");
        camion.imprimirDatos();
        
        carro.setAño(2020);
        carro.setColor("rojo");
        carro.setPlaca("Pdfw741");
        carro.imprimirDatos();
    }

}

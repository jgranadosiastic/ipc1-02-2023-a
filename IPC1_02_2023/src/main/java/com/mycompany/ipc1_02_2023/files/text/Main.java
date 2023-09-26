/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.files.text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author jose
 */
public class Main {
    
    private static final String PATH_ARCHIVO_TEXTO = "/home/jose/algo.txt";
    private static final String PATH_CARPETA = "/home/jose";
    
    public static void main(String[] args) {
        
        File carpeta = new File(PATH_CARPETA);
        System.out.println("Existe?" + carpeta.exists());
        System.out.println("Es carpeta?" + carpeta.isDirectory());
        System.out.println("se puede modificar?" + carpeta.canWrite());
        System.out.println("es oculto?" + carpeta.isHidden());
        String[] paths = carpeta.list();
        for (String pathArchivo : paths) {
            File archivoEnCarpeta = new File(PATH_CARPETA + "/" + pathArchivo);
            if (archivoEnCarpeta.isHidden()) {
                System.out.println(pathArchivo);
            }
        }
        
        File archivoText = new File(PATH_ARCHIVO_TEXTO);
        /*FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(archivoText);
            fileOutputStream.write("hola mundo".getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            // manejar el error
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    // muy mala suerte
                }
                
            }
        }*/
        
        FileWriter fileWrite = null;
        try {
            fileWrite = new FileWriter(archivoText, true);
            fileWrite.append("Hola");
            fileWrite.append(" Mundo");
            fileWrite.close();
        } catch (IOException e) {
            // manejar el error
            e.printStackTrace();
        } finally {
            if (fileWrite != null) {
                try {
                    fileWrite.close();
                } catch (IOException e) {
                    // muy mala suerte
                }
                
            }
        }
    }
}

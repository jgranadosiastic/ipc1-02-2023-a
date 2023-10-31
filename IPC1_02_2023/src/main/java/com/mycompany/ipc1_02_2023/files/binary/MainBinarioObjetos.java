/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.files.binary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class MainBinarioObjetos {
    static String pathPrincipal = "libros";

    public static void main(String[] args) {

        File carpetaLibros = new File(pathPrincipal);
        if (!carpetaLibros.exists()) {
            carpetaLibros.mkdir();
        }

        Libro libro1 = new Libro("1111", "autor1", "titulo1", "ed1", 1, LocalDate.now());
        Libro libro2 = new Libro("2222", "autor2", "titulo2", "ed2", 2, LocalDate.now());

        guardarLibro(libro1);
        guardarLibro(libro2);
        
        Libro recuperado = cargarLibro("1111");
        System.out.println(recuperado);
    }

    private static void guardarLibro(Libro libro) {
        File archivo = new File(pathPrincipal + File.separatorChar + libro.getIsbn());
        try (FileOutputStream fileOutpuStream = new FileOutputStream(archivo);
                ObjectOutputStream binarioStream = new ObjectOutputStream(fileOutpuStream);) {
            binarioStream.writeObject(libro);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static Libro cargarLibro(String isbn) {
        File archivo = new File(pathPrincipal + File.separatorChar + isbn);
        if (!archivo.exists()) {
            return null;
        }
        try (FileInputStream fileInputStream = new FileInputStream(archivo);
                ObjectInputStream binaryStream = new ObjectInputStream(fileInputStream);) {
            Libro libroLeido = (Libro) binaryStream.readObject();
            return libroLeido;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.files.binary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class MainBinarioSimple {

    static String pathPrincipal = "libros";
    static String pathTodosLibros = pathPrincipal + File.separatorChar + "todos.bin";

    public static void main(String[] args) {

        File carpetaLibros = new File(pathPrincipal);
        if (!carpetaLibros.exists()) {
            carpetaLibros.mkdir();
        }

        Libro libro1 = new Libro("1111", "autor1", "titulo1", "ed1", 1, LocalDate.now());
        Libro libro2 = new Libro("2222", "autor2", "titulo2", "ed2", 2, LocalDate.now());

        guardarLibro(libro1);
        guardarLibro(libro2);
        
        Libro recuperado = cargarLibro("3333");
        System.out.println(recuperado);
    }

    private static void guardarLibro(Libro libro) {
        File archivo = new File(pathTodosLibros);
        try (FileOutputStream fileOutpuStream = new FileOutputStream(archivo, true); DataOutputStream binarioStream = new DataOutputStream(fileOutpuStream);) {
            binarioStream.writeUTF(libro.getIsbn());
            binarioStream.writeUTF(libro.getAutor());
            binarioStream.writeUTF(libro.getTitulo());
            binarioStream.writeUTF(libro.getEditorial());
            binarioStream.writeInt(libro.getEdicion());
            binarioStream.writeBoolean(libro.isActivo());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Libro cargarLibro(String isbn) {
        File archivo = new File(pathTodosLibros);
        Libro libro = null;
        try (FileInputStream fileInputStream = new FileInputStream(archivo); DataInputStream binarioStream = new DataInputStream(fileInputStream);) {
            libro = new Libro();
            libro.setIsbn(binarioStream.readUTF());
            libro.setAutor(binarioStream.readUTF());
            libro.setTitulo(binarioStream.readUTF());
            libro.setEditorial(binarioStream.readUTF());
            libro.setEdicion(binarioStream.readInt());
            libro.setActivo(binarioStream.readBoolean());
            while (!libro.getIsbn().equals(isbn)) {
                libro = new Libro();
                libro.setIsbn(binarioStream.readUTF());
                libro.setAutor(binarioStream.readUTF());
                libro.setTitulo(binarioStream.readUTF());
                libro.setEditorial(binarioStream.readUTF());
                libro.setEdicion(binarioStream.readInt());
                libro.setActivo(binarioStream.readBoolean());
            }
        } catch (EOFException e) {
            System.out.println("No se encontro el libro con isbn " + isbn);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return libro;
    }
}

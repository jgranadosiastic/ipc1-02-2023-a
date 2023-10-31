/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ipc1_02_2023.files.binary;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class Libro implements Serializable {
    
    private static final long serialVersionUID = 1564654879515L;
    
    private String isbn;
    private String autor;
    private String titulo;
    //private String editorial;
    private int edicion;
    private LocalDate fechaPublicacion;
    private boolean activo;

    public Libro() {
    }

    
    public Libro(String isbn, String autor, String titulo, String editorial, int edicion, LocalDate fechaPublicacion) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        //this.editorial = editorial;
        this.edicion = edicion;
        this.fechaPublicacion = fechaPublicacion;
        activo = true;
    }
    
    @Override
    public String toString() {
        return String.format("LIBRO: isbn: %s, autor: %s, titulo: %s, editorial: %s, edicion: %d, fecha publicacion: %s, activo: %s",
                isbn,
                autor,
                titulo,
                "ssss",//editorial,
                edicion,
                fechaPublicacion,
                activo);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return null;//editorial;
    }

    public void setEditorial(String editorial) {
        //this.editorial = editorial;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}

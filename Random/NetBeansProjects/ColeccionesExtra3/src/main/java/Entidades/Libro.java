/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.HashSet;

/**
 *
 * @author juana
 */
public class Libro {
    
    
    String titulo;
    String autor;
    int nroEjemplares;
    int nroPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int nroEjemplares, int nroPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroEjemplares = nroEjemplares;
        this.nroPrestados = nroPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroEjemplares() {
        return nroEjemplares;
    }

    public void setNroEjemplares(int nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public int getNroPrestados() {
        return nroPrestados;
    }

    public void setNroPrestados(int nroPrestados) {
        this.nroPrestados = nroPrestados;
    }
    
    
}

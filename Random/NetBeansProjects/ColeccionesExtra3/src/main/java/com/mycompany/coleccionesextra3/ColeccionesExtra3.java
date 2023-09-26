/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coleccionesextra3;

import Entidades.Libro;
import Servicio.ServicioLibro;
import java.util.HashSet;

/**
 *
 * @author juana
 */
public class ColeccionesExtra3 {
HashSet <Libro> libritos = new HashSet();

    public static void main(String[] args) {
        ServicioLibro libros = new ServicioLibro();
        
        libros.agregarAlgunos();
      //  libros.agregarLibros();
        libros.prestamo();
        libros.devolucion();
        libros.mostrar();
    }
}

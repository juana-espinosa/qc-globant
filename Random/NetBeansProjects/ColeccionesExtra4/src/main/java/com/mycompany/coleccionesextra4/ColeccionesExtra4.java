/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coleccionesextra4;

import Entidades.Ciudades;

/**
 *
 * @author juana
 */
public class ColeccionesExtra4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Ciudades ciudad = new Ciudades();
        ciudad.agregarDefectos();
        ciudad.agregarCiudades();
        ciudad.mostrarCiudades();
        ciudad.encontrarCiudad();
        ciudad.removerCiudades();
        ciudad.mostrarCiudades();
    }
}

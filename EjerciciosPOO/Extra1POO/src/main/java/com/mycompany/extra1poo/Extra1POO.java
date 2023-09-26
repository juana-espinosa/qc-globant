/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.extra1poo;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Extra1POO {

    public static void main(String[] args) {
        String nombre;
        String autor;
        
        Cancion song = new Cancion();
        
        System.out.println("Ingrese su cancion");
        Scanner scanner = new Scanner(System.in);
        nombre = scanner.next();
        song.setTitulo(nombre);
        System.out.println("Ingrese el autor");
        autor = scanner.next();
        song.setAutor(autor);
        
        System.out.println("Su cancion es" +nombre+ " del autor " +autor);
    }
}

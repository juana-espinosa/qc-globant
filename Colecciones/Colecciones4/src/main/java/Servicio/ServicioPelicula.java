/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Peliculas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class ServicioPelicula {

    ArrayList<Peliculas> pelis = new ArrayList();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void agregarPeliculas() {
        Peliculas peli = new Peliculas();
        System.out.println("Hola! Ingrese el nombre de la peli");
        peli.setTitulo(read.next());
        System.out.println("Hola! Ingrese la duracion de la peli");
        peli.setDuracion(read.nextInt());
        System.out.println("Hola! Ingrese el director de la peli");
        peli.setDirector(read.next());
        pelis.add(peli);
    }
    public void mostrarPelis(){
     int peliNro = 1;
        for (Peliculas peli : pelis) {
            System.out.println("---------------------------------------------");
            System.out.println("La peli numero: " + peliNro + " Nombre: " + peli.getTitulo());
            System.out.println();
            System.out.println("---------------------------------------------");
            peliNro++;
        }
    }
    
    public void ordenarPelis(){
    
    }
}

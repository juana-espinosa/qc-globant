/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class ServicioLibro {

    HashSet<Libro> libros = new HashSet();

    public void agregarAlgunos() {
        Libro libreto = new Libro();
        libreto.setTitulo("Manual");
        libreto.setAutor("Juana");
        libreto.setNroEjemplares(10);
        libreto.setNroPrestados(2);
        libros.add(libreto);
        Libro libro2 = new Libro();
        libro2.setTitulo("Felicidad");
        libro2.setAutor("Sonia");
        libro2.setNroEjemplares(8);
        libro2.setNroPrestados(1);
        libros.add(libro2);
        Libro libro3 = new Libro();
        libro3.setTitulo("Fangirl");
        libro3.setAutor("Rainbow");
        libro3.setNroEjemplares(9);
        libro3.setNroPrestados(5);
        libros.add(libro3);
        Libro libro4 = new Libro();
        libro4.setTitulo("Belo mundo, onde você está");
        libro4.setAutor("Sally Rooney");
        libro4.setNroEjemplares(15);
        libro4.setNroPrestados(2);
        libros.add(libro4);
        Libro libro5 = new Libro();
        libro5.setTitulo("Percy Jackson");
        libro5.setAutor("Rick Riordan");
        libro5.setNroEjemplares(15);
        libro5.setNroPrestados(4);
        libros.add(libro5);
        Libro libro6 = new Libro();
        libro6.setTitulo("Por lugares Incrivveis");
        libro6.setAutor("Jennifer Niven");
        libro6.setNroEjemplares(20);
        libro6.setNroPrestados(5); 
        libros.add(libro6);
    }

    public void agregarLibros() {
        Libro librito = new Libro();
        System.out.println("Ingrese el titulo");
        Scanner read1 = new Scanner(System.in);
        String nombrecito = read1.next();
        librito.setTitulo(nombrecito);
        System.out.println("Ingrese el autor");
        Scanner read2 = new Scanner(System.in);
        String autorcito = read2.next();
        librito.setAutor(autorcito);
        System.out.println("Ingrese el NUMERO DE EJEMPLARES");
        Scanner read3 = new Scanner(System.in);
        int ejemplares = read3.nextInt();
        librito.setNroEjemplares(ejemplares);
        System.out.println("Ingrese el NUMERO DE EJEMPLARES PRESTADOS");
        Scanner read4 = new Scanner(System.in);
        int ejemplaresP = read4.nextInt();
        librito.setNroPrestados(ejemplaresP);
        libros.add(librito);
    }

    public void prestamo() {
        System.out.println("Ingrese el titulo");
        Scanner read1 = new Scanner(System.in);
        String nombrecito = read1.next();

        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libroActual = iterator.next();
            if (libroActual.getTitulo().equals(nombrecito)) {
                libroActual.setNroPrestados(libroActual.getNroPrestados()+ 1);
                libroActual.setNroEjemplares(libroActual.getNroEjemplares() - 1);

                return;
            }
        }

    }

    public void devolucion() {
        System.out.println("Ingrese el titulo");
        Scanner read1 = new Scanner(System.in);
        String nombrecito = read1.next();

        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libroActual = iterator.next();
            if (libroActual.getTitulo().equals(nombrecito)) {
                libroActual.setNroPrestados(libroActual.getNroPrestados()- 1);
                libroActual.setNroEjemplares(libroActual.getNroEjemplares() + 1);

                return;
            }
        }
    }

    public void mostrar() {
        int libroNro = 1;
        for (Libro librillos : libros) {
            System.out.println("---------------------------------------------");
            System.out.println("El libro numero: " + libroNro);
            System.out.println(" Nombre: " + librillos.getTitulo());
            System.out.println("El autor es : " + librillos.getAutor());
            System.out.println(" Cantidad de ejemplares es : " + librillos.getNroEjemplares());
            System.out.println("Cantidad de prestados es : " + librillos.getNroPrestados());
            System.out.println();
            System.out.println("---------------------------------------------");
            libroNro++;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.coleccionesextra2;

import Entidade.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;
import Servicio.ServicioCantante;

/**
 *
 * @author juana
 */
public class ColeccionesExtra2 {

    public static void main(String[] args) {
       // System.out.println("Hello World!");

        ServicioCantante cantante1 = new ServicioCantante();

        System.out.println("Hola! Elija una opción");
        System.out.println("1 - Agregar cantante");
        System.out.println("2 - Ver cantantes");
        System.out.println("3 - Remover cantante");
        System.out.println("5 - Salir");
        Scanner read = new Scanner(System.in);
        int option = read.nextInt();
        //pais.agregarAlgunos();

        do {
            switch (option) {
                case 1 -> {
                    cantante1.agregarAlgunos();
                    System.out.println("A continuación te pediremos unos datos");
                    cantante1.agregarPorUser();
                    System.out.println("Hola! Elija una opción");
                    System.out.println("1 - Agregar cantante");
                    System.out.println("2 - Ver cantantes");
                    System.out.println("3 - Remover cantante");
                    System.out.println("5 - Salir");
                    option = read.nextInt();
                }
                case 2 -> {
                    cantante1.agregarAlgunos();
                 cantante1.mostrarCantantes();
                    System.out.println("Hola! Elija una opción");
                    System.out.println("1 - Agregar cantante");
                    System.out.println("2 - Ver cantantes");
                    System.out.println("3 - Remover cantante");
                    System.out.println("5 - Salir");
                    option = read.nextInt();
                }
                case 3 -> {
                    cantante1.agregarAlgunos();
                    String cantanteABorrar;
                    Scanner leer = new Scanner(System.in);
                    cantanteABorrar = leer.next();
                    cantante1.removerCantante();
                    System.out.println("Hola! Elija una opción");
                    System.out.println("1 - Agregar cantante");
                    System.out.println("2 - Ver cantantes");
                    System.out.println("3 - Remover cantante");
                    System.out.println("5 - Salir");
                    option = read.nextInt();
                }
            }

        } while (option != 5);
        cantante1.agregarAlgunos();
        cantante1.mostrarCantantes();
    }
}

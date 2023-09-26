/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.colecciones1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Colecciones1 {

    public static void main(String[] args) {
        //Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
        //programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
        //después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
        //salir, se mostrará todos los perros guardados en el ArrayList

        ArrayList<String> arraycitoPerros;

        arraycitoPerros = new ArrayList();
        //boolean menu = true;
        String raza = "";

        Scanner scanner = new Scanner(System.in);
        Scanner leerTexto = new Scanner(System.in);
        arraycitoPerros.add("Beagle");
        arraycitoPerros.add("Caniche");
        arraycitoPerros.add("Labrador");

        System.out.println("Elija 1 si quieres ingresar una raza, y 2 si quiere ver las razas ingresadas, 3 si quieres borrar alguno y 4 si quieres salir");
        int option = scanner.nextInt();

        while (option != 4) {
            switch (option) {
                case 1 -> {
                    System.out.println("Ingrese la raza de perro");
                    raza = scanner.next();
                    arraycitoPerros.add(raza);
                    System.out.println("Elija 1 si quieres ingresar una raza, y 2 si quiere ver las razas ingresadas o 3 si quieres borrar alguno");
                    option = scanner.nextInt();
                }
                case 2 -> {
                    System.out.println("Te vamos a mostrar las razas ingresadas");
                    System.out.println(" ");
                    for (String razita : arraycitoPerros) {
                        System.out.print(razita + " --- ");
                    }
                    System.out.println("Elija 1 si quieres ingresar una raza, y 2 si quiere ver las razas ingresadas o 3 si quieres borrar alguno");
                    option = scanner.nextInt();
                }
                case 3 -> {
                    System.out.println("Indicanos el perro que deseas borrar");
                    String perroABorrar = leerTexto.next();
                    boolean borro = false;

                    Iterator<String> iterator = arraycitoPerros.iterator();

                    while (iterator.hasNext()) {
                        String razita = iterator.next();
                        if (razita.equals(perroABorrar)) {
                            iterator.remove();
                            System.out.println("Esta raza fue borrada de la lista.");
                            for (String razitaMostrar : arraycitoPerros) {
                                System.out.print(razitaMostrar + " --- ");
                            }
                            borro = true;

                            break;
                        }
                    }
                    if (borro = false) {
                        System.out.println("Esta raza no es parte de la lista.");
                        for (String razitaMostrar : arraycitoPerros) {
                        System.out.print(razitaMostrar + " --- ");
                    }
                    }
                    System.out.print("Elija 1 si quieres ingresar una raza, y 2 si quiere ver las razas ingresadas o 3 si quieres borrar alguno");
                    option = scanner.nextInt();

                }

            }
        }

        System.out.println("Gracias por usar nuestro proyecto!");
    }
}

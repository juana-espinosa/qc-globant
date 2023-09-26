/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Ciudades {

    HashMap<Integer, String> ciudades = new HashMap();

    // Add keys and values (Country, City)
    public void agregarDefectos() {
        ciudades.put(11000, "Montevideo");
        ciudades.put(88180, "Florianopolis");
        ciudades.put(94760, "Porto Alegre");
        ciudades.put(28300, "Madrid");
        ciudades.put(50066, "Firenze");
        ciudades.put(20081, "Milano");
        ciudades.put(4100, "Porto");
        //System.out.println(ciudades);
    }

    public void agregarCiudades() {
        System.out.println("Ingrese el codigo postal");
        Scanner readInt = new Scanner(System.in);
        int codigoPostal = readInt.nextInt();
        System.out.println("Ingrese la ciudad");
        Scanner readString = new Scanner(System.in);
        String city = readString.next();
        ciudades.put(codigoPostal, city);
    }

    public void mostrarCiudades() {
        System.out.println(ciudades);
    }

    public void encontrarCiudad() {
        System.out.println("Ingrese el codigo postal");
        Scanner readInt = new Scanner(System.in);
        int codigoPostalAEncontrar = readInt.nextInt();
        if (ciudades.containsKey(codigoPostalAEncontrar)) {
            System.out.println("La ciudad de esa clave es " +ciudades.get(codigoPostalAEncontrar));
        } else {
            System.out.println("No hay una ciudad con esa clave");
        }
    }
    public void removerCiudades(){
    System.out.println("Ingrese el codigo postal");
        Scanner readInt = new Scanner(System.in);
        int codigoPostalABorrar = readInt.nextInt();
        if (ciudades.containsKey(codigoPostalABorrar)) {
            ciudades.remove(codigoPostalABorrar);
            System.out.println("La ciudad fue borrada");
        } else {
            System.out.println("No hay una ciudad con esa clave");
        }
    }

}

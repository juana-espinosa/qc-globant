/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Perro {

    String nombre;
    int edad;
    String raza;
    String tamano;
    ArrayList perritos = new ArrayList();

    public Perro(String nombre, int edad, String raza, String tamano) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Perro crearPerro() {
        Scanner leer = new Scanner(System.in); 
        Perro perrillo = new Perro();

        System.out.println("Por favor, ingrese el nombre del perrito");
        perrillo.setNombre(leer.next());
        System.out.println("Por favor, ingrese el tamano");
        perrillo.setNombre(leer.next());
        System.out.println("Por favor, ingrese la edad del perrito");
        perrillo.setNombre(leer.next());
        System.out.println("Por favor, ingrese la raza del perrito");
        perrillo.setNombre(leer.next());
        perritos.add(perrillo);     
        
        return perrillo;
    }
}

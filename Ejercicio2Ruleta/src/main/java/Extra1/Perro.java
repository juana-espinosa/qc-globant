/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra1;

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

    public void crearPerro() {
        Scanner leer = new Scanner(System.in);

        Perro perrito1 = new Perro("Boniato", 15, "Sin Raza", "Chico");
        perritos.add(perrito1);
        Perro perrito2 = new Perro("Patata", 9, "Beagle", "Chico");
        perritos.add(perrito2);
        Perro perrito3 = new Perro("Anana", 2, "Pitbul", "Medio");
        perritos.add(perrito3);
       
    }
}


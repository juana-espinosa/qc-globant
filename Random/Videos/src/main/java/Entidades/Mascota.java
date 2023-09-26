/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author juana
 */
public class Mascota {
    public String nombre;
    public String apodo;
   //conejo, caballo, perro, gato
    public String tipo;
    public String color;
    public String raza;
    public int edad;
    public boolean cola;
  //constructor publico  
    public Mascota() {
    
    }
    public Mascota (String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, String raza, int edad, boolean cola) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.cola = cola;
    }
    
}

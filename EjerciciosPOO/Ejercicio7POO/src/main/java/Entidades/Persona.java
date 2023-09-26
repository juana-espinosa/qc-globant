/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author juana
 */
//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
//atributo, puede hacerlo. Los métodos que se implementarán son:
public class Persona {

    public String nombre;
    public int edad;
    public String sexo;
    public double peso;
    public String altura;
    public double alturaDouble;

    // Un constructor por defecto. 
    public Persona() {
    }
    // Un constructor con todos los atributos como parámetro.

    public Persona(String nombre, int edad, String sexo, int peso, String altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
// Métodos getters y setters de cada atributo.
//get

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public String getAltura() {
        return altura;
    }
    //set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
// Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje

    public void crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = scanner.next();
        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();
        System.out.println("Ingrese su sexo: O (otro) M (mujer) o H (hombre) ");
        sexo = scanner.next();
        if (sexo.equals("O") || sexo.equals("M") || sexo.equals("H")) {
            System.out.println("Bien");
        } else {
            System.out.println("Ingresaste un sexo invalido, vuelva a intentar");
            System.out.println("Ingrese su sexo: O (otro) M (mujer) o H (hombre) ");
            sexo = scanner.next();
        }
        System.out.println("Ingrese su peso");
        peso = scanner.nextInt();
        System.out.println("Ingrese su altura");
        altura = scanner.next();
        alturaDouble = Double.parseDouble(altura);
    }
// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.

    public void calcularIMC() {
        double IMC;
        IMC = (peso / (alturaDouble * alturaDouble));
        if (IMC < 20) {
            System.out.println("-1");
        }
        if ((IMC > 20) && (IMC <= 25)) {
            System.out.println("0");
        }
        if (IMC > 25) {
            System.out.println("1");
        }
    }
// Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.

    public boolean esMayorDeEdad() {
        boolean validacion = false;
        if (edad >= 18) {
            validacion = true;
        }
        System.out.println("Sos mayor? " + validacion);
        return validacion; 
    }
}

















//public void buscarGenero(String genero, Pelicula[] p) {
//    boolean encontrado = false;
//
//    for (int i = 0; i < p.length; i++) {
//        if (p[i].getGenero().equals(genero)) {
//            System.out.println(p[i].toString());
//            encontrado = true;
//        }
//    }
//
//    if (!encontrado) {
//        System.out.println("Actualmente no trabajamos con este género");
//    } else {
//        System.out.println("Estamos felices en contarles que trabajamos con este género");
//    }
//}

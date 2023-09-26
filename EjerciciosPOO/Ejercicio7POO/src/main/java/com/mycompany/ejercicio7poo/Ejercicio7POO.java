/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio7poo;

import Entidades.Persona;

/**
 *
 * @author juana
 */
public class Ejercicio7POO {
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        persona1.crearPersona();
        persona1.calcularIMC();
        persona1.esMayorDeEdad();
        
        persona2.crearPersona();
        persona2.calcularIMC();
        persona2.esMayorDeEdad();
        persona3.crearPersona();
        persona3.calcularIMC();
        persona3.esMayorDeEdad();
        persona4.crearPersona();
        persona4.calcularIMC();
        persona4.esMayorDeEdad();
        


    }
}

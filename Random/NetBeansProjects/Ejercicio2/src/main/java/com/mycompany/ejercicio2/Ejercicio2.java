/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio2;

import Entidades.Circunferencia;

/**
 *
 * @author juana
 */
public class Ejercicio2 {

    /* # Ejercicio 2
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/

    public static void main(String[] args) {

        Circunferencia circulo = new Circunferencia();
        circulo.crearCircunferencia();
        circulo.calcularArea();
        circulo.calcularPerimetro();
    }

}

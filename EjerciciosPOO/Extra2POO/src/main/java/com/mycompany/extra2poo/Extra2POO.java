/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.extra2poo;

import Entidades.Puntos;

/**
 *
 * @author juana
 */

//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
//los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
//calcular la distancia entre dos puntos consulte el siguiente link:

public class Extra2POO {

    public static void main(String[] args) {
        Puntos puntitos = new Puntos();
        puntitos.crearPuntos();
        System.out.println("El calculo de la distancia de sus puntos es " +puntitos.calcularPuntos());
        //puntitos.calcularPuntos();
    }
}

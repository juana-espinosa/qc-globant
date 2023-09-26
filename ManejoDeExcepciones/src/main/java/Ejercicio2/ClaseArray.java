/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author juana
 */
public class ClaseArray {
    private int[] arreglo;

    public ClaseArray(int tamaño) {
        arreglo = new int[tamaño];
    }

    public void asignarValor(int indice, int valor) {
        try {
            arreglo[indice] = valor;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Error! Índice fuera de rango.");
        }
    }

    public int obtenerValor(int indice) {
        try {
            return arreglo[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Error! Índice fuera de rango. Se devuelve 0 por defecto.");
            return 0;
        }
    }

   // public static void main(String[] args) {
      
    }
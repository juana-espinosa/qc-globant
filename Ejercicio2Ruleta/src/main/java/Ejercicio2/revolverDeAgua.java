/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author juana
 */
public class revolverDeAgua {

    int posicionActual;
    int posicion;
//constructores

    public revolverDeAgua() {
    }

    public revolverDeAgua(int posicionActual, int posicion) {
        this.posicionActual = posicionActual;
        this.posicion = posicion;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void llenarRevolver() {
        int max = 20;
        int min = 0;
        //posicionActual = (int) (Math.random() * 25 + 1);
       posicionActual = 5;
        System.out.println("La posicion actual del tambor es: " + posicionActual);
        //posicion = (int) (Math.random() * 25 + 1);
        posicion = 5;
        System.out.println("La posicion del agua es: " + posicion);
    }

    public boolean mojar() {
        boolean validar = false;
        if (posicionActual == posicion) {
            validar = true;
            System.out.println("Las posiciones son iguales? " + validar);
        } else {
            System.out.println("Las posiciones son iguales?" + validar);
        }
        return validar;

    }

    public void siguienteChorro() {
        //posicionActual = (int) (Math.random() * 25 + 1);
        System.out.println("La posicion actual del tambor es: " + posicionActual);
    }

    //@Override
    public String toString() {
        //System.out.println("La posicion actual del tambor es: "+posicionActual);
        // System.out.println("La posicion actual del tambor es: "+posicion);
        String posicionAcString = Integer.toString(posicionActual);
        String posicionString = Integer.toString(posicion);
        String dosJuntos = posicionAcString + " " +posicionString;
        System.out.println("La posicion actual del tambor es: "+posicionAcString+ " y la del agua es " +posicionString);
        return dosJuntos;
        //return posicionString;

    }
}

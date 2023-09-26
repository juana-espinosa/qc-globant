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
//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
//cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
//métodos:
public class Cafetera {

    public int capacidadMaxima = 4000;
    public int cantidadActual;

    //- Constructor predeterminado o vacío
    public Cafetera() {
    }
    //- Constructor con la capacidad máxima y la cantidad actual

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    //- Métodos getters y setters.
//get

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
    //set

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
//- Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.    

    public void servirTaza(int tamanoTaza) {
        int taza = 0;
        //int servir = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cuanto hay en la cafetera");
        cantidadActual = scanner.nextInt();
        if (cantidadActual <= tamanoTaza) {
            taza = taza + cantidadActual;
            cantidadActual = cantidadActual - taza;
        } else {
            taza = tamanoTaza;
            cantidadActual = cantidadActual - tamanoTaza;
        }
        //servir = cantidadActual - tamanoTaza;
        System.out.println("Su taza ahora tiene: " + taza);
    }

//- Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
    public void llenarCafetera() {
        System.out.println("Su cantidad actual es " + cantidadActual);
        cantidadActual = capacidadMaxima;
        System.out.println("Ahora que esta llena es " + cantidadActual);

    }

    //- Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafereta() {
        cantidadActual = 0;
        System.out.println("Ahora que esta vacia es " + cantidadActual);
    }
//- Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada
    public void agregarCafe(int agregando) {
        int libre;
        libre = capacidadMaxima - cantidadActual;
        if (agregando <= libre) {
            cantidadActual = cantidadActual + agregando;
            System.out.println("Ahora tiene " + cantidadActual + " ml");
        } else {
            Scanner scanner = new Scanner(System.in);
            cantidadActual = scanner.nextInt();
            System.out.println("Estas intentando poner mas cafe del espacio que tenes, podes poner maximo " + libre);
        }
    }    
}
 
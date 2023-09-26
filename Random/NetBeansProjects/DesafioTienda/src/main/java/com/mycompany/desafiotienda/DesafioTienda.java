/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.desafiotienda;

import Entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class DesafioTienda {

    public static void main(String[] args) {
//En el main, se creará un ArrayList de tipo Producto que guardará todos los productos creados. A
//continuación, tendrás que crear un bucle que solicite al usuario los datos de cada producto y los setee en el objeto 
//Producto correspondiente, que se agregará al ArrayList.
        Producto p1 = new Producto();
        ArrayList<Producto> arrayProductos = new ArrayList<>();

        boolean menu = true;

        //menu
        System.out.println("Ingrese 1 si quieres agregar un producto");
        System.out.println("Ingrese 2 si quieres salir");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        while (menu) {
            switch (option) {
            }
            
        }
    }
}

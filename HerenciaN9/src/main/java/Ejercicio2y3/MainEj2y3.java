/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2y3;

import java.util.ArrayList;

/**
 *
 * @author juana
 */
public class MainEj2y3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ej2
        
        Lavadora l = new Lavadora();
        l.crearLavadora();
        l.precioFinal();
        l.mostrarLavadora();
        System.out.println("-----");
        System.out.println("");
        Televisor t = new Televisor();
        t.crearTelevisor();
        t.precioFinal();
        t.mostrarTelevisor();
        */
        
          ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();
        Lavadora l1,l2;
        Televisor t1,t2;
        Double precioTotal = 0d;
        Double precio;
        
        l1 = new Lavadora(35, 1000d, 50, "gris", 'd');
        l2 = new Lavadora(30, 1000d, 60, "negro", 'b');
        t1 = new Televisor(720, true, 1000d, 25, "negro", 'c');
        t2 = new Televisor(1080, false, 1000d, 30, "rojo", 'e');
        
        listaElectrodomesticos.add(l1);
        listaElectrodomesticos.add(l2);
        listaElectrodomesticos.add(t1);
        listaElectrodomesticos.add(t2);
        
        for (int i = 0; i < listaElectrodomesticos.size(); i++) {
            listaElectrodomesticos.get(i).precioFinal();
            precio = listaElectrodomesticos.get(i).getPrecio();
            System.out.println("Precio "+i+": "+precio);
            precioTotal += precio;
        }
        System.out.println("El precio total de todos los electrodomesticos es: " + precioTotal);
        
    
    }
    
}

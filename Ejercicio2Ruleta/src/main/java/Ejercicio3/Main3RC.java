/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author juana
 */
public class Main3RC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Baraja b = new Baraja();
        ArrayList<Carta> mano = new ArrayList();
        //Carta c ;
        int posicion = 0;
        int cantCartas = 5;
        
        b.llenarBaraja();
        b.barajar();
        b.mostrarBaraja(posicion);
        System.out.println("-----");
        
        while (posicion < 40){
            mano = b.darCartas(cantCartas, posicion);
            System.out.println("Mano repartida: ");
            System.out.println(mano.toString());
            b.cartasMonton();
            //b.cartasDisponibles(posicion);
            mano = new ArrayList();
            posicion += cantCartas;
        }
    }
    
}

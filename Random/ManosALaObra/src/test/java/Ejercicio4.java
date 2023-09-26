
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juana
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
        String name;
        int age;

        System.out.println("Escriba su nombre");
        Scanner read = new Scanner(System.in);
        name = read.next();
         System.out.println("Escriba su edad");
        age = read.nextInt();
        
        System.out.println("Su nombre es " +name+ " y su edad es " +age+ " años.");
    }

}

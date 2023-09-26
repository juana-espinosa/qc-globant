/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;


/**
 *
 * @author juana
 */
public class MainEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseArray ejemplo = new ClaseArray(5);

        ejemplo.asignarValor(0, 10);
        ejemplo.asignarValor(1, 20);
        ejemplo.asignarValor(2, 30);
       // ejemplo.asignarValor(3, 40);
        //ejemplo.asignarValor(4, 50);

        // Intentamos acceder a un índice fuera de rango
        int valorFueraDeRango = ejemplo.obtenerValor(10);

        System.out.println("Valor obtenido: " + valorFueraDeRango);
    }
    
}

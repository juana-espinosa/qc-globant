/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3y4;

/**
 *
 * @author juana
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DivisionNumero cuentas = new DivisionNumero();
        cuentas.hacerNumeros();
        
        try{
        cuentas.dividir();
        } catch (ArithmeticException e){
            System.out.println("Imposible dividir por 0");
        }
        // TODO code application logic here
    }
    
}

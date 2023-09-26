/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3y4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class DivisionNumero {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
     String numero1; 
     String numero2;
     int numero1Int;
     int numero2Int;
     int resultado;
    
    public void hacerNumeros(){

     System.out.println("Porfa ingresa los numeros");
     numero1 = read.next();
     numero2 = read.next();
     try{
     numero1Int = Integer.parseInt(numero1);
     numero2Int = Integer.parseInt(numero2);
     }catch(InputMismatchException e){
     System.out.println("Ingreso erroneo");
     }
     catch(NumberFormatException e){
         System.out.println("Numero invalido, intente nuevamente");
             }
     
    }
    
    public void dividir(){
     resultado = numero1Int / numero2Int;
        System.out.println("El resultado es " +resultado);

    }
}

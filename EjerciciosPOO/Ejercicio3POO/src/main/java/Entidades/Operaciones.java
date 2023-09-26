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
public class Operaciones {

    private int number1;
    private int number2;

    public Operaciones(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Operaciones() {
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Holis, escriba el numero 1 ");
        int numero1 = scanner.nextInt();
        number1 = numero1;
        System.out.println("Holis, escriba el numero 2 ");
        int numero2 = scanner.nextInt();
        number2 = numero2;
    }

    public void operacionSuma() {
        double suma = number1 + number2;
        System.out.println("El total de los numeros sumados es " + suma);
    }

    public void operacionResta() {
        double resta = number1 - number2;
        System.out.println("El total de los numeros con resta " + resta);
    }

    public void operacionMulti() {
        if ((number1 > 0) && (number2 > 0)) {
        double multi = number1 * number2;
        System.out.println("El total de los numeros multiplicados es " + multi);
        }
        else {System.out.println("Numero invalido");}                   
    }
    
        public void operacionDiv() {
        if ((number1 > 0) && (number2 > 0)) {
        double div = number1 / number2;
        System.out.println("El total de los numeros divididos es " + div);
        }
        else {System.out.println("Numero invalido");}                   
    }
    
}

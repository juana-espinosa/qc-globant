/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author juana
 */

//1. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//constructor vacío, parametrizado y get y set
public class Matematica {
    double number1 = Math.random() *1;
    double number2 = Math.random() *1;

    public Matematica() {
    }
    public Matematica(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
//gets
    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }
//sets
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
    //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
}

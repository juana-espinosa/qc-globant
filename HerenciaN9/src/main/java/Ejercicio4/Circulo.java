/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author juana
 */
public class Circulo implements calculoFormas {
    //PI * radio ^ 2 
    //Perímetro circulo: PI * diámetro
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    @Override
    public Double calcularPerimetro() {
        return PI * this.radio * 2;
    }

    @Override
    public Double calcularArea() {
        return PI * this.radio * this.radio;
    }
}

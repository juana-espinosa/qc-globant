/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5poo;

import Entidades.Cuenta;

/**
 *
 * @author juana
 */
public class Ejercicio5POO {

    public static void main(String[] args) {
        //System.out.println("Ingrese su numero");
        Cuenta miCuenta = new Cuenta();
        miCuenta.crearCuenta();
        miCuenta.ingresar();
        miCuenta.retirar();
        miCuenta.consultarDatos();
        miCuenta.consultarSaldo();
        miCuenta.extraccionRapida();
    }
}


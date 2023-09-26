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
public class Cuenta {

    public int numeroCuenta;
    public long DNI;
    public int saldoActual;

    //constructor vacio
    public Cuenta() {
    }

    //constructor parametros
    public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    //get
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    //set
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta");
        int nroCuenta = scanner.nextInt();
        this.numeroCuenta = nroCuenta;
        System.out.println("Ingrese su DNI");
        long cedula = scanner.nextLong();
        this.DNI = cedula;
        System.out.println("Ingrese su saldo actual");
        int saldo = scanner.nextInt();
        this.saldoActual = saldo;
    }

    public void ingresar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Su saldo actual es: " + saldoActual);
        System.out.println("Desea agregar mas saldo? Escriba 1 si desea agregar, escriba 2 sino.");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Ingrese el saldo");
            int actualizar = scanner.nextInt();
            saldoActual = saldoActual + actualizar;
            System.out.println("Su saldo actual es " + saldoActual);
        } else {
            System.out.println("Gracias por usar nuestros servicios :D");
        }
    }

    //e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
    public void retirar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Su saldo actual es: " + saldoActual);
        System.out.println("Desea retirar algo saldo? Escriba 1 si desea agregar, escriba 2 sino.");
        int option = scanner.nextInt();
        if (option == 1 && saldoActual > 0) {
            System.out.println("Ingrese el saldo que desea retirar");
            int retiro = scanner.nextInt();
            if (retiro > saldoActual) {
                System.out.println("Que ilusa, no tenes plata");
            }
            saldoActual = saldoActual - retiro;
            System.out.println("Su saldo actual es " + saldoActual);
        } else {
            System.out.println("Gracias por usar nuestros servicios :D");
        }
    }

    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo() {
        System.out.println("Su saldo actual es " + saldoActual);
    }

    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos() {
        System.out.println("El numero de cuenta tuyo es " + numeroCuenta + ", tu cedula es " + DNI + " y tu saldo actual es " + saldoActual);
    }
    //f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.    

    public void extraccionRapida() {
        double retiro20 = saldoActual * 0.20;
        System.out.println("Con esta opción, sacaremos 20% de su sueldo");
        int retiro = (int)Math.round(retiro20);
        saldoActual = saldoActual - retiro;
        System.out.println("Su saldo actual es " +saldoActual);
    }

}

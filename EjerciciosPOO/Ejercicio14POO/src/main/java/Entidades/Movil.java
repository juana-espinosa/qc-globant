/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Movil {

    public String marca;
    public double precio;
    public String modelo;
    public int memoriaRam;
    public int almacenamiento;
    int[] codigo = new int[7];

    //contructor
    public Movil() {
    }

    //constructor parametros
    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    //getters
    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

   // public int[] getCodigo() {
    //    return codigo[];
  //  }

    //ser
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public void cargarCelular() {
        Scanner scanner = new Scanner(System.in);
        Scanner lectura2 = new Scanner(System.in);
        System.out.println("Ingrese la marca del celular: ");
        String marcaCel = scanner.next();
        this.marca = marcaCel;
        System.out.println("Ingrese el precio del celular: ");
        double precioCel = scanner.nextDouble();
        this.precio = precioCel;
        System.out.println("Ingrese el modelo del celular: ");
        String modeloCel = lectura2.next();
        this.modelo = modeloCel;
        System.out.println("Ingrese la memoria del celular: ");
        int memoriaCel = scanner.nextInt();
        this.memoriaRam = memoriaCel;
        System.out.println("Ingrese el almacenamiento del celular: ");
        int almacenamientoCel = scanner.nextInt();
        this.almacenamiento = almacenamientoCel;
    }

    public void ingresarCodigo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el codigo de su celular: ");
        String code = scanner.next();
        for (int i = 0; i < 7; i++) {
            this.codigo[i] = Character.getNumericValue(code.charAt(i));  
        }

    }

    public void imprimirTodo() {
        System.out.println("Su celular es " + marca + " te salió " + precio + " el modelo es " + modelo);
        System.out.println("Además, la memoria del celular es de  " + memoriaRam + " GB, y el almacenamiento es " + almacenamiento);
        System.out.println("Por ultimo, el código de tu celular es " + Arrays.toString(codigo));
    }

}

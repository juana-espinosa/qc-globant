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
public class Nif {
    //Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
//correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
//letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:

    private long DNI;
    private String letra;

// Métodos getters y setters para el número de DNI y la letra.
//Getters
    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }
//setters

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    // Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//en mayúscula; por ejemplo: 00395469-F).

    public void mostrar() {
        System.out.println("Su cedula es " + DNI + "-" + letra);
    }

    // Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
    public void crearNif() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su cedula");
        DNI = scanner.nextLong();
    }

    //La letra correspondiente al dígito verificador se calculará a traves de un método que
//funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
//número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
//buscar en un array (vector) de caracteres la posición que corresponda al resto de la
//división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:    
    public void calcularLetra() {
        int resto = (int) (DNI % 23);
        //String[] letras = new String[22];
        String letras[] ={"T", "R", "W", "A", "G", "M","Y","F","P","D","X","B","N","J","Z","S","Q", "H","L","C","K","E"};

        for (int i = 0; i < 23; i++) {
            if (i == resto) {
            this.letra = letras[i];
            }
        }

        System.out.println("La letra que corresponde es " + letra);
    }
}

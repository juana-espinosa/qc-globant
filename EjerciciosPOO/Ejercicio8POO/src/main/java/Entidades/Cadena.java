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
public class Cadena {

    //Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
//String) y su longitud. 
    String frase;
    int tamano;
    char fraseArray[];
    int counterVocals = 0;

    //get
    public String getFrase() {
        return frase;
    }

    public int getTamano() {
        return tamano;
    }

    //set 
    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void setFraseArray(char[] fraseArray) {
        this.fraseArray = fraseArray;
    }

//constructores
    public Cadena(String frase, int tamano, char[] fraseArray) {
        this.frase = frase;
        this.tamano = tamano;
        this.fraseArray = fraseArray;
    }

    public Cadena() {
    }

    public void pasarAArray() {
        fraseArray = new char[tamano];
        for (int i = 0; i < tamano; i++) {
            this.fraseArray[i] = (frase.charAt(i));
        }
    }
//Deberá además implementar los
//siguientes métodos:

//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
    public void mostrarVocales() {
        for (int i = 0; i < tamano; i++) {
            char c = Character.toUpperCase(this.fraseArray[i]);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                counterVocals++;
            }
        }
    }
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void invertirFrase() {

    }
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    public void vecesRepetido() {
        int letraVeces = 0;
        System.out.println(" ");
        System.out.println("Escribe la letra para verificar si está repetida: ");
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.next();      
        for (int i = 0; i < tamano; i++) {
            if (fraseArray[i] == letra.charAt(0)) {
                letraVeces++;
            }
        }
        System.out.print("El carácter " + letra + " se repite " + letraVeces + " veces.");

    }

    //e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud() {
        String frase2;
         int tamano2;

        System.out.println("Escribe la otra frase: ");
        Scanner scanner = new Scanner(System.in);
        frase2 = scanner.next();
        
        tamano2 = frase2.length();
        if (tamano < tamano2) {
        System.out.println("Su frase es mas grande que la anterior");
        } if (tamano == tamano2) {
        System.out.println("Su frase es  del mismo tamano que la anterior: ");
        } else {System.out.println("Su frase es menor que la anterior");}

    }

    //f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(){
        System.out.println("");
    System.out.println("Escribe otra frase: ");
        Scanner scanner = new Scanner(System.in);
        String frasecita = scanner.next();
    System.out.println(frase+frasecita);    
    }
    
    //g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
        public void reemplazar() {
        System.out.println(" ");
        System.out.println("Escribe la letra para sustituir por a");
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.next();      
        for (int i = 0; i < tamano; i++) {
            if (fraseArray[i] == letra.charAt(0)) {
                fraseArray[i] = 'a';
            }
        }
        
            for (int i = 0; i < tamano; i++) {
            System.out.print(fraseArray[i]);
        }

    }
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
             public boolean contiene() {
                 boolean validar =false;
        System.out.println(" ");
        System.out.println("Escribe la letra para ver si esta en la frase");
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.next();      
        for (int i = 0; i < tamano; i++) {
            if (fraseArray[i] == letra.charAt(0)) {
               validar = true;
            }
        }
        System.out.println("Esta letra esta en la frase? " +validar);
        return validar;

    }   
    
}

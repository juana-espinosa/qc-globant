 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juana
 */
//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener;
//como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
//cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
//con los parámetros que sean necesarios:
public class Ahorcado {

    int x;
   // int cantidadIntentos = 0;
    char palabra[];
    int cantidadEcontrada;
    int cantidadJugMax;
    String palabrarita;
    ArrayList<Character> arraycitoGuardarLetra;
    //
    int counter = 0;
    // char letra;
    int posicion = 0;
    // char arraycitoGuardarLetra[];
// Constructores, tanto el vacío como el parametrizado.

    public Ahorcado() {
    }

    public Ahorcado(int x, char[] palabra, int cantidadEcontrada, int cantidadJugMax, String palabrarita) {
        this.x = x;
        this.palabra = palabra;
        this.cantidadEcontrada = cantidadEcontrada;
        this.cantidadJugMax = cantidadJugMax;
        this.palabrarita = palabrarita;
    }

    private void crearJuego() {
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra");
        this.palabrarita = scanner.next();
        System.out.println("Ingrese la cantidad maxima de jugadas");
        this.cantidadJugMax = scanner.nextInt();
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
//vector.        
        x = palabrarita.length();
        palabra = new char[x];
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
        for (int i = 0; i < x; i++) {
            palabra[i] = (palabrarita.charAt(i));
        }
//Y también, guarda en cantidad de jugadas máximas, el valor que ingresó el usuario y encontradas en 0.  
        this.cantidadEcontrada = 0;
        arraycitoGuardarLetra = new ArrayList<Character>();

    }
// Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.  

    private void longitud() {
        System.out.println("La longitud de su palabra es " + x);
    }
//Funcion para guardar la letra en un array y si el usuario vuelve a ingresar la misma que le tire un mensaje diciendo que esta letra ya la ingreso, si no esta en el array, llama la funcion buscar y sigue el juego

//array para guardar las letras
    public void guardarLetrasyValidar(char letra) {
        //for (int i = 0; i < cantidadJugMax+x; i++) {
        if (arraycitoGuardarLetra.contains(letra)) {
            System.out.println("Ya ingresaste esa letra, boludito");
        } else {
            arraycitoGuardarLetra.add(letra);
            //System.out.println("Agregamos su letra");
            //}  
        }

    }
    // Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.

    private void buscar(char lettra) {
        boolean validar = false;
        if (counter < cantidadJugMax) {
            for (int i = 0; i < x; i++) {
                if (lettra == palabra[i]) {
                    validar = true;
                    cantidadEcontrada++;
                    posicion = i;
                }
            }
        }
        if (validar) {
            System.out.println("La letra está en la posicion " + (posicion + 1));
        } else {
            counter++;
            System.out.println("La letra no pertenece a la palabra");
        }
    }
// Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.

    private void encontradas() {
        System.out.println("Encontraste: " + cantidadEcontrada + " te faltan " + (x - cantidadEcontrada) + " letras");

    }

    private void intentos() {
        System.out.println("Te quedan " + (cantidadJugMax - counter) + " intentos");
    }
    
    private void resultadoParcial(){
     String resultadoParc="";
     
        for (int i = 0; i < x; i++) {
             if (arraycitoGuardarLetra.contains(palabra[i])){
             resultadoParc = resultadoParc+palabra[i];
             }else {resultadoParc = resultadoParc + "_";}
        }System.out.println(resultadoParc);
        
    
    }

    public void juego() {
        Scanner scanner = new Scanner(System.in);

        char letra = 0;
        crearJuego();
        while ((counter < cantidadJugMax) && (cantidadEcontrada < x)) {
            System.out.println("Ingrese la letra a ver si esta en la palabra");
            letra = scanner.next().charAt(0);
            longitud();
            guardarLetrasyValidar(letra);
            buscar(letra);
            encontradas();
            intentos();
            resultadoParcial();
            System.out.println(arraycitoGuardarLetra);
        }
        if (counter == cantidadJugMax){
        System.out.println("Lo sentimos, no hay más oportunidades");
        }else {
        System.out.println("FELICITACIONES, ganastee :D");        }
        System.out.println("La palabra era " + palabrarita);
    }
}

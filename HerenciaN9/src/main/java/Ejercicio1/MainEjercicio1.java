/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author juana
 */
public class MainEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaracion del objeto Perro
        Animal perro1 = new Perro ("Stich", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();
        //Declaracion del objeto Perro
        Animal perro2 = new Perro ("Teddy", "Croquetas", 10, "Chiuaua");
        perro2.Alimentarse();
        
        //Declaracion del objeto Gato
        Animal gato1 = new Gato ("Pelusa", "Galletas", 15, "Siames");
        gato1.Alimentarse();
        
       //Declaracion del objeto Caballo
        Animal caballo1 = new Caballo ("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse(); 
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author juana
 */
//Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
//ecuación de 2o grado. 
//Hay que insertar estos 3 valores para construir el objeto a través de un método
//constructor. Luego, las operaciones que se podrán realizar son las siguientes:
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
//delante de -b
public class Raices {

    //Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
    private double a = 6;
    private double b = 7;
    private double c = 3;

    // Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante() {
        double discriminante;

        discriminante = Math.pow(b, 2) - 4 * a * c;
        return discriminante;
    }
    // Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.   

    public boolean tieneRaices() {
        boolean validar = false;
        if (getDiscriminante() > 0) {
            validar = true;
        }
        return validar;
    }
    // Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0. 

    public boolean tieneRaiz() {
        boolean validarUnaRaiz = false;
        if (getDiscriminante() == 0) {
            validarUnaRaiz = true;
        }
        return validarUnaRaiz;
    }
    // Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//posibles soluciones.

    public void obtenerRaices() {
        double raiz1;
        double raiz2;
        boolean validar = tieneRaices();

        if (validar == true) {
            raiz1 = (-b + Math.sqrt(getDiscriminante()) / (2 * a));
            System.out.println("La solucion 1 es " + raiz1);
            raiz2 = (-b - Math.sqrt(getDiscriminante()) / (2 * a));
            System.out.println("La solucion 2 es " + raiz2);
        } else {
            System.out.println("Tiene una sola raiz");
        }
    }

    // Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz() {
        double raiz;
        boolean validar = tieneRaiz();
        if (validar == true) {
            raiz = (-b / (2 * a));
            System.out.println("La solucion 1 es " + raiz);
        } else {
            System.out.println("Tiene mas de una raiz");
        }
    }

    // Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.   
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene solution");
        }
    }
    
}

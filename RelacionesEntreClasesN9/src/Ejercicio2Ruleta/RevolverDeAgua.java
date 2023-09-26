/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio2Ruleta;

/**
 *
 * @author juana
 */
public class RevolverDeAgua {
int posicionActual;
int posicion;
//constructores
public RevolverDeAgua(int posicionActual, int posicion) {
        this.posicionActual = posicionActual;
        this.posicion = posicion;
    }
public RevolverDeAgua() {
        
    }

//get y set 
    public String getposicionActual() {
        return posicionActual;
    }

    public void setposicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }


public void llenarRevolver(){
int max = 20;
int min = 0;
posicionActual = (Math.random() * range) + min;
            System.out.println(posicionActual);

}
}

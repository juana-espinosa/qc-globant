/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra4;

import java.util.Scanner;

/**
 *
 * @author juana
 */
public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int numID;
    protected String estadoCivil;

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona(String nombre, String apellido, int numID, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numID = numID;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(){
        System.out.println("Estado civil actual: "+ estadoCivil);
        System.out.println("ingrese el nuevo estado civil ");
        estadoCivil = sc.next();
    }

}

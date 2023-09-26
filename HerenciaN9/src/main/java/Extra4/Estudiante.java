/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra4;

import java.util.ArrayList;

/**
 *
 * @author juana
 */
 public class Estudiante extends Persona{

    ArrayList<String> listaCursosMatr;

    public Estudiante(String nombre, String apellido, int numID, String estadoCivil, ArrayList<String> listaCursosMatr) {
        super(nombre, apellido, numID, estadoCivil);
        this.listaCursosMatr = listaCursosMatr;
    }

    public ArrayList<String> getListaCursosMatr() {
        return listaCursosMatr;
    }

    public void setListaCursosMatr(ArrayList<String> listaCursosMatr) {
        this.listaCursosMatr = listaCursosMatr;
    }

    public void matriculacionNuevoCurso() {
        System.out.println("Ingrese el nombre del curso a matricularse");
        listaCursosMatr.add(sc.next());
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "listaCursosMatr=" + listaCursosMatr +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numID=" + numID +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }

}

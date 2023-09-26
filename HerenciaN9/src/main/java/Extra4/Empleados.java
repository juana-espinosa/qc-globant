/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra4;

/**
 *
 * @author juana
 */
public class Empleados extends Persona{

    protected int anioAlta;
    protected int numDespacho;

    public Empleados(String nombre, String apellido, int numID, String estadoCivil, int anioAlta, int numDespacho) {
        super(nombre, apellido, numID, estadoCivil);
        this.anioAlta = anioAlta;
        this.numDespacho = numDespacho;
    }

    public int getAnioAlta() {
        return anioAlta;
    }

    public void setAnioAlta(int anioAlta) {
        this.anioAlta = anioAlta;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    public void reasignacionDespacho() {
        System.out.println("ingrese el nuevo numero del despacho de "+nombre);
        numDespacho = sc.nextInt();
    }
}

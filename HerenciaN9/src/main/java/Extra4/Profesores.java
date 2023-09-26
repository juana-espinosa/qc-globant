/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra4;

/**
 *
 * @author juana
 */
public class Profesores extends Empleados {

    private String unidadAcademica;

    public Profesores(String nombre, String apellido, int numID, String estadoCivil, int anioAlta, int numDespacho, String unidadAcademica) {
        super(nombre, apellido, numID, estadoCivil, anioAlta, numDespacho);
        this.unidadAcademica = unidadAcademica;
    }

    public String getUnidadAcademica() {
        return unidadAcademica;
    }

    public void setUnidadAcademica(String unidadAcademica) {
        this.unidadAcademica = unidadAcademica;
    }

    public void cambioDepartamento() {
        System.out.println("Unidad academica actual: "+unidadAcademica);
        System.out.println("ingrese el nuevo Departamento al que pertenecerá");
        unidadAcademica= sc.next();
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "anioAlta=" + anioAlta +
                ", numDespacho=" + numDespacho +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numID=" + numID +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", unidadAcademica='" + unidadAcademica + '\'' +
                '}';
    }


}


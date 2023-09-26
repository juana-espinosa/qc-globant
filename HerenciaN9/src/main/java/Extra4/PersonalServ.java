/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra4;

/**
 *
 * @author juana
 */
    public class PersonalServ extends Empleados{

    private String seccionAsignada;

    public PersonalServ(String nombre, String apellido, int numID, String estadoCivil, int anioAlta, int numDespacho, String seccionAsignada) {
        super(nombre, apellido, numID, estadoCivil, anioAlta, numDespacho);
        this.seccionAsignada = seccionAsignada;
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    public void trasladarSeccion() {
        System.out.println("Seccion actual: "+ seccionAsignada);
        System.out.println("ingrese la nueva secciona a estar asignado "+nombre);
        seccionAsignada = sc.next();
    }

    @Override
    public String toString() {
        return "PersonalServ{" +
                "anioAlta=" + anioAlta +
                ", numDespacho=" + numDespacho +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numID=" + numID +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", seccionAsignada='" + seccionAsignada + '\'' +
                '}';
    }

}

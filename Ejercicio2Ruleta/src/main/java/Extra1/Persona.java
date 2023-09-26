/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra1;

/**
 *
 * @author juana
 */
public class Persona {
    String nombre;
String apellido;
int edad;
int documento;
Perro perroP;
//Perro perrito = new Perro();

    public Persona(String nombre, String apellido, int edad, int documento, Perro perroP) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perroP = perroP;
    }

    public Persona() {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerrito() {
        return perroP;
    }

    public void setPerrito(Perro perroP) {
        this.perroP = perroP;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra2;

/**
 *
 * @author juana
 */
public class Polideportivo extends Edificio {
      private String nombre;
    private String tipoDeInstalacion;

    public Polideportivo(Double ancho, Double alto, Double largo, String nombre, String tipoDeInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    @Override
    public Double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    @Override
    public Double calcularVolumen() {
        return ancho*largo*alto;
    }

    @Override
    public String toString() {
        return "Polideportivo{" +
                "nombre='" + nombre + '\'' +
                ", tipoDeInstalacion='" + tipoDeInstalacion + '\'' +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                "} " + super.toString();
    }
}

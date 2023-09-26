/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra2;

/**
 *
 * @author juana
 */
public class EdificioDeOficina extends Edificio {
      private int numeroDeOficinas;
    private int cantidadDePersonasPorOficina;
    private int numeroDePisos;

    public EdificioDeOficina(Double ancho, Double alto, Double largo, int numeroDeOficinas, int cantidadDePersonasPorOficina, int numeroDePisos) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getCantidadDePersonasPorOficina() {
        return cantidadDePersonasPorOficina;
    }

    public void setCantidadDePersonasPorOficina(int cantidadDePersonasPorOficina) {
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
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
        return "EdificioDeOficina{" +
                "numeroDeOficinas=" + numeroDeOficinas +
                ", cantidadDePersonasPorOficina=" + cantidadDePersonasPorOficina +
                ", numeroDePisos=" + numeroDePisos +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                "} " + super.toString();
    }

    public int cantPersonas() {
        return numeroDeOficinas * cantidadDePersonasPorOficina * numeroDePisos;
    }
}

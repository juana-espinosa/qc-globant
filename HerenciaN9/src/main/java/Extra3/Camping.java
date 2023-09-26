/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra3;

/**
 *
 * @author juana
 */
public class Camping extends AlojamientoExtraHoteleros {
    protected int cantCarpas;
    protected int banosDisp;
    protected boolean restaurante;

    public Camping(int cantCarpas, int banosDisp, boolean restaurante, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantCarpas = cantCarpas;
        this.banosDisp = banosDisp;
        this.restaurante = restaurante;
    }

    
    //public Camping(int cantCarpas, int banosDisp, boolean restaurante, boolean privado, int metrosCuadrados) 

    public Camping(boolean privado, int metrosCuadrados) {
        super(privado, metrosCuadrados);
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public int getBanosDisp() {
        return banosDisp;
    }

    public void setBanosDisp(int banosDisp) {
        this.banosDisp = banosDisp;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }


    
    
}

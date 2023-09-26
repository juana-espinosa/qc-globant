/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Extra3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author juana
 */
public class MainExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //4 estrellas
        // 5 estrellas
        //camping
        //resi
        ArrayList<Hoteles> hotelcitos = new ArrayList();
        ArrayList<Camping> campings = new ArrayList();
        ArrayList<Residencias> extraResi = new ArrayList();

        hotelcitos.add(new Hoteles4Estrellas("A", "Papitas Locas", 39, 45, 198, 98, 4, "Las estrellotas", "Perez 566", "La Matanza", "Lucas Sachetti"));
        hotelcitos.add(new Hoteles4Estrellas("B", "Recuerdos estelares", 60, 20, 30, 10, 4, "Sonando estrellas", "Espinosa 677", "Paternal", "Juanita"));
        hotelcitos.add(new Hoteles4Estrellas("A", "Papitas Locas", 29, 40, 98, 18, 4, "Las estrellitas", "Perez 566", "La Matanza", "Lucas Sachetti"));
//Residencias
        extraResi.add(new Residencias(10, true, true, true, 100, "Valizas", "Valizas sonada", "Valizas", "Pepito"));
        extraResi.add(new Residencias(10, true, true, true, 100, "Resi 2", "Valizas dormida", "Valizas", "Pepito"));
        extraResi.add(new Residencias(10, false, true, true, 100, "Resi 3", "Valizas con Sueno", "Valizas", "Pepito"));
//Campings
        campings.add(new Camping(50, 10, true, false, 100, "Camping 1", "Rua Brillitos", "Valizas", "Pepita"));
        campings.add(new Camping(50, 10, false, false, 100, "Camping 2", "Rua Brillitos", "Valizas", "Pepita"));
        campings.add(new Camping(50, 10, true, false, 100, "Camping 3", "Rua Brillitos", "Valizas", "Pepita"));

        // extraHoteles.add(new Camping(40, 15, true, false, 150));
        // hotelcitos.add(new Hoteles5Estrellas(2, 5, 5,"A", 40, 25, 50, 15, 5, "Monte Olimpo", "Nubes", "Perez Llamas 455", "Almagro"));
        // hotelcitos.add(new Hoteles5Estrellas(3, 2, 3, "Querido Estomago", 50, 15, 25, 10, 5, "Cielo", "Perez Aguas 554", "Caballito", "Julieta Silvera"));
        // Collections.sort(hotelcitos, new Comparator <Hoteles>() {
        //     @Override
        //   public int compare(Hoteles o1, Hoteles o2) {
        //       return o1.PrecioHabitacion().compareTo(o2.PrecioHabitacion());
        //    }
        // });
        Collections.sort(hotelcitos, new Comparator<Hoteles>() {
            @Override
            public int compare(Hoteles o1, Hoteles o2) {
                Integer precio1 = o1.PrecioHabitacion();
                Integer precio2 = o2.PrecioHabitacion();
                return precio2.compareTo(precio1);
            }
        });

        // Supongamos que hotelcitos ya está ordenado
        for (Hoteles hotel : hotelcitos) {
            System.out.println("Nombre del hotel: " + hotel.getNombre());
            System.out.println("Precio de la habitación: " + hotel.PrecioHabitacion()); // Asegúrate de que PrecioHabitacion() devuelva el precio correctamente
            // System.out.println("Otras propiedades del hotel: " + hotel.getOtrasPropiedades()); // Reemplaza getOtrasPropiedades() según la estructura de tu clase Hoteles
            System.out.println();
        }
//forcito campings con restaurant 
        for (Camping aloj : campings) {
            if (aloj.isRestaurante()) {
                System.out.println("Nombre del camping con restaurante: " + aloj.getNombre());
                System.out.println();
            } else {
                System.out.println("El otro no entra");
                System.out.println();

            }
        }
//forcito residencias
        for (Residencias resis : extraResi) {
            if (resis.isDescuentoGremio()) {
                System.out.println("Nombre de la resi con descuento: " + resis.getNombre());
                System.out.println();
            } else {
                System.out.println("La otra no entra");
                System.out.println();
            }
        }

        //forcito para imprimir todo 
        //hoteles
        for (Hoteles hotel : hotelcitos) {
            System.out.println("Nombre del hotel: " + hotel.getNombre());
            System.out.println();
        }
        //campings
        for (Camping aloj : campings) {
            System.out.println("Nombre del camping: " + aloj.getNombre());
            System.out.println();
        }
        //resis
        for (Residencias resis : extraResi) {
            System.out.println("Nombre de: la resi"+ resis.getNombre());
            System.out.println();

        }
    }

}

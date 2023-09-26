/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author juana
 */
public class Tienda {
//    Método venta(): El usuario ingresa el nombre del producto que quiere comprar y se lo busca en el ArrayList. Si está en el ArrayList, se llama ;con ese objeto Producto al método. El método se
//decrementa de a uno, como un carrito de compras, el atributo cantidad en inventario, del producto que ingresó el usuario. Esto sucederá cada vez que se realice una venta del producto. No se podrán vender productos de los que no queden inventario disponible para vender. Devuelve true si se ha podido realizar la operación y false en caso contrario.
               
    public void venta(String nombre){
    for (Producto p : LP) {
            if (p.getNombre().equals(nombre)) {
                p.setPrecio(Cantidad_inventario-1);
            }
        }
    }
    
    
        
        
}

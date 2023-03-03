/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author alvarogasca
 */
public class Test {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Mueble mueble = new Mueble(Material.Madera, "Estanteria", "KALLAX", 40);
        tienda.agregarProducto(mueble);

        ArticuloDeDecoracion decoracion = new ArticuloDeDecoracion(Material.plastico, "Flexo", "FORSÅ", 20);
        tienda.agregarProducto(decoracion);

        System.out.println("Productos en la tienda:");
        tienda.mostrarProductos();
    }
}

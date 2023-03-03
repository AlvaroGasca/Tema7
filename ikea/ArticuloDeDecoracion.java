/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author alvarogasca
 */
public class ArticuloDeDecoracion extends ProductoHogar{

    public ArticuloDeDecoracion() {
    }

    public ArticuloDeDecoracion(Material tipoDeMaterial, String nombre, String descrip, double precio) {
        super(tipoDeMaterial, nombre, descrip, precio);
    }
    
    public String mostrarCaracteristicas() {
        return "Nombre: " + getNombre() + "\nDescripción: " + getDescrip() + "\nPrecio: " + getPrecio() + 
                "\nTipo de material: " + getTipoDeMaterial();
    }
}

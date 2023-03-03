/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author alvarogasca
 */
abstract public class Producto {
    protected String nombre;
    protected String descrip;
    protected double precio;
    
    public Producto(){
    }

    public Producto(String nombre, String descrip, double precio) {
        this.nombre = nombre;
        this.descrip = descrip;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public abstract String mostrarCaracteristicas();
    
    
}

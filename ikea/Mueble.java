/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author alvarogasca
 */
public class Mueble extends ProductoHogar {
    private String tipoDeMueble;
    
    public Mueble(){
    }

    public Mueble(String tipoDeMueble, Material tipoDeMaterial, String nombre, String descrip, double precio) {
        super(tipoDeMaterial, nombre, descrip, precio);
        this.tipoDeMueble=tipoDeMueble;
    }

    public String getTipoDeMueble() {
        return tipoDeMueble;
    }

    public void setTipoDeMueble(String tipoDeMueble) {
        this.tipoDeMueble = tipoDeMueble;
    }
    
    @Override
    public String mostrarCaracteristicas() {
        return "Nombre: " + getNombre() + "\nDescripción: " + getDescrip() + "\nPrecio: " + getPrecio() + 
                "\nTipo de material: " + getTipoDeMaterial() + "\nTipo de mueble: " + tipoDeMueble;
    }
}

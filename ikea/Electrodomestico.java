/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author alvarogasca
 */
public class Electrodomestico extends ProductoHogar{
    private eficienciaEnergetica eficienciaEnergetica;

    public Electrodomestico() {
    }

    public Electrodomestico(eficienciaEnergetica eficienciaEnergetica, Material tipoDeMaterial, String nombre, String descrip, double precio) {
        super(tipoDeMaterial, nombre, descrip, precio);
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    public eficienciaEnergetica getEficienciaEnergetica() {
        return eficienciaEnergetica;
    }

    public void setEficienciaEnergetica(eficienciaEnergetica eficienciaEnergetica) {
        this.eficienciaEnergetica = eficienciaEnergetica;
    }
    
    @Override
    public String mostrarCaracteristicas() {
        return "Nombre: " + getNombre() + "\nDescripción: " + getDescrip() + "\nPrecio: " + getPrecio() + 
                "\nTipo de material: " + getTipoDeMaterial() + "\nEficiencia " + eficienciaEnergetica;
    }
}

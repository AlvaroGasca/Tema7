/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author alvarogasca
 */
abstract public class ProductoHogar extends Producto{
    protected Material tipoDeMaterial;
    
    public ProductoHogar(){
    }

    public ProductoHogar(Material tipoDeMaterial, String nombre, String descrip, double precio) {
        super(nombre, descrip, precio);
        this.tipoDeMaterial = tipoDeMaterial;
    }

    public Material getTipoDeMaterial() {
        return tipoDeMaterial;
    }

    public void setTipoDeMaterial(Material tipoDeMaterial) {
        this.tipoDeMaterial = tipoDeMaterial;
    }
    
    
}

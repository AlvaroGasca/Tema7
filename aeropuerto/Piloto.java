/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.aeropuerto;

/**
 *
 * @author alvarogasca
 */
public class Piloto extends Personal{
    private Rango rango;
    private int sueldo;
    private boolean vuelosInt;
    
    public Piloto(){
    }

    public Piloto(Rango rango, int sueldo, boolean vuelosInt, String nombre, String apellido, String dni, String mail) {
        super(nombre, apellido, dni, mail);
        this.rango = rango;
        this.sueldo = sueldo;
        this.vuelosInt = vuelosInt;
    }

    public Rango getRango() {
        return rango;
    }

    public int getSueldo() {
        return sueldo;
    }

    public boolean isVuelosInt() {
        return vuelosInt;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setVuelosInt(boolean vuelosInt) {
        this.vuelosInt = vuelosInt;
    }
    
}

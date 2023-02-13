/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.aeropuerto;

/**
 *
 * @author alvarogasca
 */
public class Trabajadores extends Personal {
    private int sueldo;
    
    public Trabajadores(){
    }

    public Trabajadores(int sueldo, String nombre, String apellido, String dni, String mail) {
        super(nombre, apellido, dni, mail);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.aeropuerto;

/**
 *
 * @author alvarogasca
 */
public class Pasajero extends Personal {
    private int pasaporte;
    
    public Pasajero(){
    }

    public Pasajero(int pasaporte, String nombre, String apellido, String dni, String mail) {
        super(nombre, apellido, dni, mail);
        this.pasaporte = pasaporte;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }
    
}

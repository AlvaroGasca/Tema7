/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.aeropuerto;

import java.util.List;

/**
 *
 * @author alvarogasca
 */
public class Azafata extends Personal{
    private int sueldo;
    private List<String> idiomas;
    
    public Azafata(){
    }

    public Azafata(int sueldo, List<String> idiomas, String nombre, String apellido, String dni, String mail) {
        super(nombre, apellido, dni, mail);
        this.sueldo = sueldo;
        this.idiomas = idiomas;
    }

    public int getSueldo() {
        return sueldo;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    

    
    
}

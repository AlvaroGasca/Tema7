/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospital;

/**
 *
 * @author alvarogasca
 */
public class Trabajador {
    protected String nombre;
    protected String id;
    protected double sueldo;
    
    public Trabajador(){
    }
    public Trabajador(String nombre, String id, double sueldo){
        this.id=id;
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", id=" + id + ", sueldo=" + sueldo + '}';
    }
    
    
}

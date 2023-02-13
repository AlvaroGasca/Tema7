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
public class Vuelos {
    private String Origen;
    private String Destino;
    private Piloto piloto;
    private List<Pasajero> pasajeros;
    private int duracion;
    
    public Vuelos(){
    }

    public Vuelos(String Origen, String Destino, Piloto piloto, List<Pasajero> pasajeros, int duracion) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.piloto = piloto;
        this.pasajeros = pasajeros;
        this.duracion = duracion;
    }

    public String getOrigen() {
        return Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void mostrarPasajeros() {
        System.out.println("Pasajeros del vuelo de " + Origen + " a " + Destino + ":");
        for (Pasajero pasajero : pasajeros) {
            System.out.println("Nombre: " + pasajero.getNombre() + " " + pasajero.getAppellido());
            System.out.println("DNI: " + pasajero.getDni());
            System.out.println("Pasaporte: " + pasajero.getPasaporte());
        }
    }
}

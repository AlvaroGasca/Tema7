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
public class Test {
    public static void main(String[] args) {
        List<String> idiomas = null;
        idiomas.add("Ingles");
        Piloto piloto1 = new Piloto(Rango.Aguila, 2400, true, "Manuel", "Jimenez", "638583927F", "Manuel.JIm@gmail.com");
        Azafata azafata1 = new Azafata(1300, idiomas, "Carmen", "Suso", "72493492J", "Carmen.Suso@gmail.com");
        Pasajero pasajero1 = new Pasajero(2392839, "Alvaro", "Gasca", "83598935L", "alvaro.gasca@gmail.com");
        Vuelos vuelo1 = new Vuelos("Sevilla", "Kiev", piloto1, (List<Pasajero>) pasajero1, 5);
        
        System.out.println("Pasajeros en el vuelo de Kiev a Sevilla:");
        vuelo1.mostrarPasajeros();
    }
}

    

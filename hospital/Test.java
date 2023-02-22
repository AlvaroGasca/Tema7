/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospital;

/**
 *
 * @author alvarogasca
 */
public class Test {
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador("Miguel", "9248u", 1000);
        Medico m1 = new Medico(Especialidad.pediatra, 4, 10, "Jose", "35839P", 1700);
        No_medico nm1 = new No_medico(Especialidad_No_Medico.enfermero, "c1", "Luna", "83738L", 1500);
        
        System.out.println(t1);
        System.out.println(m1);
        System.out.println(nm1);
    }
}

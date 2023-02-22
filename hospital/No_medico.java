/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospital;

/**
 *
 * @author alvarogasca
 */
public class No_medico extends Trabajador{
    private Especialidad_No_Medico enm;
    private String area;
    
    public No_medico(){
    }

    public No_medico(Especialidad_No_Medico enm, String area, String nombre, String id, double sueldo) {
        super(nombre, id, sueldo);
        this.enm = enm;
        this.area = area;
    }

    public Especialidad_No_Medico getEnm() {
        return enm;
    }

    public String getArea() {
        return area;
    }

    public void setEnm(Especialidad_No_Medico enm) {
        this.enm = enm;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString()+"No_medico{" + "enm=" + enm + ", area=" + area + '}';
    }
    
    
    
    
}

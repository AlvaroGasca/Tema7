/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospital;

/**
 *
 * @author alvarogasca
 */
public class Medico extends Trabajador {
    private Especialidad especialidad;
    private int nc;
    private int np;
    
    public Medico(){
    }

    public Medico(Especialidad especialidad,int nc, int np, String nombre, String id, double sueldo) {
        super(nombre, id, sueldo);
        this.nc=nc;
        this.np=np;
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getNc() {
        return nc;
    }

    public int getNp() {
        return np;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setNc(int nc) {
        this.nc = nc;
    }

    public void setNp(int np) {
        this.np = np;
    }

    @Override
    public String toString() {
        return super.toString()+"Medico{" + "especialidad=" + especialidad + ", nc=" + nc + ", np=" + np + '}';
    }

 
    
    
}

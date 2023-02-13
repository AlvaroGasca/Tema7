/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.aeropuerto;

/**
 *
 * @author alvarogasca
 */
public class Personal {
    protected String nombre;
    protected String appellido;
    protected String dni;
    protected String mail;
    
    Personal(){
    }
    Personal(String nombre, String apellido, String dni, String mail){
        this.appellido=apellido;
        this.dni=dni;
        this.mail=mail;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAppellido() {
        return appellido;
    }

    public String getDni() {
        return dni;
    }

    public String getMail() {
        return mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAppellido(String appellido) {
        this.appellido = appellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_brauliocalix;

/**
 *
 * @author User
 */
public class Aseo {
    
    private String nombre;
    private String descrip;
    private String funcion;

    public Aseo() {
    }

    public Aseo(String nombre, String descrip, String funcion) {
        this.nombre = nombre;
        this.descrip = descrip;
        this.funcion = funcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "Aseo{" + "nombre=" + nombre + ", descrip=" + descrip + ", funcion=" + funcion + '}';
    }


}
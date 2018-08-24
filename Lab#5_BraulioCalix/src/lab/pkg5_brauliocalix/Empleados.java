/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_brauliocalix;

import java.util.Date;

/**
 *
 * @author User
 */
public class Empleados {
    private String Nombre;
    private Date fecha;
    private String usuario;
    private String Contra;
    private String correo;
    private String puesto;

    public Empleados() {
    }

    public Empleados(String Nombre, Date fecha, String usuario, String Contra, String correo, String puesto) {
        this.Nombre = Nombre;
        this.fecha = fecha;
        this.usuario = usuario;
        this.Contra = Contra;
        this.correo = correo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleados{" + "Nombre=" + Nombre + ", fecha=" + fecha + ", usuario=" + usuario + ", Contra=" + Contra + ", correo=" + correo + ", puesto=" + puesto + '}';
    }
    
}

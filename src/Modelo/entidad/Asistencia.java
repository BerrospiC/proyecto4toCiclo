/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.entidad;

/**
 *
 * @author PERSONAL
 */
public class Asistencia {
   private int id_asistencia;
   private int id_empleado;
   private String nombres;
   private String apellidos;
   private String usuario;
   private String fecha;

    public Asistencia() {
    }

    public Asistencia(int id_asistencia, int id_empleado, String nombres, String apellidos, String usuario, String fecha) {
        this.id_asistencia = id_asistencia;
        this.id_empleado = id_empleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public int getId_asistencia() {
        return id_asistencia;
    }

    public void setId_asistencia(int id_asistencia) {
        this.id_asistencia = id_asistencia;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "id_asistencia=" + id_asistencia + ", id_empleado=" + id_empleado + ", nombres=" + nombres + ", apellidos=" + apellidos + ", usuario=" + usuario + ", fecha=" + fecha + '}';
    }

    
   
  
}

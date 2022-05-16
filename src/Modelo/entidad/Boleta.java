/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.entidad;


public class Boleta {
    int id_boleta;
    String fecha;
    double total;
    int id_cliente;
    int id_empleado;

    public Boleta() {
    }
    
    

    public Boleta(int id_boleta, String fecha, double total, int id_cliente, int id_empleado) {
        this.id_boleta = id_boleta;
        this.fecha = fecha;
        this.total = total;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
    }

    public int getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    @Override
    public String toString() {
        return "Boleta{" + "id_boleta=" + id_boleta + ", fecha=" + fecha + ", total=" + total + ", id_cliente=" + id_cliente + ", id_empleado=" + id_empleado + '}';
    }
    
    
    
    
    
}

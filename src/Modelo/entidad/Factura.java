
package Modelo.entidad;


public class Factura {
    private int id_factura;
    private String fecha;
    private String ruc;
    private String razon_social;
    private double total;
    private int id_cliente;
    private int id_empleado;

    public Factura() {
    }

    public Factura(int id_factura, String fecha, String ruc, String razon_social, double total, int id_cliente, int id_empleado) {
        this.id_factura = id_factura;
        this.fecha = fecha;
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.total = total;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
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

    @Override
    public String toString() {
        return "Factura{" + "id_factura=" + id_factura + ", fecha=" + fecha + ", ruc=" + ruc + ", razon_social=" + razon_social + ", total=" + total + ", id_cliente=" + id_cliente + ", id_empleado=" + id_empleado + '}';
    }

  
}

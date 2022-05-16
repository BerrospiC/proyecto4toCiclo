
package Modelo.entidad;


public class Detalle {
   private int id_detalle;
   private int cantidad;
   private double sub_total;
   private int id_venta;
   private int id_producto;

    public Detalle() {
    }

    public Detalle(int id_detalle, int cantidad, double sub_total, int id_venta, int id_producto) {
        this.id_detalle = id_detalle;
        this.cantidad = cantidad;
        this.sub_total = sub_total;
        this.id_venta = id_venta;
        this.id_producto = id_producto;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    @Override
    public String toString() {
        return "Detalle{" + "id_detalle=" + id_detalle + ", cantidad=" + cantidad + ", sub_total=" + sub_total + ", id_venta=" + id_venta + ", id_producto=" + id_producto + '}';
    }
   
   
   
}

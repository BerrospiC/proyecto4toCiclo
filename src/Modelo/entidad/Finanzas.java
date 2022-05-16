
package Modelo.entidad;


public class Finanzas {
    private int id_finanzas;
    private String asunto;
    private double monto;
    private String fecha;

    public Finanzas() {
    }

    public Finanzas(int id_finanzas, String asunto, double monto, String fecha) {
        this.id_finanzas = id_finanzas;
        this.asunto = asunto;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getId_finanzas() {
        return id_finanzas;
    }

    public void setId_finanzas(int id_finanzas) {
        this.id_finanzas = id_finanzas;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Finanzas{" + "id_finanzas=" + id_finanzas + ", asunto=" + asunto + ", monto=" + monto + ", fecha=" + fecha + '}';
    }

   
    
}

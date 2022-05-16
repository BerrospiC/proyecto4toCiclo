
package Modelo.dao;

import Modelo.entidad.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class FacturaDao implements Mantenimiento {
    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;
    
      public int IdFactura() {
        int SerieFactura = 0;
        String sql = "select max(id_factura) from r_factura;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                SerieFactura = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return SerieFactura;
    }
      
   public int registrarVenta(Factura factura) {
        int respuesta = 0;
        String sql = "insert into r_factura (fecha,ruc,razonsocial, total,  id_cliente, id_empleado) values (?, ?, ?,  ?,?,?);";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, factura.getFecha());
            ps.setString(2, factura.getRuc());
            ps.setString(3, factura.getRazon_social());
            ps.setDouble(4, factura.getTotal());
            ps.setInt(5, factura.getId_cliente());
            ps.setInt(6, factura.getId_empleado());
          ;
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
        }
        return respuesta;
    }  

    @Override
    public int Agregar(Object[] object) {
       int ag = 0;
        String sql = "insert into r_boleta (fecha,ruc,razonsocial, total,  id_cliente, id_empleado) values ( ?,?,?, ?, ?, ?);";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            ps.setObject(4, object[3]);
             ps.setObject(5, object[4]);
              ps.setObject(6, object[5]);
            
            ag = ps.executeUpdate();
        } catch (Exception e) {
        }
        return ag;
        }

    @Override
    public List Listar() {
       List<Factura> lst = new ArrayList<>();
        String sql = "select * from r_boleta;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Factura factura = new Factura();
                factura.setId_factura(rs.getInt(1));
                factura.setFecha(rs.getString(2));
                factura.setTotal(rs.getDouble(3));
                factura.setId_cliente(rs.getInt(4));
                factura.setId_empleado(rs.getInt(5));
               
                lst.add(factura);
            }
        } catch (Exception e) {
        }
        return lst;
    }

    @Override
    public int Actualizar(Object[] object) {
        int ac = 0;
        String sql = "update r_factura set fecha=?,ruc=?,razonsocial=? total=?,  id_cliente=?, id_empleado=? where id_boleta=?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            ps.setObject(4, object[3]);
            ps.setObject(5, object[4]);
            ps.setObject(6, object[5]);
            ps.setObject(7, object[6]);
            
            ac = ps.executeUpdate();
        } catch (Exception e) {
        }
        return ac;
    }

    @Override
    public void Eliminar(int id) {
          String sql = "delete from r_factura where id_factura = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
   
}

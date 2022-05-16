
package Modelo.dao;

import Modelo.entidad.Boleta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoletaDao implements Mantenimiento {
    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;

    
    
       public int IdBoleta() {
        int SerieBoleta = 0;
        String sql = "select max(id_boleta) from r_boleta;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                SerieBoleta = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return SerieBoleta;
    }
       
       
     public int registrarVenta(Boleta boleta) {
        int respuesta = 0;
        String sql = "insert into r_Boleta (fecha, total,  id_cliente, id_empleado) values (?, ?, ?,  ?);";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, boleta.getFecha());
            ps.setDouble(2, boleta.getTotal());
            ps.setInt(3, boleta.getId_cliente());
            ps.setInt(4, boleta.getId_empleado());
          ;
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
        }
        return respuesta;
    }
       
    
    @Override
    public int Agregar(Object[] object) {
        int ag = 0;
        String sql = "insert into r_boleta (fecha, total,  id_cliente, id_empleado) values ( ?, ?, ?, ?);";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            ps.setObject(4, object[3]);
            
            ag = ps.executeUpdate();
        } catch (Exception e) {
        }
        return ag;
    }

    @Override
    public List Listar() {
     List<Boleta> lst = new ArrayList<>();
        String sql = "select * from r_boleta;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Boleta boleta = new Boleta();
                boleta.setId_boleta(rs.getInt(1));
                boleta.setFecha(rs.getString(2));
                boleta.setTotal(rs.getDouble(3));
                boleta.setId_cliente(rs.getInt(4));
                boleta.setId_empleado(rs.getInt(5));
               
                lst.add(boleta);
            }
        } catch (Exception e) {
        }
        return lst;
    }

    @Override
    public int Actualizar(Object[] object) {
       int ac = 0;
        String sql = "update r_boleta set fecha=?, total=?,  id_cliente=?, id_empleado=? where id_boleta=?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            ps.setObject(4, object[3]);
            ps.setObject(5, object[4]);
            
            ac = ps.executeUpdate();
        } catch (Exception e) {
        }
        return ac;
    }

    @Override
    public void Eliminar(int id) {
       String sql = "delete from r_boleta where id_boleta = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}

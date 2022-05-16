
package Modelo.dao;


import Modelo.entidad.Finanzas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class FinanzasDao implements Mantenimiento {
    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;
    
     public Finanzas buscarFinanzas(String id) {
        Finanzas finanzas = new Finanzas();
        String sql = "select * from r_finanzas where id_finanzas = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                finanzas.setId_finanzas(rs.getInt(1));
                finanzas.setAsunto(rs.getString(2));
                finanzas.setMonto(rs.getDouble(3));
                finanzas.setFecha(rs.getString(4));
                
            }
        } catch (Exception e) {
        }
        return finanzas;
    }

    @Override
    public int Agregar(Object[] object) {
      int ag = 0;
        String sql = "insert into r_finanzas (asunto,monto, fecha) values (?, ?,?);";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            
            ag = ps.executeUpdate();
        } catch (Exception e) {
        }
        return ag;
    
    }

    @Override
    public List Listar() {
      
       List<Finanzas> lst = new ArrayList<>();
        String sql = "select * from r_finanzas;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Finanzas finanzas = new Finanzas();
                finanzas.setId_finanzas(rs.getInt(1));
                finanzas.setAsunto(rs.getString(2));
                finanzas.setMonto(rs.getDouble(3));
                finanzas.setFecha(rs.getString(4));
               
                lst.add(finanzas);
            }
        } catch (Exception e) {
        }
        return lst;
    }

    @Override
    public int Actualizar(Object[] object) {
       int ac = 0;
        String sql = "update r_finanzas set asunto=?,monto=?, fecha=? where id_finanzas=?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            ps.setObject(4, object[3]);
            
            ac = ps.executeUpdate();
        } catch (Exception e) {
        }
        return ac;
    }

    @Override
    public void Eliminar(int id) {
      String sql = "delete from r_finanzas where id_finanzas = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}

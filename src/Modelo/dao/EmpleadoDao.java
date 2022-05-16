
package Modelo.dao;

import Modelo.entidad.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class EmpleadoDao implements Mantenimiento{
    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;
    
    

    public Empleado iniciarSesion(String usuario, String dni) {
        Empleado entidad = new Empleado();
        String sql = "select * from r_empleado where usuario = ? and dni = ? ;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, dni);
           
            
            rs = ps.executeQuery();
            while (rs.next()) {
             
                
              
                entidad.setId_empleado(rs.getInt(1));
                entidad.setNombre(rs.getString(2));
                entidad.setApellidos(rs.getString(3));
                entidad.setDireccion(rs.getString(4));
                entidad.setTelefono(rs.getString(5));
                entidad.setDni(rs.getString(6));
                entidad.setCorreo(rs.getString(7));
                entidad.setPrivilegio(rs.getString(8));
                entidad.setUsuario(rs.getString(9));
                
                
           } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
        return entidad;
}
    @Override
    public int Agregar(Object[] object) {
        int ag = 0;
        String sql = "insert into r_empleado(nombres, apellidos, direccion, telefono, dni,correo,privilegio,usuario) values (?, ?, ?, ?, ?,?,?,?);";
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
            ps.setObject(8, object[7]);
            ag = ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ag;
    }

    @Override
    public List Listar() {
        List<Empleado> lst = new ArrayList<>();
        String sql = "select * from r_empleado;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId_empleado(rs.getInt(1));
                empleado.setNombre(rs.getString(2));
                empleado.setApellidos(rs.getString(3));
                empleado.setDireccion(rs.getString(4));
                empleado.setTelefono(rs.getString(5));
                empleado.setDni(rs.getString(6));
                empleado.setCorreo(rs.getString(7));
                empleado.setPrivilegio(rs.getString(8));
                empleado.setUsuario(rs.getString(9));
                lst.add(empleado);
            }
        } catch (Exception e) {
        }
        return lst;
    }

    @Override
    public int Actualizar(Object[] object) {
       int ac = 0;
        String sql = "update r_empleado set nombres=?, apellidos=?, direccion=?, telefono=?, dni=?,correo=?,privilegio=?,usuario=? where id_empleado=?;";
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
            ps.setObject(8, object[7]);
            ps.setObject(9, object[8]);
            ac = ps.executeUpdate();
        } catch (Exception e) {
        }
        return ac;
    }

    @Override
    public void Eliminar(int id) {
        String sql = "delete from r_empleado where id_empleado = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dao;


import Modelo.entidad.Proveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class ProveedoresDao implements Mantenimiento {
    
    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;
    
    public Proveedores buscarProveedores(String ruc) {
        Proveedores proveedor = new Proveedores();
        String sql = "select * from r_cliente where dni = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, ruc);
            rs = ps.executeQuery();
            while (rs.next()) {
                proveedor.setId_proveedor(rs.getInt(1));
                proveedor.setNombres(rs.getString(2));
                proveedor.setRuc(rs.getString(3));
                proveedor.setRazonsocial(rs.getString(4));
                proveedor.setDireccion(rs.getString(5));
                proveedor.setTelefono(rs.getString(6));
                proveedor.setCorreo(rs.getString(7));
            }
        } catch (Exception e) {
        }
        return proveedor;
    }

    @Override
    public int Agregar(Object[] object) {
       int ag = 0;
        String sql = "insert into r_proveedor (nombres, ruc,razonsocial, direccion, telefono,correo) values (?, ?, ?, ?,?,?);";
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
      List<Proveedores> lst = new ArrayList<>();
        String sql = "select * from r_proveedor;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedores proveedor = new Proveedores();
                proveedor.setId_proveedor(rs.getInt(1));
                proveedor.setNombres(rs.getString(2));
                proveedor.setRuc(rs.getString(3));
                proveedor.setRazonsocial(rs.getString(4));
                proveedor.setDireccion(rs.getString(5));
                proveedor.setTelefono(rs.getString(6));
                proveedor.setCorreo(rs.getString(7));
                lst.add(proveedor);
            }
        } catch (Exception e) {
        }
        return lst;
    }

    @Override
    public int Actualizar(Object[] object) {
         int ac = 0;
        String sql = "update r_proveedor set nombres=?, ruc=?, razonsocial=?, direccion=?,telefono=?,correo=? where id_proveedor=?;";
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
         String sql = "delete from r_proveedor where id_proveedor = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}

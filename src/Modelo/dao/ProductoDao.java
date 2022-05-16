/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dao;

import Modelo.entidad.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class ProductoDao implements Mantenimiento {
    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;
    
    
    
    public int actualizarStock(int stock, int id_producto) {
        int total = 0;
        String sql = "update r_producto set stock = ? where id_producto = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, stock);
            ps.setInt(2, id_producto);
            total = ps.executeUpdate();
        } catch (Exception e) {
        }
        return total;
    }
    
    public ArrayList<String> listarProducto() {
        ArrayList<String> lst = new ArrayList<String>();
        Producto producto = new Producto();
        String sql = "select * from r_producto order by nombre;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lst.add(rs.getString(2));
            }
        } catch (Exception e) {
        }
        return lst;
    }
    
    public Producto buscarProducto(String nombre) {
        Producto producto = new Producto();
        String sql = "select * from r_producto where nombre=?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                producto.setId_producto(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                producto.setStock(rs.getInt(4));
                
            }
        } catch (Exception e) {
        }
        return producto;
    }
    
    public Producto buscarId(int id) {
        Producto producto = new Producto();
        String sql = "select * from r_producto where id_producto=?;";
        try {
//            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                producto.setId_producto(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                producto.setStock(rs.getInt(4));
                
            }
        } catch (Exception e) {
        }
        return producto;
    }

    @Override
    public int Agregar(Object[] object) {
       int ag = 0;
        String sql = "insert into r_producto (nombre, precio, stock) values (?, ?, ?);";
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
        List<Producto> lst = new ArrayList<>();
        String sql = "select * from r_producto;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId_producto(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                producto.setStock(rs.getInt(4));
                
                lst.add(producto);
            }
        } catch (Exception e) {
        }
        return lst;
    }

    @Override
    public int Actualizar(Object[] object) {
        int ar = 0;
        String sql = "update r_producto set nombre=?, precio=?, stock =? where id_producto=?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            ps.setObject(4, object[3]);
            ar = ps.executeUpdate();
        } catch (Exception e) {
        }
        return ar;
    }

    @Override
    public void Eliminar(int id) {
           String sql = "delete from r_producto where id_producto = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
}

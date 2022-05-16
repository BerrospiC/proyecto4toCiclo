/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dao;

import Modelo.entidad.Detalle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DetalleDao {
        PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;
    
    public int registrarDetalleVenta(Detalle detalle) {
        int respuesta = 0;
        String sql = "insert into r_detalle (cantidad, subtotal, id_venta, id_producto) values (?, ?, ?, ?);";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getSub_total());
            ps.setInt(3, detalle.getId_venta());
            ps.setInt(4, detalle.getId_producto());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
        }
        return respuesta;
    }
}

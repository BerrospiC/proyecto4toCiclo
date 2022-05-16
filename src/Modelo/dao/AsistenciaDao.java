/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dao;

import Modelo.entidad.Asistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class AsistenciaDao implements Mantenimiento {
    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;

   
    public Asistencia buscarAsistencia(String id_empleado) {
        Asistencia asistencia = new Asistencia();
        String sql = "select * from r_asistencia where id_empleado = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, id_empleado);
            rs = ps.executeQuery();
            while (rs.next()) {
                asistencia.setId_asistencia(rs.getInt(1));
                asistencia.setId_empleado(rs.getInt(2));
                    asistencia.setNombres(rs.getString(3));
                asistencia.setApellidos(rs.getString(4));
                asistencia.setUsuario(rs.getString(5));
                asistencia.setFecha(rs.getString(6));
                
            }
        } catch (Exception e) {
        }
        return asistencia;
    }
    
    @Override
    public int Agregar(Object[] object) {
       int ag = 0;
        String sql = "insert into r_asistencia (id_empleado,nombres,apellidos, usuario,  fecha ) values ( ?,?,?, ?,  ?);";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            ps.setObject(4, object[3]);
            ps.setObject(5, object[4]);
            
           
            ag = ps.executeUpdate();
        } catch (Exception e) {
        }
        return ag;
    }

    @Override
    public List Listar() {
       List<Asistencia> lst = new ArrayList<>();
        String sql = "select * from r_asistencia;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Asistencia asistencia = new Asistencia();
                asistencia.setId_asistencia(rs.getInt(1));
                asistencia.setId_empleado(rs.getInt(2));
                asistencia.setNombres(rs.getString(3));
                asistencia.setApellidos(rs.getString(4));
                asistencia.setUsuario(rs.getString(5));
                asistencia.setFecha(rs.getString(6));
                ;
               
                lst.add(asistencia);
            }
        } catch (Exception e) {
        }
        return lst;
    }

    @Override
    public int Actualizar(Object[] object) {
     int ac = 0;
        String sql = "update r_asistencia set id_empleado=?,nombres=?, apellidos=?, usuario=?,  fecha=? where id_asistencia=?;";
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
           String sql = "delete from r_asistencia where id_asistencia = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}

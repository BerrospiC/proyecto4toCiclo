
package Modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionSQL {
   Connection conectar=null;
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectopoo","root","");
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }        
    
    
        return conectar;
}
}

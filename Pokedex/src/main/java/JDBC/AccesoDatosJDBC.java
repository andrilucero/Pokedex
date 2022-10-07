/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class AccesoDatosJDBC {
    private static String SQL_SELECT = "SELECT * FROM ";

    
    public static ResultSet ejecutarConsulta(String tabla, String consulta){    
        String query = SQL_SELECT + tabla + consulta;
        Connection cn = null;
        ResultSet rs = null;
        Statement st = null;
        try {
            cn = ClsConexion.getConnetion();
            st = cn.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } 
        return rs;
    }
    
   
    }

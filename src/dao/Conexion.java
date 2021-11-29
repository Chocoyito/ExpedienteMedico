/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Josar
 */
public class Conexion {
    public static Connection getConexion(){
        String conexionURL = "jdbc:sqlserver://localhost:1433;"
                + "databasename = ExpedienteClinico;"
                + "user = sa;"
                + "password = 1234567890;"
                + "loginTimeOut = 30;";
        
        try
        {
            Connection con = DriverManager.getConnection(conexionURL);
            return con;
        }
        catch(SQLException ex)
        {
            System.out.println(ex.toString());
            return null;
        }
    }
}

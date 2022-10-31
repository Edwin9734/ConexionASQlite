/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {
    
    //private static final String JDBC_URL = "jdbc:mysql://localhost:3306/dbalumnos?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
    private static final String JDBC_URL = "jdbc:sqlite:C:\\Users\\Usuario\\Documents\\Progra2\\DBsqlite\\estudiante.db";
    //private static final String JDBC_USER = "root";
    //private static final String JDBC_PASS = "edwin";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
    
    
}

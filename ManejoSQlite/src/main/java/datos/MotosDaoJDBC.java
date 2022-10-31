/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.MascotasDTO;
import dominio.MotosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class MotosDaoJDBC implements IMotosDao{
    
    
    private Connection conexionTransaccional;

    
    //constantes para la manipulacion de informacion
    private static final String SQL_SELECT = "SELECT id, serie, marca, maxvel FROM motos";
    private static final String SQL_INSERT = "INSERT INTO motos(serie,marca,maxvel) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE motos SET serie=?, marca=?, maxvel=?  WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM motos WHERE id=?";

    public MotosDaoJDBC() {

    }

    //constructor, recibe de parametro el manejador de la transaccion
    public MotosDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    
    //hace la consulta a la base de datos, retorna un objeto de tipo persona en una lista
    //
    
    

    @Override
    public List<MotosDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MotosDTO motos = null;
        List<MotosDTO> lismotos = new ArrayList<MotosDTO>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                  int id =rs.getInt("id");
                  String serie = rs.getString("serie");
                  String marca = rs.getString("marca");
                  String maxvel = rs.getString("maxvel");
                  
                  
                  motos = new MotosDTO();
                  motos.setOrden(id);
                  motos.setSerie(serie);
                  motos.setMarca(marca);
                  motos.setMaxvel(maxvel);
                  
                  lismotos.add(motos);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        return lismotos;
    }

    
    
    @Override
    public int insert(MotosDTO motos) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
          
            stmt.setString(1, motos.getSerie());
            stmt.setString(2, motos.getMarca());
            stmt.setString(3, motos.getMaxvel());


            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return rows;
    }

    @Override
    public int update(MotosDTO motos) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, motos.getSerie());
            stmt.setString(2, motos.getMarca());
            stmt.setString(3, motos.getMaxvel());
            stmt.setInt(4, motos.getOrden());

            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return rows;
        
    }

    @Override
    public int delete(MotosDTO motos) throws SQLException {
        
         Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            //validacion usando un ternario
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, motos.getOrden());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return rows;
        
        
        
        
    }
    
  
    
    
    
    
    
    
}

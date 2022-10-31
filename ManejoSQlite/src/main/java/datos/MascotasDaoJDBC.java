/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.MascotasDTO;
import java.sql.*;
import java.util.*;


public class MascotasDaoJDBC implements IMascotasDao{
    private Connection conexionTransaccional;

    
    //constantes para la manipulacion de informacion
    private static final String SQL_SELECT = "SELECT id, nombre, raza FROM mascotas";
    private static final String SQL_INSERT = "INSERT INTO mascotas(nombre, raza) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE mascotas SET nombre=?, raza=?  WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM mascotas WHERE id=?";

    public MascotasDaoJDBC() {

    }

    //constructor, recibe de parametro el manejador de la transaccion
    public MascotasDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    
    //hace la consulta a la base de datos, retorna un objeto de tipo persona en una lista
    //
    
    

    @Override
    public List<MascotasDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MascotasDTO mascota = null;
        List<MascotasDTO> mascotas = new ArrayList<MascotasDTO>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                  String nombre = rs.getString("nombre");
                  String raza = rs.getString("raza");
                  int id =rs.getInt("id");
                  
                  mascota = new MascotasDTO();
                  mascota.setIdmascota(id);
                  mascota.setNombremascota(nombre);
                  mascota.setRazamascota(raza);
                  
                  mascotas.add(mascota);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        return mascotas;
    }

    
    
    @Override
    public int insert(MascotasDTO mascotas) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);     
            stmt.setString(1, mascotas.getNombremascota());
            stmt.setString(2, mascotas.getRazamascota());

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
    public int update(MascotasDTO mascotas) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setString(1, mascotas.getNombremascota());
            stmt.setString(2, mascotas.getRazamascota());
            stmt.setInt(3, mascotas.getIdmascota());
            
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
    public int delete(MascotasDTO mascotas) throws SQLException {
        
         Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            //validacion usando un ternario
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, mascotas.getIdmascota());
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

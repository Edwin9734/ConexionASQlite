
package datos;

import dominio.PelisDTO;
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
public class PelisDaoJDBC implements IPelisDao{
    
    
    
    
    private Connection conexionTransaccional;

    
    //constantes para la manipulacion de informacion
    private static final String SQL_SELECT = "SELECT id, nombre, vistas, calidad FROM peliculas";
    private static final String SQL_INSERT = "INSERT INTO peliculas(nombre,vistas,calidad) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE peliculas SET nombre=?, vistas=?, calidad=?  WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM peliculas WHERE id=?";

    public PelisDaoJDBC() {

    }

    //constructor, recibe de parametro el manejador de la transaccion
    public PelisDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    
    //hace la consulta a la base de datos, retorna un objeto de tipo persona en una lista
    //
    
    

    @Override
    public List<PelisDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PelisDTO peli = null;
        List<PelisDTO> listpeli = new ArrayList<PelisDTO>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                  int id =rs.getInt("id");
                  String nombre = rs.getString("nombre");
                  String vistas = rs.getString("vistas");
                  String calidad = rs.getString("calidad");
                  
                  
                  peli = new PelisDTO();
                  peli.setOrdenP(id);
                  peli.setNombreP(nombre);
                  peli.setVistasP(vistas);
                  peli.setPunteoP(calidad);
                  
                  listpeli.add(peli);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        return listpeli;
    }

    
    
    @Override
    public int insert(PelisDTO peliculas) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
          
            stmt.setString(1, peliculas.getNombreP());
            stmt.setString(2, peliculas.getVistasP());
            stmt.setString(3, peliculas.getPunteoP());


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
    public int update(PelisDTO peliculas) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, peliculas.getNombreP());
            stmt.setString(2, peliculas.getVistasP());
            stmt.setString(3, peliculas.getPunteoP());            
            stmt.setInt(4, peliculas.getOrdenP());

            
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
    public int delete(PelisDTO peliculas) throws SQLException {
        
         Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            //validacion usando un ternario
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, peliculas.getOrdenP());
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

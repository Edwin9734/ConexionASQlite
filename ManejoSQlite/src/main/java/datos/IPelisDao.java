/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;
import dominio.PelisDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IPelisDao {
 
 public List<PelisDTO> select()throws SQLException;   
 public int insert(PelisDTO peliculas) throws SQLException;
 public int update(PelisDTO peliculas) throws SQLException;
 public int delete(PelisDTO peliculas) throws SQLException;
    
    
}

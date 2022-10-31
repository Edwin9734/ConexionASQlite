/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;
import dominio.MascotasDTO;
import java.sql.SQLException;
import java.util.List;

public interface IMascotasDao {
    
 public List<MascotasDTO> select()throws SQLException;   
 public int insert(MascotasDTO mascotas) throws SQLException;
 public int update(MascotasDTO mascotas) throws SQLException;
 public int delete(MascotasDTO mascotas) throws SQLException;
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import dominio.MotosDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IMotosDao {
    
    
 public List<MotosDTO> select()throws SQLException;   
 public int insert(MotosDTO motos) throws SQLException;
 public int update(MotosDTO motos) throws SQLException;
 public int delete(MotosDTO motos) throws SQLException;
    
    
}

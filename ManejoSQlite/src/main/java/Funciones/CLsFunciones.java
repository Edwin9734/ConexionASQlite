/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import datos.Conexion;
import datos.MascotasDaoJDBC;
import datos.MotosDaoJDBC;
import datos.PelisDaoJDBC;
import dominio.MascotasDTO;
import dominio.MotosDTO;
import dominio.PelisDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;



public class CLsFunciones {
    
private static final   Scanner scanner = new Scanner (System.in);   
private static String opcion ;
private static int opcion1 = -1;


//CRUD MASCOTAS
public static void insertMascotas(){
     Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            MascotasDaoJDBC mascotaJdbc = new MascotasDaoJDBC(conexion);
            MascotasDTO mascota = new MascotasDTO();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);}
            
            System.out.println("Ingrese el nombre");opcion = scanner.nextLine();mascota.setNombremascota(opcion);//nombre  
            System.out.println("Ingrese la raza");opcion = scanner.nextLine();mascota.setRazamascota(opcion);
            mascotaJdbc.insert(mascota);
          
            conexion.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);
                 
            }
        }            
}

public static void updateMascota(){
     Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            MascotasDaoJDBC mascotaJdbc = new MascotasDaoJDBC(conexion);
            MascotasDTO mascota = new MascotasDTO();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);}
            
            System.out.println("Ingrese el id");opcion1 = Integer.parseInt(scanner.nextLine());mascota.setIdmascota(opcion1);//id
             System.out.println("Ingrese el nombre");opcion = scanner.nextLine();mascota.setNombremascota(opcion);//nombre  
            System.out.println("Ingrese la raza");opcion = scanner.nextLine();mascota.setRazamascota(opcion);
           
            mascotaJdbc.update(mascota);
          
            conexion.commit();
        } catch (SQLException ex){ ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);}
               
        }
}
    
public static void deletePersona(){
     Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            MascotasDaoJDBC mascotaJdbc = new MascotasDaoJDBC(conexion);
            MascotasDTO mascota = new MascotasDTO();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);}
            
            System.out.println("Ingrese el id");opcion1 = Integer.parseInt(scanner.nextLine());mascota.setIdmascota(opcion1);//id

            mascotaJdbc.delete(mascota);
          
            conexion.commit();
        } catch (SQLException ex){ ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);}
            
        }      
    }

public static void ListadoMascotas(){
     Connection conexion = null;
    
        try {
            conexion = Conexion.getConnection();
            MascotasDaoJDBC mascotajdbc = new MascotasDaoJDBC(conexion);
            List<MascotasDTO> Listmascotas =  mascotajdbc.select();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);} 
             
             
            for (MascotasDTO mascota : Listmascotas){ System.out.println(mascota.toString()); }
                
            conexion.commit();
        } catch (SQLException ex) { ex.printStackTrace(System.out);
            
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);}
               
        }           
    }

 //CRUD MOTOS

public static void insertMotos(){
     Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            MotosDaoJDBC motosjdbc = new MotosDaoJDBC(conexion);
            MotosDTO moto = new MotosDTO();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);}
            
            System.out.println("Ingrese la serie");opcion = scanner.nextLine();moto.setSerie(opcion);//nombre  
            System.out.println("Ingrese la marca");opcion = scanner.nextLine();moto.setMarca(opcion);
            System.out.println("Ingrese limite de velocidad");opcion = scanner.nextLine();moto.setMaxvel(opcion);
            
            
            motosjdbc.insert(moto);
          
            conexion.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);
                 
            }
        }            
}

public static void updateMotos(){
     Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            MotosDaoJDBC motosjdbc = new MotosDaoJDBC(conexion);
            MotosDTO moto = new MotosDTO();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);}
            
            System.out.println("Ingrese el id");opcion1 = Integer.parseInt(scanner.nextLine());moto.setOrden(opcion1);
            System.out.println("Ingrese la serie");opcion = scanner.nextLine();moto.setSerie(opcion);
            System.out.println("Ingrese la marca");opcion = scanner.nextLine();moto.setMarca(opcion);
            System.out.println("Ingrese limite de velocidad");opcion = scanner.nextLine();moto.setMaxvel(opcion);
           
            motosjdbc.update(moto);
          
            conexion.commit();
        } catch (SQLException ex){ ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);}
               
        }
}
    
public static void deleteMotos(){
     Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            MotosDaoJDBC motosjdbc = new MotosDaoJDBC(conexion);
            MotosDTO moto = new MotosDTO();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);}
            
            System.out.println("Ingrese el id");opcion1 = Integer.parseInt(scanner.nextLine());moto.setOrden(opcion1);

            motosjdbc.delete(moto);
          
            conexion.commit();
        } catch (SQLException ex){ ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);}
            
        }      
    }

public static void ListadoMotos(){
     Connection conexion = null;
    
        try {
            conexion = Conexion.getConnection();
            MotosDaoJDBC motosjdbc = new MotosDaoJDBC(conexion);
            List<MotosDTO> Listmotos =  motosjdbc.select();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);} 
             
       
            for (MotosDTO moto : Listmotos){ System.out.println(moto.toString()); }
                
            conexion.commit();
        } catch (SQLException ex) { ex.printStackTrace(System.out);
            
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);}
               
        }           
    }

//CRUD PELICULAS

public static void insertPeliculas(){
     Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            PelisDaoJDBC pelijdbc = new PelisDaoJDBC(conexion);
            PelisDTO peli = new PelisDTO();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);}
            
            System.out.println("Ingrese el nombre");opcion = scanner.nextLine();peli.setNombreP(opcion);//nombre  
            System.out.println("Cantidad de vistas");opcion = scanner.nextLine();peli.setVistasP(opcion);
            System.out.println("Calidad");opcion = scanner.nextLine();peli.setPunteoP(opcion);
            
            
            pelijdbc.insert(peli);
          
            conexion.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);
                 
            }
        }            
}

public static void updatePeliculas(){
     Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            PelisDaoJDBC pelijdbc = new PelisDaoJDBC(conexion);
            PelisDTO peli = new PelisDTO();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);}
            
            System.out.println("Ingrese el id");opcion1 = Integer.parseInt(scanner.nextLine());peli.setOrdenP(opcion1);
            System.out.println("Ingrese el nombre");opcion = scanner.nextLine();peli.setNombreP(opcion);//nombre  
            System.out.println("Cantidad de vistas");opcion = scanner.nextLine();peli.setVistasP(opcion);
            System.out.println("Calidad");opcion = scanner.nextLine();peli.setPunteoP(opcion);
           
            pelijdbc.update(peli);
          
            conexion.commit();
        } catch (SQLException ex){ ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);}
               
        }
}
    
public static void deletePeliculas(){
     Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            PelisDaoJDBC pelijdbc = new PelisDaoJDBC(conexion);
            PelisDTO peli = new PelisDTO();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);}
            
           System.out.println("Ingrese el id");opcion1 = Integer.parseInt(scanner.nextLine());peli.setOrdenP(opcion1);

            pelijdbc.delete(peli);
          
            conexion.commit();
        } catch (SQLException ex){ ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);}
            
        }      
    }

public static void ListadoPeliculas(){
        Connection conexion = null;
    
        try {
            conexion = Conexion.getConnection();
            PelisDaoJDBC pelijdbc = new PelisDaoJDBC(conexion);        
            List<PelisDTO> Listpelis =  pelijdbc.select();
            if (conexion.getAutoCommit()){conexion.setAutoCommit(false);} 
             
       
            for (PelisDTO peli : Listpelis){ System.out.println(peli.toString()); }
                
            conexion.commit();
        } catch (SQLException ex) { ex.printStackTrace(System.out);
            
            System.out.println("Entramos al rollback");
            try {conexion.rollback();}catch (SQLException ex1) {ex1.printStackTrace(System.out);}
               
        }           
    }



}

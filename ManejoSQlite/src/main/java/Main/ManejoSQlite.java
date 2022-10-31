/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Main;

import Funciones.CLsFunciones;
import java.sql.Connection;
import java.util.Scanner;

 
public class ManejoSQlite {
private static int opcion = -1;
private static final   Scanner scanner = new Scanner (System.in);
private static  CLsFunciones j;
    
    
    
    
    public static void main(String[] args) {
      while (opcion != 4) {
            try {
                System.out.println("Elija opcion:\n"
                        + "1.- Coleccion de mascotas\n"
                        + "2.- Motos manejadas\n"
                        + "3.- Peliculas vistas\n"
                        + "4.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        System.out.println("PERSONAS");
                        Mmascotas();
                        break;
                    case 2:
                        System.out.println("Motos");
                        Mmotos();                   
                        break;
                    case 3:
                        System.out.println("Peliculas");
                        Mpeliculas();
                        break;
                    case 4:
                        System.out.println("!Hasta pronto!");
                        break;    
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
      
        
        

  }
    
     
    
    
    private static void Mmascotas(){
         Connection conexion = null;
         
        
        while (opcion != 0) {
            try {
                System.out.println("Elija opcion:\n"
                        + "1.- Visualizar la lista del Mascotas\n"
                        + "2.- Agregar una mascota\n"
                        + "3.- Modificar nombre o raza\n"
                        + "4.- Borrar mascota\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                       
                        System.out.println("Lista");
                        j.ListadoMascotas();
                        break;
                    case 2:
                        System.out.println("Ingrese los datos");
                        j.insertMascotas();                    
                        break;
                    case 3:
                        System.out.println("Digite los nuevos atributos");
                        j.updateMascota();
                        
                        break;
                    case 4:
                        System.out.println("Ingrese los datos");                       
                        j.deletePersona();
                        break;
                    case 0:
                        System.out.println("Cerrada");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
        
    }  
    private static void Mmotos(){
        while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n"
                        + "1.- Coleccion de Motos ma\n"
                        + "2.- Agregar Usuario\n"
                        + "3.- Modificar datos de Usuarios\n"
                        + "4.- borrar Usuario\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        System.out.println("Lista");
                        j.ListadoMotos();
                        break;
                    case 2:
                        System.out.println("Ingrese los datos");
                        j.insertMotos();                     
                        break;
                    case 3:
                        System.out.println("Digite los nuevos atributos");
                        j.updateMotos();
                        break;
                    case 4:
                        System.out.println("Ingrese los datos"); 
                       j.deleteMotos();
                        break;
                    case 0:
                        System.out.println("Cerrada");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
        
    } 
    private static void Mpeliculas(){
        while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n"
                        + "1.- Peliculas vistas \n"
                        + "2.- Agregar pelicula\n"
                        + "3.- Modificar datos una pelicula\n"
                        + "4.- borrar pelicula\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        System.out.println("Lista");
                        j.ListadoPeliculas();
                        break;
                    case 2:
                        System.out.println("Ingrese los datos");
                        j.insertPeliculas();                     
                        break;
                    case 3:
                        System.out.println("Digite los nuevos atributos");
                        j.updatePeliculas();
                        break;
                    case 4:
                        System.out.println("Ingrese los datos"); 
                       j.deletePeliculas();
                        break;
                    case 0:
                        System.out.println("Cerrada");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
        
    } 
    
    
    
    
}

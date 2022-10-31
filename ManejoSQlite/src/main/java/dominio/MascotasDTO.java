/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Usuario
 */
public class MascotasDTO {

    /**
     * @return the idmascota
     */
    public int getIdmascota() {
        return idmascota;
    }

    /**
     * @param idmascota the idmascota to set
     */
    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    /**
     * @return the nombremascota
     */
    public String getNombremascota() {
        return nombremascota;
    }

    /**
     * @param nombremascota the nombremascota to set
     */
    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
    }

    /**
     * @return the razamascota
     */
    public String getRazamascota() {
        return razamascota;
    }

    /**
     * @param razamascota the razamascota to set
     */
    public void setRazamascota(String razamascota) {
        this.razamascota = razamascota;
    }
    private String nombremascota;
    private String razamascota;
    private int idmascota;
    @Override
    public String toString() {
        return idmascota + "  Nombre :" + nombremascota + "\tRaza : " + razamascota;
    }
    
    
    
}

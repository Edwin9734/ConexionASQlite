/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Usuario
 */
public class MotosDTO {
    
    
    /**
     * @return the orden
     */
    public int getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }

    /**
     * @return the Serie
     */
    public String getSerie() {
        return Serie;
    }

    /**
     * @param Serie the Serie to set
     */
    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the Maxvel
     */
    public String getMaxvel() {
        return Maxvel;
    }

    /**
     * @param Maxvel the Maxvel to set
     */
    public void setMaxvel(String Maxvel) {
        this.Maxvel = Maxvel;
    }
    
    private int orden;
    private String Serie;
    private String marca;
    private String Maxvel;

    @Override
    public String toString() {
        
        return  orden + "  Serie\t" + Serie + "\tMarca\t" + marca + "\tLimite\t" + Maxvel;
    }
    
    
    
}

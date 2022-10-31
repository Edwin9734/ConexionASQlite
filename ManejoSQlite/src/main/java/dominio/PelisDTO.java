/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Usuario
 */
public class PelisDTO {

    /**
     * @return the ordenP
     */
    public int getOrdenP() {
        return ordenP;
    }

    /**
     * @param ordenP the ordenP to set
     */
    public void setOrdenP(int ordenP) {
        this.ordenP = ordenP;
    }

    /**
     * @return the nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * @param nombreP the nombreP to set
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    /**
     * @return the vistasP
     */
    public String getVistasP() {
        return vistasP;
    }

    /**
     * @param vistasP the vistasP to set
     */
    public void setVistasP(String vistasP) {
        this.vistasP = vistasP;
    }

    /**
     * @return the punteoP
     */
    public String getPunteoP() {
        return punteoP;
    }

    /**
     * @param punteoP the punteoP to set
     */
    public void setPunteoP(String punteoP) {
        this.punteoP = punteoP;
    }

    @Override
    public String toString() {
        return ordenP + "\tNombre\t" + nombreP + "\tvistast\t" + vistasP + "\tCalidad\t" + punteoP ;
    }
    
    private int ordenP;
    private String nombreP;
    private String vistasP;
    private String punteoP;
   
    
}

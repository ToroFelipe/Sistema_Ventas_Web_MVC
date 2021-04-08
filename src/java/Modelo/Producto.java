/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Felipe
 */
public class Producto {
    int idPro;
    String nomPro;
    int prePro;
    int stoPro;
    String estadoPro;

    public Producto() {
    }

    public Producto(int idPro, String nomPro, int prePro, int stoPro, String estadoPro) {
        this.idPro = idPro;
        this.nomPro = nomPro;
        this.prePro = prePro;
        this.stoPro = stoPro;
        this.estadoPro = estadoPro;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    public int getPrePro() {
        return prePro;
    }

    public void setPrePro(int prePro) {
        this.prePro = prePro;
    }

    public int getStoPro() {
        return stoPro;
    }

    public void setStoPro(int stoPro) {
        this.stoPro = stoPro;
    }

    public String getEstadoPro() {
        return estadoPro;
    }

    public void setEstadoPro(String EstadoPro) {
        this.estadoPro = EstadoPro;
    }
    
    
    
    
    
    
    
}

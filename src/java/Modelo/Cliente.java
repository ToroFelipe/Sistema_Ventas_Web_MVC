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
public class Cliente {

    int idCli;
    String dniCli;
    String nomCli;
    String dirCli;
    String estadoCli;

    public Cliente() {
    }

    public Cliente(int idCli, String dniCli, String nomCli, String dirCli, String estadoCli) {
        this.idCli = idCli;
        this.dniCli = dniCli;
        this.nomCli = nomCli;
        this.dirCli = dirCli;
        this.estadoCli = estadoCli;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getDniCli() {
        return dniCli;
    }

    public void setDniCli(String dniCli) {
        this.dniCli = dniCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getDirCli() {
        return dirCli;
    }

    public void setDirCli(String dirCli) {
        this.dirCli = dirCli;
    }

    public String getEstadoCli() {
        return estadoCli;
    }

    public void setEstadoCli(String estadoCli) {
        this.estadoCli = estadoCli;
    }

}

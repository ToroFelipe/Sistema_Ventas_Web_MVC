/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tclplate file, choose Tools | Tclplates
 * and open the tclplate in the editor.
 */
package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class ClienteDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    //operaciones crud
    public List listar() {
        String sql = "select * from cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cl = new Cliente();
                cl.setIdCli(rs.getInt(1));
                cl.setDniCli(rs.getString(2));
                cl.setNomCli(rs.getString(3));
                cl.setDirCli(rs.getString(4));
                cl.setEstadoCli(rs.getString(5));

                lista.add(cl);
            }

        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Cliente cl) {
        String sql = "insert into Cliente(Dni, Nombres, Direccion, Estado)values(?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getDniCli());
            ps.setString(2, cl.getNomCli());
            ps.setString(3, cl.getDirCli());
            ps.setString(4, cl.getEstadoCli());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;
    }

    public Cliente listarId(int idCli) {
        Cliente cl1 = new Cliente();
        String sql = "select * from cliente where IdCliente=" + idCli;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cl1.setDniCli(rs.getString(2));
                cl1.setNomCli(rs.getString(3));
                cl1.setDirCli(rs.getString(4));
                cl1.setEstadoCli(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return cl1;

    }

    public int actualizar(Cliente cl) {
        String sql = "update cliente set Dni=?,Nombres=?,Direccion=?,Estado=? where IdCliente=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getDniCli());
            ps.setString(2, cl.getNomCli());
            ps.setString(3, cl.getDirCli());
            ps.setString(4, cl.getEstadoCli());
            ps.setInt(5, cl.getIdCli());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;
    }

    public void delete(int idCli) {
        String sql = "delete from cliente where IdCliente=" + idCli;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}

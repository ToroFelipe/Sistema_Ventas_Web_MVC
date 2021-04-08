/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class ProductoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    //operaciones crud
    public List listar() {
        String sql = "select * from producto";
        List<Producto> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pr = new Producto();
                pr.setIdPro(rs.getInt(1));
                pr.setNomPro(rs.getString(2));
                pr.setPrePro(rs.getInt(3));
                pr.setStoPro(rs.getInt(4));
                pr.setEstadoPro(rs.getString(5));

                lista.add(pr);
            }

        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Producto pr) {
        String sql = "insert into producto(Nombres, Precio, Stock, Estado)values(?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNomPro());
            ps.setInt(2, pr.getPrePro());
            ps.setInt(3, pr.getStoPro());
            ps.setString(4, pr.getEstadoPro());

            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;
    }

    public Producto listarId(int idPro) {
        Producto pro = new Producto();
        String sql = "select * from producto where IdProducto=" + idPro;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pro.setNomPro(rs.getString(2));
                pro.setPrePro(rs.getInt(3));
                pro.setStoPro(rs.getInt(4));
                pro.setEstadoPro(rs.getString(5));

            }
        } catch (Exception e) {
        }
        return pro;

    }

    public int actualizar(Producto pr) {
        String sql = "update producto set Nombres=?,Precio=?,Stock=?,Estado=? where IdProducto=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNomPro());
            ps.setInt(2, pr.getPrePro());
            ps.setInt(3, pr.getStoPro());
            ps.setString(4, pr.getEstadoPro());
            ps.setInt(5, pr.getIdPro());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return r;
    }

    public void delete(int idPro) {
        String sql = "delete from producto where IdProducto=" + idPro;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}

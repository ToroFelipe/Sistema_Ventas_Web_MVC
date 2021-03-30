/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Felipe
 */
public class Conexion {

    Connection con;
    private static String url = "jdbc:mysql://localhost:3306/bd_ventas?serverTimezone=UTC&useSSL=false";
   private static String user = "root";
    private static String pass = "rootroot";

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("error de conexion " + e.getMessage());
        }

        return con;
    }
}

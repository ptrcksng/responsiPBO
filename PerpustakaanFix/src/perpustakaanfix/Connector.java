/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanfix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author patricksinaga
 */
public class Connector {
    Connection myConn = null;
    String DBurl = "jdbc:mysql://localhost:8080/mahasiswa";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    public Connector() {
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
            myConn = DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
            Statement stmt = (Statement) myConn.createStatement();
        }catch(SQLException e){
            System.out.println("gagal koneksi");
        }
    }
}

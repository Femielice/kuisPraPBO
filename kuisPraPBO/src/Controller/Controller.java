/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Person;
import View.inputDataMahasiswa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A442UF
 */
public class Controller {
    public void insertData(String query){
        DatabaseHandler conn = new DatabaseHandler();
//        conn.connect();
//        String query = "INSERT INTO person (?,?,?,?)";
//        try{
//            PreparedStatement stmt = conn.con.prepareStatement(query);
//            stmt.setString(1, query);
//            stmt.setString(2, nama);
//            stmt.setString(3, tgl);
//            stmt.setString(4, umur);
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
    }
    
}

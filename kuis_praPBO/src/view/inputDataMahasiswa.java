/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Controller.DatabaseHandler;
import Model.Person;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author A442UF
 */
public class inputDataMahasiswa {
    public inputDataMahasiswa(){
        JFrame frame = new JFrame("DATA MAHASISWA ITHB");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Input");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        
        JLabel NIM;
        NIM = new JLabel("NIM");
        NIM.setBounds(120, 100, 100, 30);
        frame.add(NIM);
        JTextField fieldNIM;
        fieldNIM = new JTextField();
        fieldNIM.setBounds(210, 100, 157, 30);
        frame.add(fieldNIM);
        
        JLabel nama;
        nama = new JLabel("Nama");
        nama.setBounds(120, 150, 100, 30);
        frame.add(nama);
        JTextField fieldNama;
        fieldNama = new JTextField();
        fieldNama.setBounds(210, 150, 157, 30);
        frame.add(fieldNama);
           
        JLabel tl;
        tl = new JLabel("Tanggal Lahir");
        tl.setBounds(120, 200, 100, 30);
        frame.add(tl);
        JTextField fieldTl;
        fieldTl = new JTextField();
        fieldTl.setBounds(210, 200, 157, 30);
        frame.add(fieldTl);
        
        JLabel umur;
        umur = new JLabel("Umur");
        umur.setBounds(120, 300, 100, 30);
        frame.add(umur);
        JTextField fieldUmur;
        fieldUmur = new JTextField();
        fieldUmur.setBounds(210, 300, 157, 30);
        frame.add(fieldUmur);
        
        JButton save;
        save = new JButton("Save");
        save.setBounds(355, 400, 70, 30);
        save.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseHandler conn = new DatabaseHandler();
                conn.connect();
                String query = "INSERT INTO person VALUES (?,?,?,?)";
                try{
                    PreparedStatement stmt = conn.con.prepareStatement(query);
                    stmt.setString(1, fieldNIM.getText());
                    stmt.setString(2, fieldNama.getText());
                    stmt.setString(3, fieldTl.getText());
                    stmt.setString(4, fieldUmur.getText());
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Telah di input");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } 
        });
        frame.add(save);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

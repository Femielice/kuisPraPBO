/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DatabaseHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author A442UF
 */
public class screenInsertDataJurusan {
    public screenInsertDataJurusan(){
        JFrame frame = new JFrame("Menu");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Insert Data Jurusan Baru");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        
        JLabel Kode;
        Kode = new JLabel("Kode");
        Kode.setBounds(120, 100, 100, 30);
        frame.add(Kode);
        JTextField fieldKode;
        fieldKode = new JTextField();
        fieldKode.setBounds(210, 100, 157, 30);
        frame.add(fieldKode);
        
        JLabel Nama;
        Nama = new JLabel("Nama");
        Nama.setBounds(120, 150, 100, 30);
        frame.add(Nama);
        JTextField fieldNama;
        fieldNama = new JTextField();
        fieldNama.setBounds(210, 150, 157, 30);
        frame.add(fieldNama);
        
        JButton insert;
        insert = new JButton("Insert");
        insert.setBounds(355, 500, 70, 30);
        insert.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseHandler conn = new DatabaseHandler();
                conn.connect();
                String query = "INSERT INTO jurusan VALUES (?,?)";
                try{
                    PreparedStatement stmt = conn.con.prepareStatement(query);
                    stmt.setString(1, fieldKode.getText());
                    stmt.setString(2, fieldNama.getText());
                    stmt.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } 
        });
        frame.add(insert);
        
        JButton exit;
        exit = new JButton("Exit");
        exit.setBounds(355, 550, 70, 30);
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Tampilan();
            }
        });
        frame.add(exit);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
}


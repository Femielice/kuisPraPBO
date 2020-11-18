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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;
import model.Jurusan;

/**
 *
 * @author A442UF
 */
public class screenInsertDataMahasiswaBaru {
    public screenInsertDataMahasiswaBaru(){
        JFrame frame = new JFrame("Menu");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Insert Data Mahasiswa Baru");
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
        
        JLabel Nama;
        Nama = new JLabel("Nama");
        Nama.setBounds(120, 150, 100, 30);
        frame.add(Nama);
        JTextField fieldNama;
        fieldNama = new JTextField();
        fieldNama.setBounds(210, 150, 157, 30);
        frame.add(fieldNama);
        
        JLabel Angkatan;
        Angkatan = new JLabel("Angkatan");
        Angkatan.setBounds(120, 200, 100, 30);
        frame.add(Angkatan);
        JTextField fieldAngkatan;
        fieldAngkatan = new JTextField();
        fieldAngkatan.setBounds(210, 200, 157, 30);
        frame.add(fieldAngkatan);
        
        JLabel Jurusan;
        Jurusan = new JLabel("Jurusan");
        Jurusan.setBounds(120, 250, 100, 30);
        frame.add(Jurusan);

        JButton save;
        save = new JButton("Save");
        save.setBounds(355, 500, 70, 30);
        frame.add(save);
        save.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseHandler conn = new DatabaseHandler();
                conn.connect();
                String query = "INSERT INTO mahasiswa VALUES (?,?, ?)";
                try{
                    PreparedStatement stmt = conn.con.prepareStatement(query);
                    stmt.setString(1, fieldNIM.getText());
                    stmt.setString(2, fieldNama.getText());
                    stmt.setInt(3, fieldAngkatan.getColumns());
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } 
        });
        JButton back;
        back = new JButton("Back");
        back.setBounds(355, 550, 70, 30);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Tampilan();
            }
            
        });
        frame.add(back);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

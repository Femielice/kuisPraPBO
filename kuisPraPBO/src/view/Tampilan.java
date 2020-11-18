/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author A442UF
 */
public class Tampilan {
    public Tampilan(){
        JFrame frame = new JFrame("Menu");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true); 
        
        JPanel panel = new JPanel();
        panel.setBounds(50, 70, 500, 700);
        
        JLabel label;
        label = new JLabel("SELAMAT DATANG");
        label.setBounds(120, 50, 300, 30);
        JPanel labell = new JPanel();
        panel.add(labell);
        frame.add(label);
        
        JButton insertJurusan;
        insertJurusan = new JButton("Insert Data Jurusan Baru");
        insertJurusan.setBounds(179, 100, 200, 30);
        insertJurusan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenInsertDataJurusan();
            } 
        });
        JPanel insert = new JPanel();
        panel.add(insert);
        frame.add(insertJurusan);
       
        JButton lihatDataJurusan;
        lihatDataJurusan = new JButton("Lihat Data Jurusan");
        lihatDataJurusan.setBounds(179, 150, 200, 30);
        lihatDataJurusan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
            
        });
        JPanel lihatData = new JPanel();
        panel.add(lihatData);
        frame.add(lihatDataJurusan);
        
        JButton insertMahasiswa;
        insertMahasiswa= new JButton("Insert Data Mahasiswa Baru");
        insertMahasiswa.setBounds(179, 200, 200, 30);
        insertMahasiswa.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new screenInsertDataMahasiswaBaru();
            }
            
        });
        JPanel insertM = new JPanel();
        panel.add(insertM);
        frame.add(insertMahasiswa);
        
        
        JButton lihatDataMahasiswa;
        lihatDataMahasiswa = new JButton("Lihat Data Mahasiswa");
        lihatDataMahasiswa.setBounds(179, 250, 200, 30);
        lihatDataMahasiswa.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }    
        });
        frame.add(lihatDataMahasiswa);
        JPanel lihatDataM = new JPanel();
        panel.add(lihatDataM);
    }
    
    public static void main(String [] args){
        new Tampilan();
    }
        
}


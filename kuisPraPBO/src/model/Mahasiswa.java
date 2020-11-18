/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author A442UF
 */
public class Mahasiswa {
    private String NIM;
    private String nama;
    private int angkatan;
    
    public Mahasiswa(){    
    }  

    public Mahasiswa(String NIM, String nama, int angkatan) {
        this.NIM = NIM;
        this.nama = nama;
        this.angkatan = angkatan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
    
}

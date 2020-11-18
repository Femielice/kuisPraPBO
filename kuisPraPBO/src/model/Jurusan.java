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
public class Jurusan {
    String kode_Jurusan;
    private String nama;
    
    public Jurusan(){
    }

    public Jurusan(String kode_Jurusan, String nama) {
        this.kode_Jurusan = kode_Jurusan;
        this.nama = nama;
    }

    public String getKode_Jurusan() {
        return kode_Jurusan;
    }

    public void setKode_Jurusan(String kode_Jurusan) {
        this.kode_Jurusan = kode_Jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}

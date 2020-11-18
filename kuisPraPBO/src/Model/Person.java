/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author A442UF
 */
public class Person {
    private String NIM;
    private String nama;
    private String tgl;
    private String umur;
    
    public Person(){
    }

    public Person(String NIM, String nama, String tgl, String umur) {
        this.NIM = NIM;
        this.nama = nama;
        this.tgl = tgl;
        this.umur = umur;
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

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }
    
    
    
    
    
    
}

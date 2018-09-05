/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author user
 */
public class Dokter {
    private String NomorPegawai;
    private String nama,alamat,tempatLahir;
    private int tanggallahir;

    public Dokter() {
    }

    public void setNomorPegawai(String NomorPegawai) {
        this.NomorPegawai = NomorPegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public void setTanggallahir(int tanggallahir) throws Exception{
        if (tanggallahir> 0) {
            if (tanggallahir<=31) {
                
            }  
        }else 
        { throw new Exception ("salaah luuu...");
        
    }  
}

    public String getNomorPegawai() {
        return NomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public int getTanggallahir() {
        return tanggallahir;
    }
    
    
}
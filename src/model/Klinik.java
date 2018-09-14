/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Kasih_175314122
 */
public class Klinik {
 private String idklinik;// pendeklarasian variabel idklinik dengan tipe string
 private String nama;//pendeklarasian variabel nama dengan tipe string
 
 /**
 * method getIdklinik dengan tipe String dan didalam method ini terdapat return Idklinik dimana nilai dari nama akan dibalikan ke getIdklinik
 */
    public String getIdklinik() {
        return idklinik;
    }
/**method setIdklinik dengan tipe void dan berparameter String Idklinik.
 * Didalam method terdapat this yang berfungsi untuk merujuk atribut dalam method yang sedang berlaku 
 * dan pada dasarnya this digunakan ketika nama atribut sama dengan variable local*/
    public void setIdklinik(String idklinik) {
        this.idklinik = idklinik;
    }
/**
 * method getNama dengan tipe String dan didalam method ini terdapat return nama dimana nilai dari nama akan dibalikan ke getNama
 */
    public String getNama() {
        return nama;
    }
    
/**method setNama dengan tipe void dan berparameter String Nama
 * Didalam method terdapat this yang berfungsi untuk merujuk atribut dalam method yang sedang berlaku 
 * dan pada dasarnya this digunakan ketika nama atribut sama dengan variable local*/
    public void setNama(String nama) {
        this.nama = nama;
    }
 
}


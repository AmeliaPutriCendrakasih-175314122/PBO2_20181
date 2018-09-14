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
public class AntrianPasien {
     private int tanggalAntrian;//pendeklarasian variable tanggalAntrian dengan tipe integer.
     private int bulanAntrian;//pendeklarasian variable bulanAntrian dengan tipe integer.
     private int tahunAntrian; //pendeklarasian variable tahunAntrian dengan tipe integer.
     private Klinik klinik; //pendeklarasian variable klinik dengan tipe klinik.
     private Pasien daftarPasien[];//pendeklarasian variable array daftarpasien dengan tipe pasien. 

 /**
 * method getKlinik dengan tipe Klinik dan didalam method ini terdapat return Klinik dimana nilai dari nama akan dibalikan ke getKlinik
 */ 
    public Klinik getKlinik() {
        return klinik;
    }
/**method setKlinik dengan tipe void dan berparameter Klinik klinik.
 * Didalam method terdapat this yang berfungsi untuk merujuk atribut dalam method yang sedang berlaku 
 * dan pada dasarnya this digunakan ketika nama atribut sama dengan variable local*/
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }
/**
 * method getDaftarPasien dengan tipe array Pasien dan didalam method ini terdapat return daftarpasien dimana nilai dari nama akan dibalikan ke getDaftarPasien
 */
    public Pasien[] getDaftarPasien() {
        return daftarPasien;
    }
/**method setDaftarPasien dengan tipe void dan berparameter Pasien[] daftarPasien.
 * Didalam method terdapat this yang berfungsi untuk merujuk atribut dalam method yang sedang berlaku 
 * dan pada dasarnya this digunakan ketika nama atribut sama dengan variable local*/
    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }
   

}

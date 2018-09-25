/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

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
     private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();//mendeklarasikan variabel array pasienList dengan tipe objek ArrayList
     public static ArrayList<AntrianPasien> antrianPasien = new ArrayList<AntrianPasien>();
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
     public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasienAntri;
    }
/**method setDaftarPasien dengan tipe void dan berparameter Pasien[] daftarPasien.
 * Didalam method terdapat this yang berfungsi untuk merujuk atribut dalam method yang sedang berlaku 
 * dan pada dasarnya this digunakan ketika nama atribut sama dengan variable local*/
    public void setDaftarPasien(ArrayList<Pasien> pasien) {
        this.daftarPasienAntri = pasien;
    }
    public void Mendaftar(Pasien pasien) {
        daftarPasienAntri.add(pasien);
    }
     public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
        if (cariAntrian(tanggal, bulan, tahun, klinik) == -1) {
            AntrianPasien.antrianPasien.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
        }
    }

    public static AntrianPasien cariPasien(String noRM) {
        for (int i = 0; i < antrianPasien.size(); i++) {
            if (antrianPasien.get(i).daftarPasienAntri.equals(noRM)) {
                return antrianPasien.get(i);
            }
        }
        return null;
    }

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    public static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < antrianPasien.size(); i++) {
            if (antrianPasien.get(i).getTanggalAntrian() == tanggal) {
                if (antrianPasien.get(i).getBulanAntrian() == bulan) {
                    if (antrianPasien.get(i).getTahunAntrian() == tahun) {

                        if (antrianPasien.get(i).getKlinik().getIdklinik().equalsIgnoreCase(klinik.getIdklinik())) {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
        AntrianPasien antrian = new AntrianPasien();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        if (cariAntrian(tanggal, bulan, tahun, klinik) == -1) {
            antrianPasien.add(antrian);
        } else {
            throw new Exception("Data sudah terdaftar");
        }
    }

    public void printInfo() {
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("Daftar Antrian Pasien" + "\n");
        for (int i = 0; i < daftarPasienAntri.size(); i++) {
            daftarPasienAntri.get(i).printInfo(); //mengeprint data pasien setiap index
        }
   

}}

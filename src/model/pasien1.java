/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class pasien1 {

    private String noRekmedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String nik;
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    /**
     * method ini merupakan costructor kosong yang tidak memiliki parameter
     */

    pasien1(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir=tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.nik = nik;
    }

    public String getNoRekmedis() {
        return noRekmedis;
    }

    public void setNoRekmedis(String noRekmedis) {
        this.noRekmedis = noRekmedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {

            } else {
                throw new Exception("bulan lahir salah..");
            }
        }
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0 && tanggalLahir <= 31) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("salah");
        }
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 2018) {
            if (tahunLahir <= 2020) {

            } else {
                throw new Exception("tahun salah");
            }
        }
    }

    public static void tambahPasienBaru(Pasien pasien) {

        daftarPasienKlinik.add(pasien);
    }
    
    

    public static Pasien cariPasien(String NoRm) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).noRekmedis == NoRm) {
                return daftarPasienKlinik.get(i);
            }
        }
        return null;

    }
}

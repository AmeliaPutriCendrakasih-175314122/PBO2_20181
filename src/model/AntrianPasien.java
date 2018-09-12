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
public class AntrianPasien extends pasien1{
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private pasien1 [] daftarpasien;

    public AntrianPasien(String nama) {
        super(nama);
    }

    
    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    
    public void setTanggalAntrian(int tanggalAntrian)throws Exception {
        if (tanggalAntrian>0 && tanggalAntrian<=31) {
            this.tanggalAntrian=tanggalAntrian;
            }
         else{
                throw new Exception ("tanggalnya salah cuy....");
            }
    }

    public void setKlinik(Klinik klinik) {
        if (true) {
            
        }
        this.klinik = klinik;
    }

    public void setPasien1(pasien1[] daftarpasien) {
        this.daftarpasien = daftarpasien;
    }

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }


    public Klinik getKlinik() {
        return klinik;
    }

    public pasien1[] getPasien1() {
        return daftarpasien;
    }

}

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
public class Pasien {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
//        pasien1  p = new pasien1();
//        AntrianPasien AP = new AntrianPasien();
//        Dokter D= new Dokter();
//        pasien1 ps[]=new pasien1[1];
//        Klinik kl=new Klinik();
        pasien1 test = new pasien1(
                "Puspa", // nama pasien
                "Klaten", // alamat
                "Medan", // tempat lahir
                12, // tanggal lahir
                01, // bulan lahir
                1974, // tahun lahir
                "19740112" // NIK
        );

        pasien1 test1 = new pasien1(
                "Budi", // nama pasien
                "Klaten", // alamat
                "Klaten", // tempat lahir
                10, // tanggal lahir
                01, // bulan lahir
                1999, // tahun lahir
                "19990110" // NIK
        );

        Pasien.tambahPasienBaru(test);
        Pasien.tambahPasienBaru(test1);

        for (int i = 0; i < pasien1.daftarPasienKlinik.size(); i++) {
            System.out.println("Nama : " + pasien1.daftarPasienKlinik.get(i).getNama());
        }

        Pasien cari = pasien1.cariPasien("19990110");
        System.out.println("Nama Hasil Pencarian = " + cari.getNama());
    }

    private static void tambahPasienBaru(Pasien test) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Pasien noRekmedis;

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void tambahPasienBaru(pasien1 test) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String noRekmedis;

    private String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Kasih_175314122
 */
public class Pasien {

    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();// Arraylist berguna untuk mengisi setnama,setalamat,settempatLahir,settanggalLahir,setbulanLahir,
    //settahunLahir,setnoRekmedis yang ada pada kelas pasien sebanyak data yang ada pada database.
    private String nama; // pendeklarasian variable nama dengan tipe String
    private String alamat;// pendeklarasian variable alamat dengan tipe String
    private String tempatLahir;// pendeklarasian variable tempat lahir dengan tipe String
    private int tanggalLahir;// pendeklarasian variable tanggal lahir dengan tipe integer
    private int bulanLahir;// pendeklarasian variable bulan lahir dengan tipe integer
    private int tahunLahir;// pendeklarasian variable tahun lahir dengan tipe integer
    private String noRekmedis, nik;// pendeklarasian variable nomor rekam medis  dengan tipe String

    
    /**
     * method ini merupakan costructor yang memiliki parameter String nama,
     * String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int
     * tahunLahir,String noRekmedis dengan this yang berfungsi untuk merujuk
     * atribut dalam method yang sedang berlaku dan pada dasarnya this digunakan
     * ketika nama atribut sama dengan variable local.
     *
     * @param nama
     * @param alamat
     * @param tempatLahir
     * @param tanggalLahir
     * @param bulanLahir
     * @param tahunLahir
     * @param noRekmedis
     
     */
    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String noRekmedis) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.noRekmedis = noRekmedis;
       
    }

    public Pasien() {
    }

   

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * method getNoRekmedis dengan tipe String dan didalam method ini terdapat
     * return noRekmedis dimana nilai dari NoRekmedis akan dibalikan ke
     * getNoRekmedis
     *
     * @return
     */
    public String getNoRekmedis() {
        return noRekmedis;
    }

    /**
     * method setNoRekmedis bertipe void dengan menambahkan fungsi throws
     * NumberFormatException serta di tambah throw new NumberFormatException
     * berfungsi yang memberitahu user bahwa nilai yang dikeluarkan salah
     *
     * @param noRekmedis
     */
    public void setNoRekmedis(String noRekmedis) {
        this.noRekmedis = noRekmedis;

    }

    /**
     * method getNama dengan tipe String dan didalam method ini terdapat return
     * nama dimana nilai dari nama akan dibalikan ke getnama
     *
     * @return
     */
    public String getNama() {
        return nama;
    }

    /**
     * method setnama dengan tipe void dan berparameter String nama. Didalam
     * method terdapat this yang berfungsi untuk merujuk atribut dalam method
     * yang sedang berlaku dan pada dasarnya this digunakan ketika nama atribut
     * sama dengan variable local
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * method getAlamat dengan tipe String dan didalam method ini terdapat
     * return Alamat dimana nilai dari nama akan dibalikan ke getAlamat
     *
     * @return
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * method setAlamat dengan tipe void dan berparameter String alamat. Didalam
     * method terdapat this yang berfungsi untuk merujuk atribut dalam method
     * yang sedang berlaku dan pada dasarnya this digunakan ketika nama atribut
     * sama dengan variable local
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * method getBulanLahir dengan tipe int dan didalam method ini terdapat
     * return BulanLahir dimana nilai dari nama akan dibalikan ke getBulanLahir
     *
     * @return
     */
    public int getBulanLahir() {
        return bulanLahir;
    }

    /**
     * method setNoRekmedis bertipe void dengan menambahkan fungsi throws
     * Exception serta di tambah throw new Exception berfungsi yang memberitahu
     * user bahwa nilai yang dikeluarkan salah
     *
     * @param bulanLahir
     * @throws java.lang.Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0 && bulanLahir < 13) {
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception(" Bulan Lahir Anda Tidak Terdeteksi ");
        }
    }

    /**
     * method setTempatLahir dengan tipe void dan berparameter String
     * TempatLahir. Didalam method terdapat this yang berfungsi untuk merujuk
     * atribut dalam method yang sedang berlaku dan pada dasarnya this digunakan
     * ketika nama atribut sama dengan variable local
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * method setTanggalLahir bertipe void dengan menambahkan fungsi throws
     * Exception serta di tambah throw new Exception berfungsi yang memberitahu
     * user bahwa nilai yang dikeluarkan salah
     *
     * @param tanggalLahir
     * @throws java.lang.Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0 && tanggalLahir < 31) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("salah");
        }
    }

    /**
     * method getTanggalLahir dengan tipe int dan didalam method ini terdapat
     * return TanggalLahir dimana nilai dari nama akan dibalikan ke
     * getTanggalLahir
     *
     * @return
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * method setTahunLahir bertipe void dengan menambahkan fungsi throws
     * Exception serta di tambah throw new Exception berfungsi yang memberitahu
     * user bahwa nilai yang dikeluarkan salah
     *
     * @param tahunLahir
     * @throws java.lang.Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception(" Tahun Lahir Anda Tidak Terdeteksi ");
        }
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    /**
     * method tambahPasienBaru dengan tipe void dan bersifat statik ini
     * merupakan method dengan parameter pasien dengan tipe Pasien juga yang
     * berfungsi untuk menambah jumlah pasien dengan memanggil
     * daftarPassienKlinik dan di tambah operator add dengan parameter pasien.
     *
     * @param pasien
     */
    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public static void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        Pasien.daftarPasien = daftarPasien;
    }

    public String Pendaftaran() {
        Date D = new Date();
        noRekmedis = "yyyyMMdd";
        SimpleDateFormat x = new SimpleDateFormat(noRekmedis);
        String sub_nama = nama.substring(0, 3);
        return noRekmedis = x.format(D).concat(sub_nama);
    }

    public void printInfo() {
        System.out.printf("%-25s", "Nomor Rekam Medis Pasien");
        System.out.println(": " + getNoRekmedis());
        System.out.printf("%-25s", "Nama Pasien");
        System.out.println(": " + getNama());
        System.out.printf("%-25s", "Tempat, Tanggal Lahir");
        System.out.print(": " + getTempatLahir() + " , ");
        getTanggalLahir();
        System.out.printf("%-25s", "Alamat");
        System.out.println(": " + getAlamat());
        System.out.println("");
    }

    /**
     * method caripasien dengan tipe Pasien dan bersifat static ini merupakan
     * method yang berfungsi untuk mencari data pasien yang diinginkan user.
     * sama seperti method getter , method ini juga memiliki nilai balik yang
     * berfungsi untuk mengembalikan nilai method jika ditemukan nilainya , dan
     * return null untuk data yang tdk ditemukan.
     *
     * @param noRekmedis
     * @return
     */
    public static Pasien cariPasien(String noRekmedis) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNik().equals(noRekmedis)) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }

    public static void simpanDaftarPasien(File file) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, true);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        String hasil = "";
        int data; // membuka fila 
        boolean nama = false;
        boolean alamat = false;
        Pasien input = new Pasien();
        try {
            fis = new FileInputStream(file);
            while ((data = fis.read()) > 0) {
                if ((char) data != '\n') {
                    if ((char) data != '\t') {
                        hasil = hasil+(char)data;
                    } else if (nama == false) {
                        input.setNama(hasil);
                        nama = true;
                        hasil = "";
                    } else if (alamat == false) {
                        input.setAlamat(hasil);
                        alamat = true;
                        hasil = "";

                    }

                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    @Override
    public String toString() {
        return noRekmedis + "\t" + nama + "\t" + alamat + "\n";
    }

}

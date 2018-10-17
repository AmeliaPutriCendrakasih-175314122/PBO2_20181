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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Kasih_175314122
 */
public class Pasien {

    public static Object getDaftarPasien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void bacaDaftarPasien(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void simpanDaftarPasien(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String nama; // pendeklarasian variable nama dengan tipe String
    private String alamat;// pendeklarasian variable alamat dengan tipe String
    private String tempatLahir;// pendeklarasian variable tempat lahir dengan tipe String
    private int tanggalLahir;// pendeklarasian variable tanggal lahir dengan tipe integer
    private int bulanLahir;// pendeklarasian variable bulan lahir dengan tipe integer
    private int tahunLahir;// pendeklarasian variable tahun lahir dengan tipe integer
    private String noRekmedis;// pendeklarasian variable nomor rekam medis  dengan tipe String
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();// Arraylist berguna untuk mengisi setnama,setalamat,settempatLahir,settanggalLahir,setbulanLahir,
    //settahunLahir,setnoRekmedis yang ada pada kelas pasien sebanyak data yang ada pada database.

    /**
     * method ini merupakan costructor yang memiliki parameter String nama,
     * String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int
     * tahunLahir,String noRekmedis dengan this yang berfungsi untuk merujuk
     * atribut dalam method yang sedang berlaku dan pada dasarnya this digunakan
     * ketika nama atribut sama dengan variable local.
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

    /**
     * method getNoRekmedis dengan tipe String dan didalam method ini terdapat
     * return noRekmedis dimana nilai dari NoRekmedis akan dibalikan ke
     * getNoRekmedis
     */
    public String getNoRekmedis() {
        return noRekmedis;
    }

    /**
     * method setNoRekmedis bertipe void dengan menambahkan fungsi throws
     * NumberFormatException serta di tambah throw new NumberFormatException
     * berfungsi yang memberitahu user bahwa nilai yang dikeluarkan salah
     */
    public void setNoRekmedis(String noRekmedis) throws NumberFormatException {
        if (noRekmedis.toCharArray().length >= 10) {
            this.noRekmedis = noRekmedis;
        } else {
            throw new NumberFormatException("Nomor Rekam Medis Tidak Terdeteksi.....");
        }
    }

    /**
     * method getNama dengan tipe String dan didalam method ini terdapat return
     * nama dimana nilai dari nama akan dibalikan ke getnama
     */
    public String getNama() {
        return nama;
    }

    /**
     * method setnama dengan tipe void dan berparameter String nama. Didalam
     * method terdapat this yang berfungsi untuk merujuk atribut dalam method
     * yang sedang berlaku dan pada dasarnya this digunakan ketika nama atribut
     * sama dengan variable local
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * method getAlamat dengan tipe String dan didalam method ini terdapat
     * return Alamat dimana nilai dari nama akan dibalikan ke getAlamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * method setAlamat dengan tipe void dan berparameter String alamat. Didalam
     * method terdapat this yang berfungsi untuk merujuk atribut dalam method
     * yang sedang berlaku dan pada dasarnya this digunakan ketika nama atribut
     * sama dengan variable local
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * method getBulanLahir dengan tipe int dan didalam method ini terdapat
     * return BulanLahir dimana nilai dari nama akan dibalikan ke getBulanLahir
     */
    public int getBulanLahir() {
        return bulanLahir;
    }

    /**
     * method setNoRekmedis bertipe void dengan menambahkan fungsi throws
     * Exception serta di tambah throw new Exception berfungsi yang memberitahu
     * user bahwa nilai yang dikeluarkan salah
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
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * method setTahunLahir bertipe void dengan menambahkan fungsi throws
     * Exception serta di tambah throw new Exception berfungsi yang memberitahu
     * user bahwa nilai yang dikeluarkan salah
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
     */
    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    /**
     * method caripasien dengan tipe Pasien dan bersifat static ini merupakan
     * method yang berfungsi untuk mencari data pasien yang diinginkan user.
     * sama seperti method getter , method ini juga memiliki nilai balik yang
     * berfungsi untuk mengembalikan nilai method jika ditemukan nilainya , dan
     * return null untuk data yang tdk ditemukan.
     */
    public static Pasien cariPasien(String string) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).noRekmedis == string) {
                return daftarPasienKlinik.get(i);
            }
        }
        return null;

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
     public static void SimpanDaftarPasien(File file){
         FileOutputStream fos = null;
         try{
             for (int i = 0; i < daftarPasienKlinik.size(); i++) {
                 String data = daftarPasienKlinik.get(i).toString();
                 fos.write(data.getBytes());
                 
             }
         }catch (IOException ex){
             Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE,null,ex);
         }

    }
     public static void bacaDaftarPasien(File file){
         FileInputStream input = null;
                int data; // membuka fila             
                   try {
                   input = new FileInputStream("text.txt");
                   }catch (FileNotFoundException fn) {
                         System.out.println("File gak ketemu");
                   } //Memebaca data dari file
                   try {
                   while ((data = input.read()) != -1) {
                        System.out.println((char) data);
                   }
                        System.out.println();
                   } catch(IOException in){
                         System.out.println(in.getMessage());
                   }//menutup file
                  try {
                  input.close();
               } catch(IOException e) {}
     }
     
         
     }
   


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
public class Dokter {
    private String NomorPegawai;//pendeklarasian variable Nomor pegawai dengan tipe String
    private String nama;//pendeklarasian variable nama dengan tipe String
    private String alamat;//pendeklarasian variable alamat dengan tipe String
    private String tempatLahir;//pendeklarasian variable tempatlahir dengan tipe String
    private int tanggallahir;//pendeklarasian variable tanggalLahir dengan tipe integer

/**method setNomorPegawai dengan tipe void dan berparameter String NomorPegawai.
 * Didalam method terdapat this yang berfungsi untuk merujuk atribut dalam method yang sedang berlaku 
 * dan pada dasarnya this digunakan ketika nama atribut sama dengan variable local*/
    public void setNomorPegawai(String NomorPegawai) {
        this.NomorPegawai = NomorPegawai;
    }
/**method setNama dengan tipe void dan berparameter String Nama.
 * Didalam method terdapat this yang berfungsi untuk merujuk atribut dalam method yang sedang berlaku 
 * dan pada dasarnya this digunakan ketika nama atribut sama dengan variable local*/

    public void setNama(String nama) {
        this.nama = nama;
    }
/**method setAlamat dengan tipe void dan berparameter String Alamat.
 * Didalam method terdapat this yang berfungsi untuk merujuk atribut dalam method yang sedang berlaku 
 * dan pada dasarnya this digunakan ketika nama atribut sama dengan variable local*/
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
/**method setTempatLahir dengan tipe void dan berparameter String TempatLahir.
 * Didalam method terdapat this yang berfungsi untuk merujuk atribut dalam method yang sedang berlaku 
 * dan pada dasarnya this digunakan ketika nama atribut sama dengan variable local*/
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
/**method setTanggallahir dengan tipe void dan berparameter int Tanggallahir,dengan menambahkan fungsi throws Exception.
 * Didalam method terdapat this yang berfungsi untuk merujuk atribut dalam method yang sedang berlaku 
 * dan pada dasarnya this digunakan ketika nama atribut sama dengan variable local 
 * serta di tambah  throw new Exception berfungsi yang memberitahu user bahwa nilai yang dikeluarkan salah*/
    public void setTanggallahir(int tanggallahir) throws Exception{
        if (tanggallahir> 0) {
            if (tanggallahir<=31) {
        }  
        } else 
        { throw new Exception ("Tanggal Tidak Terdeteksi...");
        }}
    /**
 * method getNomorPegawai dengan tipe String dan didalam method ini terdapat return NomorPegawai dimana nilai dari nama akan dibalikan ke getNomorPegawai
 */
    public String getNomorPegawai() {
        return NomorPegawai;
    }
 /**
 * method getNomorPegawai dengan tipe String dan didalam method ini terdapat return NomorPegawai dimana nilai dari nama akan dibalikan ke getNomorPegawai
 */
    public String getNama() {
        return nama;
    }
/**
 * method getAlamat dengan tipe String dan didalam method ini terdapat return Alamat dimana nilai dari nama akan dibalikan ke getAlamat
 */
    public String getAlamat() {
        return alamat;
    }
/**
 * method getTempatLahir dengan tipe String dan didalam method ini terdapat return TempatLahir dimana nilai dari nama akan dibalikan ke getTempatLahir
 */
    public String getTempatLahir() {
        return tempatLahir;
    }
/**
 * method getTanggalLahir dengan tipe String dan didalam method ini terdapat return TanggalLahir dimana nilai dari nama akan dibalikan ke gettanggalLahir
 */
    public int getTanggallahir() {
        return tanggallahir;
    }
    
    
}
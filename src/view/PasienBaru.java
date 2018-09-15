/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class PasienBaru extends JDialog{
    private JLabel judulLabel,namaLabel,alamatLabel,tglLahirLabel,blnLahirLabel,ThnLahirLabel,JenisKelaminLabel; 
     private JTextField namaText;
     private JButton saveButton;
     private JComboBox tglLahir;
     private JComboBox blnLahir;
     private JComboBox thnLahir;
     private JComboBox JenisKelamin;

     public PasienBaru() {
        init();
     }
    public PasienBaru(String title) {
        this.setTitle(title);
        init();
    }
    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel(" Pasien Baru ");
        judulLabel.setBounds(60, 50, 100, 10);
        this.add(judulLabel);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 72, 120, 20);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.setBounds (100,77,65,20);
        namaText.setSize(84,20);
        this.add(namaText); 
        
        alamatLabel = new JLabel("Alamat ");
        alamatLabel.setBounds(20, 92, 70, 65);
        this.add(alamatLabel);
        
        namaText = new JTextField();
        namaText.setBounds (100,110,70,30);
        namaText.setSize(84,20);
        this.add(namaText);
        
        tglLahirLabel = new JLabel("Tgl");
        tglLahirLabel.setBounds(20, 120, 100, 65);
        this.add(tglLahirLabel);
        
        JComboBox tglLahir = new JComboBox();
         for (int i = 1; i <=31; i++) {
           tglLahir.addItem(i);
        }
        tglLahir.setBounds(45,143,67,20);
        this.add(tglLahir);
        
        blnLahirLabel = new JLabel("Bln");
        blnLahirLabel.setBounds(120, 120, 100, 65);
        this.add(blnLahirLabel);
        
        JComboBox blnLahir = new JComboBox();
        blnLahir.addItem("Jan");
        blnLahir.addItem("Feb");
        blnLahir.addItem("Mar");
        blnLahir.addItem("Apr");
        blnLahir.addItem("May");
        blnLahir.addItem("Jun");
        blnLahir.addItem("Jul");
        blnLahir.addItem("aug");
        blnLahir.addItem("Sep");
        blnLahir.addItem("Oct");
        blnLahir.addItem("Nov");
        blnLahir.addItem("Dec");
        blnLahir.setBounds(139,143,67,20);
        this.add(blnLahir);
        
        ThnLahirLabel = new JLabel("Thn");
        ThnLahirLabel.setBounds(210,120,100, 65);
        this.add(ThnLahirLabel);
        
        JComboBox thnLahir = new JComboBox();
        for (int i = 1960; i <=2018; i++) {
            thnLahir.addItem(i);
        }
        thnLahir.setBounds(234,143,67,20);
        this.add(thnLahir);
        
        
        
        JenisKelaminLabel = new JLabel("Jenis Kelamin");
        JenisKelaminLabel.setBounds(20, 150,100, 65);
        this.add(JenisKelaminLabel);
        
        JComboBox Jeniskelamin = new JComboBox();
        Jeniskelamin.addItem("Laki-Laki");
        Jeniskelamin.addItem("Perempuan");
        Jeniskelamin.setBounds(110,173,80,20);
        this.add(Jeniskelamin);
        
        saveButton = new JButton("Simpan");
        saveButton.setBounds(155,240,80,20);
        saveButton.setSize(84, 28);
        this.add(saveButton);
    }

    
 }

    


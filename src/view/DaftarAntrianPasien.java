/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarAntrianPasien extends JDialog{
     private JLabel judulLabel; 
     private JLabel namaLabel;
      private JLabel alamatLabel;
     private JLabel NoRMLabel;
     private JTextField namaText;
     private JButton saveButton;

     public DaftarAntrianPasien() {
        init();
     }
    public DaftarAntrianPasien(String title) {
        this.setTitle(title);
        init();
    }
    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel(" Daftar Pasien");
        judulLabel.setBounds(60, 50, 100, 10);
        this.add(judulLabel);
        
        NoRMLabel = new JLabel("No RekaMedis:");
        NoRMLabel.setBounds(20, 60, 90, 65);
        this.add(NoRMLabel);
        
        namaText = new JTextField();
        namaText.setBounds (110,78,60,20);
        namaText.setSize(80, 16);
        this.add(namaText); 
        
        namaLabel = new JLabel("Nama : ");
        namaLabel.setBounds(20, 76, 50, 65);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.setBounds (110,96,70,20);
        namaText.setSize(80, 15);
        this.add(namaText);
        
        alamatLabel = new JLabel("Alamat: ");
        alamatLabel.setBounds(20, 99, 70, 55);
        this.add(alamatLabel);
        
        namaText = new JTextField();
        namaText.setBounds (110,113,40,20);
        namaText.setSize(80, 15);
        this.add(namaText);
        
        saveButton = new JButton("Simpan");
        saveButton.setBounds(150,150,80,20);
        namaText.setSize(80, 20);
        this.add(saveButton);
    }

    
 }

    


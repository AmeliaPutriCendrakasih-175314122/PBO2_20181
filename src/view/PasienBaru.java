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
        tglLahir.addItem(1);
        tglLahir.addItem(2);
        tglLahir.addItem(3);
        tglLahir.addItem(4);
        tglLahir.addItem(5);
        tglLahir.addItem(6);
        tglLahir.addItem(7);
        tglLahir.addItem(8);
        tglLahir.addItem(9);
        tglLahir.addItem(10);
        tglLahir.addItem(11);
        tglLahir.addItem(12);
        tglLahir.addItem(13);
        tglLahir.addItem(14);
        tglLahir.addItem(15);
        tglLahir.addItem(16);
        tglLahir.addItem(17);
        tglLahir.addItem(18);
        tglLahir.addItem(19);
        tglLahir.addItem(20);
        tglLahir.addItem(21);
        tglLahir.addItem(22);
        tglLahir.addItem(23);
        tglLahir.addItem(24);
        tglLahir.addItem(25);
        tglLahir.addItem(26);
        tglLahir.addItem(27);
        tglLahir.addItem(28);
        tglLahir.addItem(29);
        tglLahir.addItem(30);
        tglLahir.addItem(31);
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
        thnLahir.addItem(2018);
        thnLahir.addItem(2017);
        thnLahir.addItem(2016);
        thnLahir.addItem(2015);
        thnLahir.addItem(2014);
        thnLahir.addItem(2013);
        thnLahir.addItem(2012);
        thnLahir.addItem(2011);
        thnLahir.addItem(2010);
        thnLahir.addItem(2009);
        thnLahir.addItem(2008);
        thnLahir.addItem(2007);
        thnLahir.addItem(2006);
        thnLahir.addItem(2005);
        thnLahir.addItem(2004);
        thnLahir.addItem(2003);
        thnLahir.addItem(2002);
        thnLahir.addItem(2001);
        thnLahir.addItem(2000);
        thnLahir.addItem(1999);
        thnLahir.addItem(1998);
        thnLahir.addItem(1997);
        thnLahir.addItem(1996);
        thnLahir.addItem(1995);
        thnLahir.addItem(1994);
        thnLahir.addItem(1993);
        thnLahir.addItem(1992);
        thnLahir.addItem(1991);
        thnLahir.addItem(1990);
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

    


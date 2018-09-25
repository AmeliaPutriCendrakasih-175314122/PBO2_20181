/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testmodel;

import javax.swing.JFrame;
import view.FrameUtama;

/**
 *
 * @author CX
 */
public class TestFrame {
    public static void main(String[] args) {
        FrameUtama MF=new FrameUtama();
        MF.setTitle("Form Klinik");
        MF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MF.setSize(550, 300);
        MF.setVisible(true);
    }
}

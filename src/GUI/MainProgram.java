/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Kiet
 */
public class MainProgram extends JFrame {
    public MainProgram() {
        KhoiTao();
    }
    
    private void KhoiTao() {
        this.setSize(new Dimension(1400, 800));
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout(0, 0));
        this.setTitle("HỆ THỐNG QUẢN LÝ BÁN MÁY TÍNH");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

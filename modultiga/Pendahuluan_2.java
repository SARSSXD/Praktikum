/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modultiga;

import javax.swing.JOptionPane;

/**
 *
 * @author SARSSXD
 */
public class Pendahuluan_2 {

    public static void main(String[] args) {

        String nama = "", umur = "";
        nama = JOptionPane.showInputDialog("Nama kamu");
        umur = JOptionPane.showInputDialog("Umur kamu");

        String msg = "Nama kamu adalah " + nama + "\nBerumur " + umur;
        JOptionPane.showMessageDialog(null, msg);
    }
}

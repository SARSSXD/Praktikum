/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_7;

import javax.swing.JOptionPane;

/**
 *
 * @author SARSSXD
 */
public class Pendahuluan_3 {

    public static void main(String[] args) {

        try {
            int usia = Integer.parseInt(JOptionPane.showInputDialog("Berapa usia anda?"));
            System.out.println(usia);
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            System.out.println("Kode berhasil dijalankan");
        }
    }
}

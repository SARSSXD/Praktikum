/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modultiga;

import javax.swing.*;

public class Percobaan_4 {

    public static void main(String[] args) {
        int[] Nilai = new int[4];
        String[] Nama = {"Adi", "Budi", "Caca", "Deny"};

        for (int a = 0; a < Nilai.length; a++) {
            Nilai[a] = Integer.parseInt(JOptionPane.showInputDialog("masukkan Nilai " + Nama[a]));

            if (Nilai[a] >= 86 && Nilai[a] <= 100) {
                JOptionPane.showMessageDialog(null, "Nilai " + Nama[a] + "= A");
            } else if (Nilai[a] >= 76 && Nilai[a] <= 85) {
                JOptionPane.showMessageDialog(null, "Nilai " + Nama[a] + "= B+");
            } else if (Nilai[a] >= 66 && Nilai[a] <= 75) {
                JOptionPane.showMessageDialog(null, "Nilai " + Nama[a] + "= B");
            } else if (Nilai[a] >= 56 && Nilai[a] <= 65) {
                JOptionPane.showMessageDialog(null, "Nilai " + Nama[a] + "= C+");
            } else if (Nilai[a] >= 46 && Nilai[a] <= 55) {
                JOptionPane.showMessageDialog(null, "Nilai " + Nama[a] + "= C");
            } else if (Nilai[a] >= 36 && Nilai[a] <= 45) {
                JOptionPane.showMessageDialog(null, "Nilai " + Nama[a] + "= D");
            } else {
                JOptionPane.showMessageDialog(null, "Anda tidak lulus");
            }
        }
        int min = Nilai[0];
        int max = Nilai[0];

        for (int a = 0; a < Nilai.length; a++) {
            if (Nilai[a] < min) {
                min = Nilai[a];
            } else if (Nilai[a] > max) {
                max = Nilai[a];
            }
        }
        JOptionPane.showMessageDialog(null, "Nilai Terbesar = " + max);
        JOptionPane.showMessageDialog(null, "Nilai Terkecil = " + min);
    }
}

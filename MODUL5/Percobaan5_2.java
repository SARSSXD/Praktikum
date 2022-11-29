/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL5;

import javax.swing.*;

public class Percobaan5_2 {

    public static void main(String[] args) {

        int i, input = 0;
        int data[] = new int[3];
        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan element index ke " + a));
            System.out.println("index ke " + a + " adalah " + data[a]);
        }
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang ingin dicari : "));
        System.out.println(" ");

        for (i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                System.out.println(cari + "berada pada index" + i);
            }
        }
    }
}

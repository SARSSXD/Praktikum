/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL5;

import javax.swing.*;

public class NewClass2 {

    public static void main(String[] args) {

        int data[] = new int[10];

        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukan Element Index ke " + a));
            System.out.print("Index Ke" + a + " adalah " + data[a]);
        }
    }
}

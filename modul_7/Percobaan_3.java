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
public class Percobaan_3 {

    static int input(String a) {
        return Integer.parseInt(JOptionPane.showInputDialog(a));
    }

    public int LPersegi(int p, int l) {
        int luas = p * l;
        return luas;
    }

    public double Lsegitiga(int a, int t) {
        double luas = 0.5d * a * t;
        return luas;
    }

    public double LLingkaran(int r) {
        return Math.PI*Math.pow(r, 2);
    }

    public static void main(String[] args) {
        Percobaan_3 mt = new Percobaan_3();
        int p = input("Panjang Persegi");
        int l = input("Lebar Persegi");
        System.out.println("Luas Persegi = " + mt.LPersegi(p, l));

        int a = input("Alas Segitiga");
        int t = input("Tinggi Segitiga");
        System.out.println("Luas Segitiga = " + mt.Lsegitiga(a, t));

        int r = input("Jari-jari Lingkaran");
        System.out.println("Luas Lingkaran = " + mt.LLingkaran(r));
    }
}

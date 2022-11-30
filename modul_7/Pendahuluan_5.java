/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_7;

/**
 *
 * @author SARSSXD
 */
public class Pendahuluan_5 {

    static void PrintK(int sisi) {
        System.out.println("Keliling Persegi= " + Keliling(sisi));
    }

    static String PrintL(int sisi) {
        System.out.println("Luas Persegi= " + Luas(sisi));
        return null;
    }

    static int Keliling(int sisi) {
        return sisi * 4;
    }

    static double Luas(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        PrintL(5);
        PrintK(5);
    }

}

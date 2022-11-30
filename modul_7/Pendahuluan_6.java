/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_7;

/**
 *
 * @author SARSSXD
 */
public class Pendahuluan_6 {
int jumlahkaki=5;
    public static void main(String[] args) {
        int hasil = fakt(5);
        System.out.println(hasil);
    }

    public static Integer fakt(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fakt(n - 1);
        }
    }
}

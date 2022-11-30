/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_7;

/**
 *
 * @author SARSSXD
 */
public class Percobaan_2 {
//maksud dari sigma pada soal adalah perulangan x+(2i) sebanyak n kali dengan inisialisasi i=1
    static int sigma(int n, int x) {
        int y = 0;
        for (int i = 1; i <= n; i++) {
            y += x + (2 * i);
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Y = " + sigma(3, 2));
    }
}

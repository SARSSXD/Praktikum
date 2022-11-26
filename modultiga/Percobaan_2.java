/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modultiga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SARSSXD
 */
public class Percobaan_2 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int pertama = 0, kedua = 0, ketiga = 0;
        try {
            System.out.print("Masukkan Nilai Pertama = ");
            pertama = Integer.parseInt(reader.readLine());
            System.out.print("Masukkan Nilai Kedua = ");
            kedua = Integer.parseInt(reader.readLine());
            System.out.print("Masukkan Nilai Ketiga = ");
            ketiga = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {
            System.out.println("error");
        }
        System.out.println("Nilai yang dimasukkan = " + pertama + ", " + kedua + ", " + ketiga);

        int terbesar = 0, terkecil = 0, Bes, Kec;
        Bes = pertama > kedua ? pertama : kedua;
        terbesar = Bes > ketiga ? Bes : ketiga;

        Kec = pertama < kedua ? pertama : kedua;
        terkecil = Kec < ketiga ? Kec : ketiga;
        System.out.println("Nilai Terbesar Adalah = " + terbesar + "\nNilai Terkecil Adalah = " + terkecil);
    }
}

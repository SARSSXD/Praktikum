/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author LAB PROGRAMMING 1
 */
public class UAS_Kautsar {

    static String input(String a) {
        return a = JOptionPane.showInputDialog(a);
    }

    static String idenditas() {
        System.out.println("Nama\t: Kautsar Quraisy Al Hamidy");
        System.out.println("NIM\t: 220605110162");
        System.out.println("Kelas\t: L");
        System.out.println("==========================");
        System.out.println("====Sewa Mobil SARSSXD====");
        System.out.println("==========================");
        return null;
    }

    public static void main(String[] args) {
        idenditas();

        int n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Koleksi Mobil"));
        int jmlRent = 0;

        String[][] dataMobil = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("Mobil ke-" + (i + 1));
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    dataMobil[i][j] = input("Jenis Merk Mobil ke-" + (i + 1));
                    System.out.println("Jenis Mobil : " + dataMobil[i][j]);
                } else if (j == 1) {
                    dataMobil[i][j] = input("Tipe Mobil (Manual / Automatic) ke-" + (i + 1));
                    System.out.println("Tipe Mobil : " + dataMobil[i][j]);
                } else if (j == 2) {
                    dataMobil[i][j] = input("Harga Sewa Mobil ke-" + (i + 1));
                    System.out.println("Harga Sewa Mobil :" + dataMobil[i][j]);
                } else {
                    dataMobil[i][j] = input("Status Sewa (Ready / Rent)Mobil ke-" + (i + 1));
                    System.out.println("Status Sewa Mobil :" + dataMobil[i][j]);
                }
            }
            System.out.println("=========================");
        }
        String cari = input("Cari Mobil dengan Status(Rent/Ready)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if (cari.equals(dataMobil[i][j])) {
                    jmlRent++;
                }
            }
        }
        System.out.println("Jumlah Mobil Dengan Status Sewa Rent = " + jmlRent);

    }
}

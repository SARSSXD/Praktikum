package MODUL5;

import javax.swing.JOptionPane;

/**
 *
 * @author SARSSXD
 */
public class Percobaan_2 {

    public static void main(String[] args) {

        int data[] = new int[10];
        int max = data[0];
        int min = data[0];
        int indexmax = 0, indexmin = 0, tukar;
        double ratarata = 0.0;
        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.
                    showInputDialog("Masukan Element Index ke " + a));
            System.out.println("Index Ke-" + a + " adalah " + data[a]);
            if (data[a] > max) {
                max = data[a];
                indexmax = a;
            } else if (data[a] < min) {
                min = data[a];
                indexmin = a;
            }
        }

        for (int a = 0; a < data.length; a++) {
            ratarata += data[a];
        }
        ratarata /= data.length;

        System.out.println("Nilai Max= " + max + ", Index ke-" + indexmax);
        System.out.println("Nilai Min= " + min + ", Index ke-" + indexmin);
        System.out.println("Nilai Rata-rata= " + ratarata);
        System.out.println("~~~~~~~Tukar Nilai~~~~~~~");

        int cari = Integer.parseInt(JOptionPane.showInputDialog("Cari Nilai Array "));
        for (int a = 0; a < data.length; a++) {
            if (data[a] == cari) {
                System.out.println(cari + " Ketemu Pada Index " + a);
            }
        }

        tukar = Integer.parseInt(JOptionPane.showInputDialog("Ganti Nilai " + cari + " Dengan?"));
        System.out.println("Array data setelah tukar nilai ");
        for (int a = 0; a < data.length; a++) {
            if (data[a] == cari) {
                data[a] = tukar;
            }
            System.out.println("Index Ke " + a + " = " + data[a]);
        }
    }
}

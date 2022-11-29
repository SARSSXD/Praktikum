package MODUL5;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author SARSSXD
 */
public class Percobaan_3 {

    public static void main(String[] args) {

        int jml = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah data!"));               //a. input jumlah element array 1 dimensi
        int data[] = new int[jml];
        int max = data[0], min = data[0];
        int indexmax = 0, indexmin = 0, jmlganjil = 0;
        double rata2 = 0.0;

        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukan Element Index ke " + a));   // b. input nilai element
            System.out.println("Index Ke-" + a + " adalah " + data[a]);
            if (data[a] > max) {
                max = data[a];
                indexmax = a;
            } else if (data[a] < min) {
                min = data[a];
                indexmin = a;
            }
        }

        for (int a = 0; a < data.length; a++) {                                 //langkah untuk e.
            if (data[a] % 2 == 1) {
                jmlganjil += data[a];
            }
        }

        for (int a = 0; a < data.length; a++) {
            rata2 += data[a];
        }
        rata2 /= data.length;

        System.out.println("Nilai Max= " + max + ", Index ke-" + indexmax);     //c. tampilkan maksimal + posisi index
        System.out.println("Nilai Min= " + min + ", Index ke-" + indexmin);     //c. tampilkan minimal + posisi index
        System.out.println("Nilai Rata-rata= " + rata2);                        //d. jumlah semua element + rata-rata
        System.out.println("Jumlah element berindex ganjil= " + jmlganjil);     //e. jumlahkan semua index yang ganjil
        if (jmlganjil % 2 == 1) {                                               //f. hasil penjumlahan langkah e. + ganjil atau genap
            System.out.println("jumlah index ganjil bernilai ganjil");
        } else {
            System.out.println("jumlah index ganjil bernilai genap");
        }
        Arrays.sort(data);                                                      //g. mengurutkan array
        System.out.println("Element Array urut" + Arrays.toString(data));
    }
}

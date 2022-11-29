package modul_6;

import javax.swing.JOptionPane;

/**
 *
 * @author SARSSXD
 */
public class percobaan4 {

    public static void main(String[] args) {
        int matriks1[][] = {{2, 9}, {1, 5}};
        int matriks2[][] = {{5, 17}, {10, 4}};
        //hasil untuk menjumlahkan kedua array
        int hasil1[][] = new int[2][2];
        int hasil2[][] = new int[2][2];
        //menampilkan isi matriks A
        System.out.println("Matrik A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriks1[i][j] + " ");
            }
            System.out.println();
        }
        //menampilkan isi matriks B
        System.out.println("\nMatriks B ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriks2[i][j] + " ");
            }
            System.out.println();
        }
        //mencari indeks lokasi dari angka yang diinputkan

        String masukkan = JOptionPane.showInputDialog("Masukkan angka yang akan dicari indeksnya");
        int masukkan_a = Integer.parseInt(masukkan);
//menggunakan 'false'agar ketika angka yang dimasukkan bukan anggota dari makriks A 
//akan kaluar output "angka tidak ada didalam Array"
        boolean benar = false;
//output jika angka yang dimasukkan anggota matriks A
        for (int baris = 0; baris < matriks1.length; baris++) {
            for (int kolom = 0; kolom < matriks1.length; kolom++) {
                if (matriks1[baris][kolom] == masukkan_a) {
                    String keluaran = "Angka   = " + masukkan + "\n Pada baris = " + baris + "\n Kolom = " + kolom;
                    JOptionPane.showMessageDialog(null, keluaran);
                    benar = true;
                }//matriks yang dicari hanya dari anggota matriks A 
            }//menampilkan lokasi dari angka 9
        }
//output jika angka yang dimasukkan bukan anggota matriks A
        if (benar == false) {
            String tidak_ada = "Angka tidak ada di dalam Matriks A";
            JOptionPane.showMessageDialog(null, tidak_ada);
        }
        //menjumlahkan kedua matriks
        System.out.println("\nHasil penjumlahan Matriks");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil1[i][j] = matriks1[i][j] + matriks2[i][j];
                System.out.print(hasil1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nHasil perkalian Matriks");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil2[i][j] = matriks1[i][j] * matriks2[i][j];
                System.out.print(hasil2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

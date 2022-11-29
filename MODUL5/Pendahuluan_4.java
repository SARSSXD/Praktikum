package MODUL5;

import javax.swing.JOptionPane;

/**
 *
 * @author SARSSXD
 */
public class Pendahuluan_4 {

    public static void main(String[] args) {
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angkanya : "));
        int data[] = {4, 6, 4, 2, 8, 4, 2, 11};
        for (int i = 0; i < data.length; i++) {
            if (cari == data[i]) {
                System.out.println("index ke-" + i);
            }
        }
    }
}


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SARSSXD
 */
public class ProgramStar {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Yang Anda Inginkan : "));

        //KWOTAK PALING
        for (int j = 0; j < n + 3; j++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            System.out.print("*");

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for (int j = 0; j < n + 3; j++) {
            System.out.print("*");
        }
        System.out.println("\n");

        //macem-macem segitiga
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }

            for (int k = n; k >= i; k--) {
                System.out.print("2");
            }

            for (int l = n; l >= i; l--) {
                System.out.print("3");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("4");
            }
            System.out.println();
        }

        //Belah ketupat
        System.out.println();
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Huruf N
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
    }
}


import javax.swing.JOptionPane;

/**
 *
 * @author SARSSXD
 */
public class ProgramStar {

    public static void main(String[] args) {
        int n = 5;//Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Yang Anda Inginkan : "));

        //punya Lana
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5 || i == 3 && j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
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

        //punya Arip
        System.out.println("*");
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("!");
            }
            System.out.print("*\n");
        }

        System.out.println("");

        //huruf T
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 && j >= 1 || j == 3 && i >= 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("");

        // Huruf N
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
        
        System.out.println("");
        //huruf D
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i >= 1 && j == 1) || ((i == 1 || i == 5) && j == 2) || ((i == 1 || i == 5) && j == 3) || ((i == 1 || i == 5) && j == 4) || ((i >= 2 && i <= 4) && j == 5) || ((i == 2 || i == 4) && j == 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

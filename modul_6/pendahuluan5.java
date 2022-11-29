package modul_6;

/**
 *
 * @author SARSSXD
 */
public class pendahuluan5 {

    public static void main(String[] args) {
        int data2[][] = {{4, 6, 4, 7, 8, 3, 2, 10}, {4, 6, 5, 4, 2, 8, 8, 2, 10}};
        System.out.print("For loop: ");
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                System.out.print(data2[i][j]);
            }
        }

        System.out.print("\nWhile loop: ");
        int baris = 0;
        while (baris < data2.length) {
            int kolom = 0;
            while (kolom < data2[baris].length) {
                System.out.print(data2[baris][kolom]);
                kolom++;
            }
            baris++;
        }

        System.out.print("\nDo While loop: ");
        int baris2 = 0;

        do {
            int kolom2 = 0;
            do {
                System.out.print(data2[baris2][kolom2]);
                kolom2++;
            } while (kolom2 < data2[baris2].length);
            baris2++;
        } while (baris2 < data2.length);
    }
}

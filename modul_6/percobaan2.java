package modul_6;

import javax.swing.JOptionPane;

/**
 *
 * @author SARSSXD
 */
public class percobaan2 {

    public static void main(String[] args) {
        int data2[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
//        for (int a = 0; a < data2.length; a++) {
//            for (int b = 0; b < data2[0].length; b++) {
//                System.out.print(data2[a][b] + " ");
//            }
//            System.out.print("\n");
//        }
//
//        System.out.println("a.\nWhile loop: ");
//        int kolom = 0;
//        while (kolom < data2.length) {
//            int baris = 0;
//            while (baris < data2[kolom].length) {
//                System.out.print(data2[kolom][baris] + " ");
//                baris++;
//            }
//            System.out.print("\n");
//            kolom++;
//        }
//
//        System.out.println("\nDo While loop: ");
//        int kolom2 = 0;
//
//        do {
//            int baris2 = 0;
//            do {
//                System.out.print(data2[kolom2][baris2] + " ");
//                baris2++;
//            } while (baris2 < data2[kolom2].length);
//            kolom2++;
//            System.out.print("\n");
//        } while (kolom2 < data2.length);
//
//        System.out.println("\nb.");
//        int lengthArr = 0;
//        int sumArr = 0;
//        for (int i = 0; i < data2.length; i++) {
//            for (int j = 0; j < data2[i].length; j++) {
//                sumArr += data2[i][j];
//                lengthArr++;
//            }
//        }
//
//        int rerata = sumArr / lengthArr;
//        System.out.println("Nilai reratanya : " + rerata);

        int input = Integer.parseInt(JOptionPane.showInputDialog("Massukan angka : "));
        int convert = Integer.parseInt(JOptionPane.showInputDialog("Massukan angka pengganti : "));
        System.out.println("\nc. Array setelah index-" + input + " ditukar dengan " + convert);

        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                if (data2[i][j] == input) {
                    data2[i][j] = convert;
                }
            }
        }
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                System.out.print(data2[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.print("\nd.");
        int genap =0;
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
               if(j%2==0) genap += data2[i][j];
            }
        }
        System.out.println("total dari index genap = "+genap);
    }
}

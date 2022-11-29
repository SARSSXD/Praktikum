/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_6;

/**
 *
 * @author SARSSXD
 */
public class percobaan3 {

    public static void main(String[] args) {
        String data[][] = {{"ABDUL", "085646668991", "Kediri"}, {"KUSNO", "085646668992", "Trenggalek"}, {"PONIRAN", "085646668999", "Bojonegoro"}};
        System.out.println("NAMA\tALAMAT\t\tTELEPON");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i][0] + "\t");
            System.out.print(data[i][2] + "\t");
            if (data[i][2].length() < 7) {
                System.out.print("\t");
            }
            System.out.print(data[i][1]);
            System.out.println();
        }
        System.out.println();
    }
}

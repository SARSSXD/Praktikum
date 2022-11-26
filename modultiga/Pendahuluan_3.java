/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modultiga;

/**
 *
 * @author Sarssxd
 */
public class Pendahuluan_3 {

    public static void main(String[] args) {
        int uang = 5000;

        int hargamieayam = 6000;
        if (hargamieayam > 5000) {
            System.out.println("mie ayam mahal");
        }

        int hargamiepangsit = 5000;
        if (hargamiepangsit == 4500) {
            System.out.println("Fix beli mie pangsit");
        } else {
            System.out.println("mie pangsit mahal");
        }

        int hargaindomie = 4000;
        if (hargaindomie == 3500) {
            System.out.println("beli mie aja kali yah");
        } else if (hargaindomie > 3500) {
            System.out.println("Indomie aja jg mahal");
        }

        int hargabakso = 5000;
        if (hargabakso < 5000) {
            System.out.println("Bakso Murah");
        } else if (hargabakso == 5000) {
            System.out.println("Bakso Biasa");
        } else {
            System.out.println("Bakso Mahal");
        }

        switch (uang) {
            case 5000:
                System.out.println("Beli bakso aja dehh");
                break;
            case 4000:
                System.out.println("gajadi beli dehh");
                break;
        }
    }
}


/**
 *
 * @author SARSSXD
 */
public class percobaan_2 {

    public static void main(String[] args) {

        int angka4 = 4;
        int pangkat3 = 3;
        int power1a = angka4;
        for (int i = 1; i < pangkat3; i++) {
            power1a *= angka4;
        }

        int angka5 = 5;
        int pangkat2 = 2;
        int power2a = angka5;
        for (int i = 1; i < pangkat2; i++) {
            power2a *= angka5;
        }

        int faktor5 = 5;
        for (int i = 5; i > 1; i--) {
            faktor5 *= i - 1;
        }

        int faktor4 = 4;
        for (int i = 4; i > 1; i--) {
            faktor4 *= i - 1;
        }

        int power1c = angka4;
        for (int i = 1; i < pangkat2; i++) {
            power1c *= angka4;
        }

        int pangkat1 = 1;
        int power2c = angka5;
        for (int i = 1; i < pangkat1; i++) {
            power2c *= angka5;
        }

        int hasilAkhirA = power1a + power2a;
        int hasilAkhirB = faktor5 + faktor4;
        int hasilAkhirC = (power1c + power2c) + 5 + power1c;
        System.out.println("a. 4^3+5^2 =" + hasilAkhirA);
        System.out.println("b. 5!+4! = " + hasilAkhirB);
        System.out.println("c. (4^2+5^1) / 5 + 4^2 = " + hasilAkhirC);
    }
}


/**
 *
 * @author SARSSXD
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percobaan_4 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input Nilai a = ");
        int a = 0, b = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {
        }
        if (a % 2 == 0) {
            System.out.println(a + " adalah bilangan genap");
        } else {
            System.out.println(a + " adalah bilangan ganjil");
        }

        System.out.print("Input Nilai b = ");
        try {
            b = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {
        }
        if (b % 2 == 0) {
            System.out.println(b + " adalah bilangan genap");
        } else {
            System.out.println(b + " adalah bilangan ganjil");
        }
        int hasil = a + b;
        System.out.println("a + b = " + hasil);
    }
}

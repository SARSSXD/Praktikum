
/**
 *
 * @author SARSSXD
 */
public class Faktorial {

    public static void main(String[] args) {
        // TODO code application logic here
        long batas = 4;
        long faktorial = 1;
        for (int i = 0; i <= batas; i++) {
            faktorial = 1;
            for (int faktor = 2; faktor <= i; faktor++) {
                faktorial *= faktor;
            }
            System.out.println(i + "!" + " adalah  " + faktorial);
        }
    }

}

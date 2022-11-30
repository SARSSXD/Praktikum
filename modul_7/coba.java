
package modul_7;

/**
 *
 * @author SARSSXD
 */
public class coba {
    static double vTabung(int diameter,int tinggi){
        int jari = diameter/2;
        return  Math.PI*Math.pow(jari, 2)*tinggi;
    }
    public static void main(String[] args) {
        inputconsole ic=new inputconsole();
        System.out.print("Diameter Tabung = ");
        int dTab = ic.readInt();
        System.out.print("Tinggi Tabung = ");
        int tTab = ic.readInt();
        System.out.println("Volume Tabung = "+vTabung(dTab, tTab));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_7;


/**
 *
 * @author SARSSXD
 */
public class Percobaan_1 {
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

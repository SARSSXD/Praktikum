/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_7;

/**
 *
 * @author SARSSXD
 */
public class segiempat {
    public void segiempat(int panjang, int lebar){
        double luas;
        double keliling;
        luas = panjang*lebar;
        System.out.println("--------------------");
        System.out.println("Panjang Segi Empat = "+panjang);
        System.out.println("Lebar Segi Emapt "+lebar);
        System.out.println("Luas Segi Empat = "+luas);
    }
    public static void main(String[] args) {
        segiempat sg = new segiempat();
        sg.segiempat(10, 5);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_7;

/**
 *
 * @author SARSSXD
 */
public class bacaKonsol2 {
    public static void main(String[] args) {
        System.out.print("data1 = ");
        inputconsole ic = new inputconsole();
        int data1 = ic.readInt();
        System.out.print("data2 = ");
        int data2 = ic.readInt();
        int data3 = data1+data2;
        System.out.println("data1 + data2 = "+data3);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modultiga;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SARSSXD
 */
public class Pendahuluan_4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input Nilai a = ");
        int a = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {
        }
        int b = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai B"));
        
        System.out.println("\nHasil penjumlahan a dan b adalah = "+(a+b));
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modultiga;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SARSSXD
 */
public class emmm {

    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try {
            input = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.print("panggil nama: ");
        System.out.println(input);
        switch(input){
            case "otong":
                System.out.println("saya otong dan Hadir boss");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir boss");
                break;
            default:
                System.out.println(input + " Tidak Hadir BOSS");
        }
        System.out.println("selesai program");
    }
}

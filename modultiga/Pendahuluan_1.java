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
public class Pendahuluan_1 {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader
        (new InputStreamReader(System.in));

        try {
            System.out.print("Nama : ");
            String nama = reader.readLine();
            System.out.print("Umur : ");
            String umur = reader.readLine();
            System.out.println("\nHasil");
            System.out.println("Namamu adalah " + nama + "\nberumur " + umur + " tahun");
        } catch (IOException ex) {
            System.out.println("Error");
        }

    }

}

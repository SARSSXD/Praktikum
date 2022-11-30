/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_7;

import java.io.*;
public class inputconsole {
    public static String readString() {
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String string =" ";
        try {
            string = bfr.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }return string;
    }
    public static int readInt() {
        return Integer.parseInt(readString());
    }
    public static double readDouble() {
        return Double.parseDouble(readString());
    }
    public static void main(String[] args) {
        readString();
    }
}
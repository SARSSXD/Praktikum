/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modultiga;

import javax.swing.JOptionPane;

/**
 *
 *
 * @author LAB PROGRAMMING 1
 */
public class jOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "";
        name = JOptionPane.showInputDialog("Hallo, Who u are?");
        String msg = "Hello " + name + "YEEEYYY Kamu BERHASIL";
        JOptionPane.showMessageDialog(null, msg);

    }
}

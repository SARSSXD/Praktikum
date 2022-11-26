/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_sarss;

/**
 *
 * @author SARSSXD
 */
public class GajiBersih extends Modul2_sarss {
    public static void main(String[] args){
        int gajikotor=1000000;
        double pajak=0.1;
        double potongan=pajak*gajikotor;
        double gajibersih=gajikotor-potongan;
        System.out.println(gajibersih);
    }
}

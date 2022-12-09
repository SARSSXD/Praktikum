/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2_sarss;


public class BiayaHaji extends Modul2_sarss {
    public static void main(String[] args){
        int biayahaji=50000000;
        int tabunganrumah=10000000;
        int tabunganonh=10000000;
        int kuranguang=biayahaji-tabunganrumah-tabunganonh;
        int cicilan=kuranguang/24;
        System.out.println(cicilan);
    }
}

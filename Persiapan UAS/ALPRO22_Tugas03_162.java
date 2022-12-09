/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ALPRO22_Tugas03_162;

/**
 *
 * @author SARSSXD
 */
public class ALPRO22_Tugas03_162 {

    public static void main(String[] args) {
        //dec
        int[] arr1 = {3, 6, 4, 2, 5, 1};
        int minIndex = 0;
        int temp = 0;

        //print keadaan awal
        System.out.println("=====SELECTION SORT=====");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " | ");
        }

        //sorting value array ascending
        for (int i = 0; i < arr1.length; i++) {
            minIndex = i;
            System.out.println("\n\n~~~~Looping ke-" + (i + 1) + "~~~~");
            for (int j = i + 1; j < arr1.length; j++) {
                System.out.print(arr1[minIndex] + "<" + arr1[j]);
                if (arr1[minIndex] < arr1[j]) {
                    minIndex = minIndex;
                } else {
                    minIndex = j;
                }
                System.out.print(", MIN = " + arr1[minIndex] + "\n");
            }
            //nilai MIN ditemukan
            System.out.println("value MIN = " + arr1[minIndex]);
            //swab index value min dgn value di index ke-i
            temp = arr1[i];
            arr1[i] = arr1[minIndex];
            arr1[minIndex] = temp;
            for (int k = 0; k < arr1.length; k++) {
                System.out.print(arr1[k] + " | ");
            }
        }

        System.out.println("\n\n=====BUBBLE SORT=====");
        //dec beserta init
        int[] arr2 = {6, 5, 4, 3, 2, 1};
        System.out.println("banyaknya elemen = " + arr2.length);

        System.out.println("\n");
        //print keadaan awal
        System.out.println("~~~~keadaan awal~~~~");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " | ");
        }

        System.out.println("\n\nCetak proses per looping");
        //sort ascending
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("\nLooping ke- " + (i + 1));
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    temp = arr2[j + 1];
                    arr2[j + 1] = arr2[j];
                    arr2[j] = temp;
                }
                for (int k = 0; k < arr2.length; k++) {
                    System.out.print(" | " + arr2[k]);
                }
                System.out.println(" ");
            }
        }
        System.out.println("\n=====DONE=====");
    }

}

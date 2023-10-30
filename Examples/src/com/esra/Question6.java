package com.esra;
import java.util.Scanner;
/*
Dışarıdan girilen bir sayının faktöriyelini hesaplayan program yazınız
 */

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı girin: ");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif sayıların faktöriyeli hesaplanamaz.");
        } else {
            long faktoriyel = 1;
            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
            }
            System.out.println(sayi + " sayısının faktöriyeli: " + faktoriyel);
        }

        System.out.print("Faktöriyelini hesaplamak istediğiniz bir sayı girin: ");
        int sayi1 = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif sayıların faktöriyeli hesaplanamaz.");
        } else {
            long faktoriyel = 1;
            int i = 1;

            while (i <= sayi) {
                faktoriyel *= i;
                i++;
            }

            System.out.println(sayi + " sayısının faktöriyeli: " + faktoriyel);
        }
    }
}

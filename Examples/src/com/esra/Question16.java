package com.esra;
/*
dışarıdan girilen bir sayının asal sayı olup olmadığını bulalım
asal ise asaldır çıktısı verelim asal değil ise asal değildir çıktısı verelim
 */

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        boolean asal = true;

        if (sayi <2) {
            asal = false;
        } else if (sayi == 2) {
            asal = true;
        } else if (sayi % 2 == 0) {
            asal = false;
        } else {
            for (int i = 3; i * i <= sayi; i += 2) {
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
        }

        if (asal) {
            System.out.println(sayi + " asaldır.");
        } else {
            System.out.println(sayi + " asal değildir.");
        }

    }
}

package com.esra;
/*
    1 den giridiğimiz sayıya kadar olan çift sayıların toplamını yazdıralım.
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi < 1) {
            System.out.println("Lütfen 1 veya daha büyük bir sayı girin.");
        } else {
            int toplam = 0;
            for (int i = 2; i <= sayi; i += 2) {
                toplam += i;
            }
            System.out.println("1'den " + sayi + "'e kadar olan çift sayıların toplamı: " + toplam);
        }
    }
}

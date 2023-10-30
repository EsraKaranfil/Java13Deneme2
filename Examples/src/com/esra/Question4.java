package com.esra;
    /*
    1 den girdiğimiz sayıya kadar olan sayıların toplamını yazdıran program
     */

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        scanner.close();

        if (sayi < 1) {
            System.out.println("Lütfen 1 veya daha büyük bir sayı girin.");
        } else {
            int toplam = 0;
            for (int i = 1; i <= sayi; i++) {
                toplam += i;
            }
            System.out.println("1'den " + sayi + "'e kadar olan sayıların toplamı: " + toplam);
        }

    }
}
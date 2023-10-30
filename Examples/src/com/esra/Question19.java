package com.esra;
/*
Girilen bir sayının 5 in kuvveti olup olmadığını bulalım
 */

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int us = 0;
        int sonuc = 1;

        while (sonuc < sayi) {
            us++;
            sonuc *= 5;
        }

        if (sonuc == sayi) {
            System.out.println("Girilen sayı 5'in " + us + ". kuvvetidir.");
        } else if (sayi==1) {
            System.out.println("Girilen sayı 5'in 0. kuvvetidir.");
        } else {
            System.out.println("Girilen sayı 5'in kuvveti değildir.");
        }

    }
}

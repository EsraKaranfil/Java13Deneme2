package com.esra.lesson005;
/*
dışarıdan girilen 0 ile 100 arasındaki(100 dahil)
5 adet sayıdan en büyük ve en küçük olanı bulup ekrana yazınız
 */

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enBuyuk = -1; // Başlangıçta en küçük değer atanır
        int enKucuk = 101; // Başlangıçta en büyük değer atanır

        for (int i = 1; i <= 5; i++) {
            System.out.print("Sayı " + i + " (0 ile 100 arasında): ");
            int sayi = scanner.nextInt();

            if (sayi < 0 || sayi > 100) {
                System.out.println("Geçersiz giriş! Lütfen 0 ile 100 arasında bir sayı girin.");
                i--; // Geçersiz girişi saymamak için sayaçı azaltılır
            } else {
                if (sayi > enBuyuk) {
                    enBuyuk = sayi; // Daha büyük bir sayı bulunduğunda güncellenir
                }
                if (sayi < enKucuk) {
                    enKucuk = sayi; // Daha küçük bir sayı bulunduğunda güncellenir
                }
            }
        }

        System.out.println("Girilen sayılar arasında en büyük: " + enBuyuk);
        System.out.println("Girilen sayılar arasında en küçük: " + enKucuk);

    }
}

package com.esra;
/*
klavyeden 0 girilinceye kadar sayı almaya devam edeceğiz
0 girildiğinde sayıların toplamı ve ortalamsını ekrana yazan uygulama
 */

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double toplam = 0.0;
        double sayac = 0.0;
        double girilenSayi;

        System.out.println("Sayıları girmeye başlayın (0 girerek işlemi sonlandırın).");

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            girilenSayi = scanner.nextDouble();

            if (girilenSayi == 0.0) {
                break;
            }

            toplam += girilenSayi;
            sayac++;
        }

        if (sayac == 0.0) {
            System.out.println("Hiç sayı girmediniz.");
        } else {
            double ortalama = toplam / sayac;
            System.out.println("Girilen sayıların toplamı: " + toplam);
            System.out.println("Girilen sayıların ortalaması: " + ortalama);
        }
    }
}

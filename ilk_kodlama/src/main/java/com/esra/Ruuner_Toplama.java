package com.esra;

import java.util.Scanner;

public class Ruuner_Toplama {
    public static void main(String[] args) {
        int sayi1;
        int sayi2;
        int toplam;
        System.out.println("1. sayıyı giriniz.....:");
        sayi1 = new Scanner(System.in).nextInt();
        System.out.println("2. sayıyı girin.....:");
        sayi2 = new Scanner(System.in).nextInt();
        toplam = sayi1 + sayi2;
        System.out.println("İki sayının toplamı.....:" + toplam);
        System.out.println("UYGULAMA BİTTİ");
    }
}

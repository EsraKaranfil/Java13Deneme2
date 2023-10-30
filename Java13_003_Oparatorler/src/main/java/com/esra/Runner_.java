package com.esra;

import java.util.Scanner;

public class Runner_ {
    public static void main(String[] args) {
        // iki adet int türde tam sayı değişkeni tanımlamak.
        int s1,s2;
        /**
         * Konsol ekranında kullanıcı bilgi girişi almak Scanner adı verilen sınıf kullanacağız.
         * Detaylarını sonra göreceğimiz kalıp kullanımları ile ilerliyoruz.
         * Tanım:
         * Scanner sc = new Scanner(System.in); // değişken oluşturmak ve nesne yaratma işlemi
         * sc.nextInt() -> tam sayı değişken değeri okumak
         * sc.nextLine() -> String türde değer okumak
         * sc.nextDouble() -> double türde değer okumak
         * .....
         */
        // Scanner selam_nasilsiniz_iyi_misiniz; // değişken tanımlama -> Data Type + Name
        Scanner sc = new Scanner(System.in); // değişken oluşturmak ve nesne yaratma işlemi
        System.out.println("1. sayıyı giriniz: ");
        s1 = sc.nextInt(); // konsol ekranında tam sayı değeri okumak
        System.out.println("2. sayıyı giriniz: ");
        s2 = sc.nextInt();
        int toplam = s1 + s2;
        System.out.println("iki sayının toplamı : " + toplam);
        //-----------------------------------------------------------------

        double d1,d2;

        System.out.println("ondalıklı olarak sayı 1 giriniz : ");
        d1 = sc.nextDouble();
        System.out.println("ondalıklı olarak sayı 2 giriniz : ");
        d2 = sc.nextDouble();
        double bolum = d1 / d2;
        System.out.println("iki sayının bölümü : " + bolum);
    }
}

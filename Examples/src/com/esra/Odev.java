package com.esra;
/*
    Girilen sayının basamakları toplamını ve
    kaç basamaklı olduğunu yazdıralım. do while ile
 */

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = sc.nextInt();
        int toplam = 0;
        int basamakSayisi = 0;

        if (sayi<0){ // negatif sayı girilirse pozitife çevirmek için
            sayi*=-1;
        }
        do{
            int basamak = sayi %10;
            toplam+= basamak;
            basamakSayisi++;
            sayi/=10;

        }while(sayi != 0);
        System.out.println("Basamakların toplamı: " + toplam);
        System.out.println("Basamak sayısı: " + basamakSayisi);
    }
}

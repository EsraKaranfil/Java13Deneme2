package com.esra;
/*
1. method, 2 sayıyı toplayan ve toplam sonucu bir int olarak tutan methodu yazınız
adı toplamaYap olsun
 */

public class Runner_Ornek1 {
    public static void main(String[] args) {
        System.out.println("Program Başladı >>>>>");
        ekranaYaz();
    }
    public static void toplamaYap(){
        int s1=3,s2=54;
        int toplam =s1+s2;
    }

    public static void ekranaYaz(){
        System.out.println("****************************");
        System.out.println("***** HESAP İŞLEMLERİ ******");
        System.out.println("****************************");
        System.out.println();
        System.out.println("1- Toplama");
        System.out.println("2- Çıkartma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.println("0- Ç I K I Ş");
    }

}

package com.esra;
import java.util.Scanner;
/*
Dışarıdan iki sayı alıp toplayalım ve daha sonra bu sayı çift ise
ekrana true değeri yazdıralım (if else kullanmadan)
 */

public class Ouestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi2=sc.nextInt();
        System.out.println("ikinci bir sayı giriniz:");
        int sayi1=sc.nextInt();
        sc.close();
        int toplam = (sayi1 + sayi2);
        boolean sayiCiftMi = (toplam%2==0);
        System.out.println("sayı çift mi? " + sayiCiftMi);

    }
}

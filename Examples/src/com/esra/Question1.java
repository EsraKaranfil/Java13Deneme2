package com.esra;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
        Bir ürün fiyatında %18 kdv %15 kar payı olduğunu biliyoruz
        bu ürünün son fiyatı elimizde olsun daha sonra bu ürün fiyatı üzerinden
        ürünün ham fiyatı ve kdvsiz fiyatını bulalım
         */
        double sonFiyat =100;
        double kdvOrani = 0.18;
        double karPayiOrani = 0.15;


        double kdv = (sonFiyat * kdvOrani);
        double karPayi = (sonFiyat * karPayiOrani);
        double hamFiyat = sonFiyat - (kdv + karPayi);
        double kdvsizFiyat = hamFiyat + karPayi;


        System.out.println("Ürünün Ham Fiyatı: " + hamFiyat + " TL");
        System.out.println("Ürünün KDV'siz Fiyatı: " + kdvsizFiyat + " TL");
        //System.out.println("kdv " +kdv);
        //System.out.println("kar payı " + karPayi);

        Scanner sc =new Scanner(System.in);
        System.out.println("Lütfen isim soyisim giriniz: ");
        String isim=sc.nextLine();
        String soyisim=sc.nextLine();
        System.out.println("isim=" +isim+" "+soyisim);
        System.out.println("Bir double değer giriniz:");
        double sayi1 = sc.nextDouble();
        System.out.println("bir int değer giriniz:");
        int sayi2=sc.nextInt();
        System.out.println(sayi1);
        System.out.println(sayi2);
        sc.nextLine();
        System.out.println("litfen bir ülke giriniz:");
        // nextInt nextDouble nextLong gibi sayısal değerlerden
        //sonra string bir değer alacaksak öncelikle boş bir
        //sc.nextLine komutu yazmamız gerekli
        String ulke=sc.nextLine();
        System.out.println("lütfen bir sayı giriniz:");
        long sayi3=sc.nextLong();
        sc.close();
        System.out.println(sayi3);
        System.out.println(ulke);


    }
}

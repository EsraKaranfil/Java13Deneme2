package com.esra;
/*
iki tane sayı değişkenimiz olsun
daha sonra dışarıdan bir işlem seçeceğiz(toplama bölme çıkarma ve çarpma(+,-,/,*))
seçilen işlemi yapıp sonucunu yazdıran algoritma
 */

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        int sayi1=sc.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int sayi2=sc.nextInt();
        System.out.println("Lütfen +,-,/,* işlemlerinden birini seçin:");
        String islem=sc.next();
        /*
        scanner.next() scanner.nextLine() arasındaki fark nextLine() tüm satırı alıyor
        next() metodu ise sadece boşluğa kadar olan tek bir kelimeyi alıyor
         */
        int sonuc =0;
        switch(islem){
            case "+":
                 sonuc = sayi1+sayi2;
                 break;
            case "-":
                sonuc = sayi1-sayi2;
                break;
            case "/":
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                }
                break;
            case "*":
                sonuc = sayi1*sayi2;
                break;
            default:
                System.out.println("Geçersiz işlem seçtiniz");
        }
        System.out.println("Sonuç: " + sonuc);
    }
}

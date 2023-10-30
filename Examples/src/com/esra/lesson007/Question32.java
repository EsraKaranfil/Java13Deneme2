package com.esra.lesson007;
/*
bir dizideki tüm sayıların toplamını bulalım ve her sayı için
bu sayı tektir veya bu sayı çifttir çıktısı verelim
 */

public class Question32 {
    public static void main(String[] args) {
        int[] sayilar = {1500, 120, 5, -256, 1296, -462, 159, 12};
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }

        System.out.println("Dizideki tüm sayıların toplamı: " + toplam);

        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                System.out.println(sayi + " çifttir.");
            } else {
                System.out.println(sayi + " tektir.");
            }
        }
    }
}

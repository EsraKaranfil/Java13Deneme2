package com.esra;
/*
dışarıdan girilen sayının mükemmel sayı olup olmadığını bulalım
mükemmel sayı kendisi hariç bölenlerinin toplamı kendisine eşit olan sayıdır
 */

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi= sc.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel bir sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel bir sayı değildir.");
        }

    }
}

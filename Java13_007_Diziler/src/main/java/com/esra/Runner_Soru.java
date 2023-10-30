package com.esra;

import java.util.Scanner;

public class Runner_Soru {
    public static void main(String[] args) {
        /**
         * kullanıcıdan girmek istediği sayı adedini alıp bu uzunlukta
         * bir dizi oluşturacaksın ve istenilen adette sayı girmesini
         * sağlayıp bu sayıları dizinin içine ekleyeceksiniz
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayı girmek istersiniz? ");
        int kacSayi = scanner.nextInt();

        int[] dizi = new int[kacSayi];

        for (int i = 0; i < kacSayi; i++) {
            System.out.print("Sayı girin: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.println("Girilen Sayılar:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(" "+dizi[i]);
        }
    }
}

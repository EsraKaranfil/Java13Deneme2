package com.esra.lesson007;
/*
öncelikle dışarıdan bir dizi uzunluğu alalım ve bir dizi tanımlayalım
o diziyi sırayla gezerek dolduralım ve daha sonrada bütün elemanları yazdıralım
 */

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi uzunluğunu girin: ");
        int uzunluk = scanner.nextInt();

        int[] dizi = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Dizi elemanını girin: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.println("Dizinin Elemanları:");
        for (int i = 0; i < uzunluk; i++) {
            System.out.println(dizi[i]);
        }
    }
}

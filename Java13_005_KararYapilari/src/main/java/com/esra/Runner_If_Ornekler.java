package com.esra;

import java.util.Scanner;

public class Runner_If_Ornekler {
    public static void main(String[] args) {
        /**
         * kullanıcıdan 2 sayı talep ediniz.. Bu sayıların büyük olanını yazınız.
         */
        int sayi1, sayi2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        sayi1 = sc.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        sayi2 = sc.nextInt();
        if (sayi1>sayi2) System.out.println(sayi1);
        else if(sayi1==sayi2) System.out.println("Sayılar birbirine eşittir");
        else System.out.println(sayi2);
    }
}

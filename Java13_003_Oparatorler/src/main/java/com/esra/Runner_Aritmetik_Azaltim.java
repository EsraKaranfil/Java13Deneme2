package com.esra;

public class Runner_Aritmetik_Azaltim {
    public static void main(String[] args) {

        int sayi = 10;
        sayi = sayi + 1;// 11
        sayi += 1; // 12
        /**
         * ++ , --
         */
        sayi++; //13
        System.out.println("sayi.....:" + sayi);
        sayi--; // 12
        System.out.println("sayi.....:"+ sayi);
        sayi--; sayi--; sayi--; // 9
        System.out.println("sayi....:" + sayi);
        /**
         * DİKKAT!!!!!
         * Eğer ++, -- operatörleri bir değişkenin sonuna gelir ise artma ve eksiltme işlemi
         * sonraki kullanımlarda geçerli olur. Sayının değeri o anda değişmez.
         * Eğer ++, -- operatöerleri bir değişkenin başına gelir ise artan yada eksiltme işlemi
         * o anda gerçekleşir. Sayının değeri o anda değişir.
         * Bu tanımları prefix ve suffix ( ön ek - son ek ) kullanımları denir.
         */
        int s1=6,s2=8,s3=-2, toplam;
        toplam = s1++ + ++s2 + s2++ + --s3 + ++s1 - --s2 + s3-- - --s1;
        System.out.println("s1:" +s1); // 7
        System.out.println("s2:" +s2); // 9
        System.out.println("s3:" +s3); // -4
        System.out.println("toplam:" +toplam);
        //s1 6 + s2 9 + s2 9 + s3 -3 + s1 8 - s2 9 + s3 -3 - s1 7
    }
}

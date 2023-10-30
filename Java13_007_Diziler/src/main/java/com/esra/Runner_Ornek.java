package com.esra;

public class Runner_Ornek {
    public static void main(String[] args) {
        /**
         * elimizde bir dizi sayılar bu sayılardan en büyük olanını
         * ve en küçük olanını nasıl bulurum?
         */
        int[] sayilar = {-2,33,333,2,0,23,-4332,32,1,5,98,7};
        int enBuyuk = sayilar[0];
        int enKucuk = sayilar[0];

        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
            }
            if (sayilar[i] < enKucuk) {
                enKucuk = sayilar[i];
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}

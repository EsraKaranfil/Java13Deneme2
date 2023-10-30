package com.esra.lesson007;
/*
bir dizideki max ve min değerleri ve en büyük ikinci değeri nul
int[] sayilar={0,120,5,85,-256,16,1258,240,81,14};
 */

public class Question35 {
    public static void main(String[] args) {
        //int[] sayilar = {-2,33,333,2,0,23,-4332,32,1,5,98,7};
        int [] sayilar={0,1,2,3};
        int enBuyuk = sayilar[0];
        int enKucuk = sayilar[0];
        int enBuyukIkinci = sayilar[0];

        for (int sayi : sayilar) {
            if (sayi > enBuyuk) {
                enBuyukIkinci = enBuyuk;
                enBuyuk = sayi;
            } else if (sayi > enBuyukIkinci && sayi != enBuyuk) {
                enBuyukIkinci = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("Dizideki en büyük değer: " + enBuyuk);
        System.out.println("Dizideki en küçük değer: " + enKucuk);
        System.out.println("Dizideki en büyük ikinci değer: " + enBuyukIkinci);

    }
}

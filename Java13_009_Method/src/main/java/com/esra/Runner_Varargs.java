package com.esra;

import java.util.Locale;

public class Runner_Varargs {
    public static void main(String[] args) {
        String[] adListesi = {"Muhammet Hoca","deniz burhan kaşıkçı","hakan tahtalı","belgin deniz koçak"};

        /**
         * foreach -> değişken türü değişken adı: liste
         */
        for (String ad: adlariDuzenle(adListesi))
            System.out.println(ad);

        int[] sayilar = {-213,-23,-1,-534,-4343,-9876,55,5412};
        System.out.println("en büyük sayı...:" +enBuyukSayiyiBul(sayilar));
        System.out.println(enBuyukSayiyiBulVarArgs(1,2,3,323,657,974));
    }

    /**
     * bir method da istenilen miktarda parametre yazabiliriz ancak,
     * o kadar parametre yazmak yerine dizi ile aynı türden parametreleri talep
     * edebilir ve kullanımı anlamlı bir hale getirebiliriz.
     */

    public static int toplam(int s1, int s2){
        int result = s1 + s2;
        return result;
    }

    public static int toplam(int s1, int s2, int s3){
        int result = s1 + s2 + s3;
        return result;
    }
    /**
     * .
     * .
     * .
     * .
     * .
     *
     */

    public static int enBuyukSayi(int s1, int s2, int s3, int s4, int s5, int s6, int s7){
        return 0;
    }

    public static int enBuyukSayiyiBul(int[] sayilar){
        int max = sayilar[0];
        for (int i=1; i<sayilar.length; i++){
            if (max<sayilar[i])
                max=sayilar[i];
        }
        return max;
    }
    /**
     * default durum: Muhammet HOCA
     * yanlış: muhammet hoca, Muhammet Hoca, MUHAMMET HOCA
     *
     */
    /**
     *
     * int... sayilar, DOĞRU
     * int sayilar... YANLIŞ
     * int ... sayilar DOĞRU
     * int ...sayilar DOĞRU
     */
    public static int enBuyukSayiyiBulVarArgs(int... sayilar){
        int max=0;
        return max;
    }

    public static String[] adlariDuzenle(String[] adlar){
        for (int i=0;i< adlar.length;i++){
            adlar[i]=adDuzenle(adlar[i]);
        }
        return adlar;
    }

    /**
     * int sayi =5;
     * int kare = sayi*sayi;
     * sayi = kare;
     *
     * sayi=sayi*sayi
     *
     */

    // ad = muhammet ali deniz Hoca -> Muhammet Ali Deniz HOCA
    // ad = muhammetAliDenizHoca

    public static String adDuzenle(String ad) {
        String[] adSoyad = ad.split(" ");//["Muhammet", "ali", "deniz", "Hoca"]
        String result = "";
        for (int i = 0; i < adSoyad.length; i++) {
            if (i == adSoyad.length - 1) { // dizinin son index indeyim
                result += " "+adSoyad[i].toUpperCase();
            } else {
                // [0,1)
                result += adSoyad[i].substring(0, 1).toUpperCase() + adSoyad[i].substring(1).toLowerCase()+" ";
            }
        }
        return result;

    }

}

package com.esra;

import java.util.Scanner;

public class Runner_Soru {
    /**
     * bir method istiyorum. bu method, iki adet string alacak[ifade,islemTuru]
     * işlem türleri;
     * 1- tümünü büyük harfe çevir
     * 2- tümünü küçük harfe çevir
     * 3- sadece baş harflerini büyük harfe çevir
     * method girilen ilk string ifade değişkenini istenilen işlem türüne
     * göre kodlayacak ve sonuç olarak istenileni verecek
     */

    public static void main(String[] args) {
        System.out.println("Lütfen ifadeyi giriniz:");
        String girilen_kelime = new Scanner(System.in).nextLine();
        System.out.println(yapilanIslem(girilen_kelime,"TümüBüyük"));
        System.out.println(yapilanIslem(girilen_kelime,"TümüKüçük"));
        System.out.println(yapilanIslem(girilen_kelime,"IlkHarfBüyük"));

    }

    public static String yapilanIslem(String ifade, String islemTuru) {
        String sonuc = "";
        switch (islemTuru){
            case "TümüBüyük":
                sonuc = ifade.toUpperCase();break;
            case "TümüKüçük":
                sonuc = ifade.toLowerCase();break;
            case "IlkHarfBüyük":
                String[] kelimeler = ifade.split(" ");
                for (String kelime : kelimeler) {
                    sonuc += kelime.substring(0, 1).toUpperCase() + kelime.substring(1).toLowerCase() + " ";
                }
                sonuc = sonuc.trim();sonuc = sonuc.trim();break;
            default:
                System.out.println("Geçerli bir seçim yapınız."); break;

        }

        return sonuc;
    }
}

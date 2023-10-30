package com.esra.lesson006;

public class Question28 {
    public static void main(String[] args) {
        /*
        String değerini karakterleri rakam ise toplayalım ve program sonunda toplam değerini yazdıralım
        değer ise bir string de toplayıp program sonunda çıktısını verelim.
         */
        String value ="125abc96xy8";
        int toplam = 0;
        String karakterler ="";
        for (int i = 0; i < value.length(); i++) {
            char karakter = value.charAt(i);
            if (Character.isDigit(karakter)) {
                int sayi = Character.getNumericValue(karakter);
                toplam += sayi;
            }else{
                karakterler+=karakter;
            }
        }

        System.out.println("Karakterler: "+ karakterler );
        System.out.println("String içindeki sayıların toplamı: " + toplam);

        toplam = 0;
        karakterler ="";
        for (int i = 0; i < value.length(); i++) {
            char karakter = value.charAt(i);
            if (karakter>48 && karakter<57) {
                int sayi = Character.getNumericValue(karakter);
                toplam += sayi;
            }else{
                karakterler+=karakter;
            }
        }

        System.out.println("Karakterler: "+ karakterler );
        System.out.println("String içindeki sayıların toplamı: " + toplam);

    }
}

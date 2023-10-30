package com.esra.lesson005;
/*



 */

public class Question25 {
    public static void main(String[] args) {
        String value ="1234";
        // value değişkeninin karakterinin
        // (sayısal değerlerinin) toplamını bulalım
        int toplam = 0;

        for (int i = 0; i < value.length(); i++) {
            char karakter = value.charAt(i);
            if (Character.isDigit(karakter)) {
                int sayi = Character.getNumericValue(karakter);
                toplam += sayi;
            }
        }

        System.out.println("String içindeki sayıların toplamı: " + toplam);

    }
}

package com.esra;

/**
 * 2- Kolay -> iki sayım var bunlardan biri 12 diğeri 54
 * bu iki sayının çarpımı nedir?
 */

public class Runner_Odev3 {
    public static void main(String[] args) {
        String ifade = "12 ve 54 ün çarpımı";

        String[] sayilar = ifade.split(" ");
        int carpim = 1;

        for (String parca : sayilar) {
            try {
                int sayi = Integer.parseInt(parca);
                carpim *= sayi;
                System.out.println("Çarpımı: " + String.format(String.valueOf(carpim)));

            } catch (NumberFormatException e) {
            }
        }
    }
}


package com.esra;

/**
 * 3- Zor -> iki sayının 4433 ile 57675 sayılarını toplamı nedir?
 */

public class Runner_Odev4 {
    public static void main(String[] args) {
        String ifade = "4433 ile 57675 sayılarını toplamı nedir?";

        String[] sayilar = ifade.split(" ");
        int toplam = 0;

        for (String parca : sayilar) {
            try {
                int sayi = Integer.parseInt(parca);
                toplam += sayi;
                System.out.println("Toplamı : " + String.format(String.valueOf(toplam)));

            } catch (NumberFormatException e) {
            }
        }

    }
}

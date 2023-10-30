package com.esra;

import java.util.Scanner;

public class Runner_Odev {
    public static void main(String[] args) {
        String ad = "ESRA";

        for (int i = 0; i < ad.length(); i++) {
            for (int j = ad.length() - i; j >= 0; j--)
                System.out.println(" ");
            for (int k = 0; k <= i; k++) {
                System.out.print("  " +ad.charAt(k) + " ");
            }
            System.out.println();
        }
        System.out.println();

        /**
         * ÖDEV:
         * bir metinde aranılan bir kelimenin rastlandığı tüm konumları listeleyen kodu yazınız.
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen aranan kelimeyi giriniz:");
        String metin = "Bu bir örnek metin ve metin içinde metinler bulunuyor.";
        String arananKelime = sc.nextLine();

        int index = metin.indexOf(arananKelime);
        while (index != -1) {
            System.out.println(arananKelime + " " + index + " konumunda bulundu.");
            index = metin.indexOf(arananKelime, index + 1);
        }

    }
}



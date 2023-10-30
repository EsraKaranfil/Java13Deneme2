package com.esra;

/**
 * 1- Kolay -> 5 ile 9 un toplamı nedir? -> 14
 *          * (sadece rakamlarla ifade edilen
 *          * (toplama,çıkartma(fark),çarpma,bölme)
 *          * köklerinin kullanıldığı bir string ifadeyi işleyen kodu yazınız.
 *          *
 */
import java.util.Scanner;
public class Runner_Odev2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        int toplam = 0;
        int farki = 0;
        int carpim = 1;
        double bolum = 1.0;


        if (metin.contains("toplamı")) {
            for (int i = 0; i < metin.length(); i++) {
                char karakter = metin.charAt(i);
                if (Character.isDigit(karakter)) {
                    int sayi = Character.getNumericValue(karakter);
                    toplam += sayi;
                }
            }
            System.out.println("Toplam: " + toplam);
        } else if (metin.contains("farkı")) {
            for (int i = 0; i < metin.length(); i++) {
                char karakter = metin.charAt(i);
                if (Character.isDigit(karakter)) {
                    int sayi = Character.getNumericValue(karakter);
                    farki -= sayi;
                }
            }
            System.out.println("Fark: " + farki);
        } else if (metin.contains("çarpımı")) {
            for (int i = 0; i < metin.length(); i++) {
                char karakter = metin.charAt(i);
                if (Character.isDigit(karakter)) {
                    int sayi = Character.getNumericValue(karakter);
                    carpim *= sayi;
                }
            }
            System.out.println("Çarpım: " + carpim);
        } else if (metin.contains("bölümü")) {
            for (int i = 0; i < metin.length(); i++) {
                char karakter = metin.charAt(i);
                if (Character.isDigit(karakter)) {
                    double sayi = Character.getNumericValue(karakter);
                    bolum /= sayi;
                }
            }
            System.out.println("Bölüm: " + bolum);
        } else {
            System.out.println("Geçersiz işlem veya ifade.");
        }

    }
        }






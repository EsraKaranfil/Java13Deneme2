package com.esra;

import java.util.Scanner;

public class Runner_Odev {
    public static void main(String[] args) {
        /**
         * bir öğretmen öğrencilerin listesini ve her ders için bir dizi
         * oluşturarak not ortalamalarını tutuyor. Buna göre öğrencilerin listesini ve
         * notlarını gösteren uygulamayı yazınız
         */
        /**
         * ÇIKTI bu şekilde olacak;
         * sseçiniz...: 4
         * Öğrenci Adı     /   Matematik Notu    /   Türkçe Notu
         * Ayşe                    40                    66
         * Deniz                   75                    85
         */

                Scanner scanner = new Scanner(System.in);
                String[] ogrenciAdlari = new String[100];
                int[] matematikNotlari = new int[100];
                int[] turkceNotlari = new int[100];
                int ogrenciSayisi = 0;

                System.out.println("***********************");
                System.out.println("*** OKUL OTOMASYONU ***");
                System.out.println("***********************");

                while (true) {
                    System.out.println("1- Öğrenci Tanımla");
                    System.out.println("2- Matematik Notu Girişi");
                    System.out.println("3- Türkçe Notu Girişi");
                    System.out.println("4- Öğrenci Notları");
                    System.out.println("0- Çıkış");
                    System.out.print("İşlemi seçiniz...: ");
                    int secim = scanner.nextInt();

                    switch (secim) {
                        case 1:
                            scanner.nextLine();
                            System.out.print("Öğrenci Adı: ");
                            ogrenciAdlari[ogrenciSayisi] = scanner.nextLine();
                            ogrenciSayisi++;
                            break;

                        case 2:
                            if (ogrenciSayisi == 0) {
                                System.out.println("Hiç öğrenci tanımlanmamış.");
                            } else {
                                for (int i = 0; i < ogrenciSayisi; i++) {
                                    System.out.print(ogrenciAdlari[i] + " için Matematik Notu: ");
                                    matematikNotlari[i] = scanner.nextInt();
                                }
                            }
                            break;

                        case 3:
                            if (ogrenciSayisi == 0) {
                                System.out.println("Hiç öğrenci tanımlanmamış.");
                            } else {
                                for (int i = 0; i < ogrenciSayisi; i++) {
                                    System.out.print(ogrenciAdlari[i] + " için Türkçe Notu: ");
                                    turkceNotlari[i] = scanner.nextInt();
                                }
                            }
                            break;

                        case 4:
                            if (ogrenciSayisi == 0) {
                                System.out.println("Hiç öğrenci tanımlanmamış.");
                            } else {
                                System.out.println("Öğrenci Adı / Matematik Notu / Türkçe Notu");
                                for (int i = 0; i < ogrenciSayisi; i++) {
                                    System.out.println(ogrenciAdlari[i] + " / " + matematikNotlari[i] + " / " + turkceNotlari[i]);
                                }
                            }
                            break;

                        case 0:
                            System.out.println("Çıkış yapılıyor...");
                            System.exit(0);

                        default:
                            System.out.println("Geçersiz işlem seçtiniz. Lütfen tekrar deneyin.");
                    }
                }
            }
        }




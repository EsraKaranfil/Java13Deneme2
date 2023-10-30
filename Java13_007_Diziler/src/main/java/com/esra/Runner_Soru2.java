package com.esra;

import java.util.Scanner;

public class Runner_Soru2 {
    public static void main(String[] args) {
        /**
         * bir öğretmen okuldaki öğrencilerinin isim listelerini
         * bir dizinin içine koymak ve istediği zaman onların listesini
         * çıkarmak istiyor. Buna göre;
         * 1- Şu şekilde bir ekran yazınız.
         * ********************************
         * 1-Öğrenci tanımla
         * 2-Öğrenci listesi göster
         * 0-Çıkış
         * işlemi seçiniz....:1
         * 2- Öğrenci tanımlama ekranında öğretmen kaç öğrenci tanımlamak
         * istediğini yazacak ve o kadar öğrenciyi tek tek adları ile girerek bir dizinin içine atacaksınız.
         * 3- Öğrenci listesini göster dediğinde ise bu öğrenci dizisini ekrana yazdıracak
         * Çıkış işleminde ise uygulama kapanacak
         */

        String[] ogrenciListesi;
        int secim;
        System.out.print("Kaç öğrenci tanımlamak istiyorsunuz? ");
        int ogrenciSayisi = new Scanner(System.in).nextInt();
        ogrenciListesi = new String[ogrenciSayisi];
        do {
            System.out.println("********************************");
            System.out.println("1-Öğrenci tanımla");
            System.out.println("2-Öğrenci listesi göster");
            System.out.println("0-Çıkış");
            System.out.print("İşlemi seçiniz....: ");
            secim = new Scanner(System.in).nextInt();
            switch (secim) {
                case 1:
                    for (int i = 0; i < ogrenciSayisi; i++) {
                        System.out.print("Öğrenci adı: ");
                        ogrenciListesi[i] = new Scanner(System.in).nextLine();
                    }break;
                case 2:
                    if (ogrenciListesi == null) {
                        System.out.println("Öğrenci tanımlanmamış.");
                    } else {
                        System.out.println("Öğrenci Listesi:");
                        for (int i = 0; i < ogrenciListesi.length; i++) {
                            System.out.println((i + 1) + "-" + ogrenciListesi[i]);
                        }
                    }break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
            }

        } while (secim != 0);
        System.out.println("UYGULAMA KAPANDI....");
    }
}

package com.esra;

import java.util.Scanner;

public class Runner_Ornekler_1 {
    public static void main(String[] args) {
        /**
         * Bir oyun alanına giriş yapabilmek için gerekli olan kurallar şöyledir;
         * çocukların yaşı 6 dan büyük 12 den küçük olmalıdır.
         * yaşı 4-6 arası olan çocukların boyları eğer 110 cm den uzunsa oyun alanına girebilirler.
         *
         */
        int y, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz: ");
        y = sc.nextInt();
        System.out.println("Boyunuzu giriniz: ");
        b = sc.nextInt();
        boolean girisYapabilirMi = (y>6 && y<12) || (( y<=6 && y> 4) && b>110);
        System.out.println("Giriş yapabilir mi? " + girisYapabilirMi);

        /**
         *
         * ÖDEV:
         *
         * bir e-ticaret sisteminde kullanıcının alış veriş işlemler ile ilgili şu bilgiler vardır.
         * kullanıcıların günlük sitede geçirdikleri süreler tutulmaktadır.
         * süresi 1 saatten az olanlar 1-5 saat arası olanlar ve 5 saatten fazla olanlar şeklindedir.
         * ayrıca kullanıcıların alışverişlerinde haftalık yaptıkları alışveriş sayılarıda önemlidir.
         * haftada en az 1 en fazla 10 alışveriş yapanlar gümüş, 10+ olanlar altın olarak değerlendirilir.
         *
         * bu bilgiler ışığında;
         * altın kullanıcıların 1 saatten fazla sistemde kaldıklarında %40 indirim diğer durumlarda %20 indirim
         * gümüş kullanıcıların 1 saatten fazla 5 saatten az sistemde kaldıklarında % 20 indirim diğer durumlarda % 10 indirim
         * diğer kullanıcıların 0-1 saat %1, 1-5 saat %5, 5+ saat % 10 indirim uygulanır.
         *
         * kişinin indirim miktarını bulan ilişkiyi yazınız.
         */

        }
    }

package com.esra;

/**
 *
 * ÖDEV:
 * Bir e-ticaret sisteminde kullanıcının alış veriş işlemler ile ilgili şu bilgiler vardır.
 * kullanıcıların günlük sitede geçirdikleri süreler tutulmaktadır.
 * süresi 1 saatten az olanlar 1-5 saat arası olanlar ve 5 saatten fazla olanlar şeklindedir.
 * ayrıca kullanıcıların alışverişlerinde haftalık yaptıkları alışveriş sayılarıda önemlidir.
 * haftada en az 1 en fazla 10 alışveriş yapanlar gümüş, 10+ olanlar altın olarak değerlendirilir.
 * Bu bilgiler ışığında;
 * altın kullanıcıların 1 saatten fazla sistemde kaldıklarında %40 indirim diğer durumlarda %20 indirim
 * gümüş kullanıcıların 1 saatten fazla 5 saatten az sistemde kaldıklarında % 20 indirim diğer durumlarda % 10 indirim
 * diğer kullanıcıların 0-1 saat %1, 1-5 saat %5, 5+ saat % 10 indirim uygulanır.
 * Kişinin indirim miktarını bulan ilişkiyi yazınız.
 */

public class IndirimHesaplama {
    public static double indirimHesaplama(int kullaniciSuresi, int haftalikAlisverisSayisi) {
        if (haftalikAlisverisSayisi >= 10) { // altın kullanıcı
            if (kullaniciSuresi > 1) {
                return 40.0;
            } else {
                return 20.0;
            }
        } else if (haftalikAlisverisSayisi >= 1) { // gümüş kullanıcı
            if (kullaniciSuresi > 1 && kullaniciSuresi < 5) {
                return 20.0;
            } else {
                return 10.0;
            }
        } else {
            if (kullaniciSuresi < 1) {
                return 1.0;
            } else if ( kullaniciSuresi < 5) {
                return 5.0;
            } else {
                return 10.0;
            }
        }

    }
    public static void main(String[] args) {
        int kullaniciSuresi = 4;
        int haftalikAlisverisSayisi = 12;

        double indirim = indirimHesaplama(kullaniciSuresi, haftalikAlisverisSayisi);

        System.out.println("Kullanıcıya uygulanacak indirim oranı: " + indirim + "%");
    }
}

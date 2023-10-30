package com.esra;

public class Runner_Tamsayı_Degiskenleri {
    public static void main(String[] args) {
        /**
         * Değişken Türleri Java için 2 ye ayrılır.
         * 1-Primitive DataType - İlkel Değişken Türleri
         * 1.1. Sayısal Değişken Türleri
         * 1.1.1. Tamsayı Değişken Türleri
         * 1.1.1.1. byte sayı türü -> 8 bit -> 2^8 = 256 adet değer alabilir.
         * 2 - Reference DataType - Referans Değişken Türleri
         *
         */
        /**
         * Değişken nasıl tanımlanır?
         * Syntax -> [ Data Type + Değişken Adı ] bir değişken tanımlar
         * DİKKAT!!!
         * Değişkenleri tanımlarken uyulması gereken kurallar vardır bazı kurallar gerekli değil fakat
         * doğru yazım için uyulması gereken kurallardır.
         */
        byte enKucukSayiDegiskeni;
        byte enkucuksayi;
        byte en_kucuk_sayi;
        byte PI;
        /**
         * Tanımlanmış Bir değişkene değer atama işlemi nasıl yapılır?
         * Syntax -> [değişkenin adı = atanılacak değer ] şeklinde yapılır.
         * Yeni tanımlanacak bir değişkene değer atama nasıl yapılır?
         * Syntax -> [Data Type + Name = Value ] şeklinde yapılır.
         *
         */
        //1
        enKucukSayiDegiskeni = 5;
        //2
        byte byte_sayi = 43;

        /**
         * Değişkenlerin değerleri nasıl yazdırılır? Kullanılmak istenildiğinde nasıl kullanılır?
         *
         */
        System.out.println("byte_sayısı değeri.......:" + byte_sayi);
        /**
         * Değişkeni aynı anda tanımlayabiliyor muyuz? Aynı anda değer atayabiliyor muyuz?
         */
        byte b_sayi1,b_sayi2,b_sayi3;
        /**
         * DİKKAT!!!
         * daha önceden değikne adı olarak tanımlanmış bir ifadeyi tekrar tanımlayamazsınız.
         */
        byte b_sayi4=3,b_sayi5=9,b_sayi6=12, toplam;
        toplam = (byte) (b_sayi5 + b_sayi4);
        /**
         * istisna!!!
         * Her dilin default olarak kabul ettiği değerler vardır. Bu nedenle işlemler bu default değerler
         * üzerinde işler. Bu nedenle uyumsuzluk yaşanır. Bunu aşmak i.in CAST işlemi yapılır sorun düzelir.
         */
        System.out.println("toplam.....: " + toplam);

        /**
         * Bir değişkenin sınırları ve sınırların aşılması durumunda bellekte ve ifadece oluşanlar.
         * byte ->2^8 = 256 adet değer alabilir.
         */
        byte min_byte=-128;
        byte max_byte = 127;

        byte b_deger = (byte) 159;
        System.out.println("b_deger...." + b_deger);

        byte bs1 = 34;
        System.out.println("bs1.......:" +bs1);
        bs1 = 98;
        System.out.println("bs1 .......:" + bs1);

        /**
         * short -> 2^16 = 65536 adet değer alabilir. -32768,.....0,.....3276
         */
        short min_short = -32768;
        short max_short = 32767;
        System.out.println("min_short.....:" + min_short);

        /**
         * (Integer) int -> 2^32 = 4294967296 adet değer alabilir. -21474883648,....0,.....21474883647
         * Her dilde default olarak tanımlanan değişken türleri vardır. int de Java için default olarak tanımlanan
         * değişken türüdür. Bu aslında şunu niteler, bir sayısal tam sayı işlemleri yaptığımızda java bunu int olarak algılar.
         *
         */
        byte yeni_toplam = 5 + 4;
        System.out.println("yeni_toplam......:" + yeni_toplam);
        short yeni_toplam1 = 5 + 4;
        System.out.println("yeni_toplam......:" + yeni_toplam1);
        int yeni_toplam2 = 5 + 4;
        System.out.println("yeni_toplam......:" + yeni_toplam2);
        /**
         * Burada işleme tabi tutulan değerler int olarak işlenir ve sonuçta int olarak dönülür.
         */
        System.out.println("yeni_toplam......:" + (4 + 5));

        /**
         * (Long) long -> 2^64 = 18,446,744,873,709,551,616 adet değer alabilir.
         * --> l, L
         */
        long l_deger_b = 5;
        long l_deger_s = 500;
        long l_deger_i = 5000000;
        long l_deger_l = 5000000000l;

        long uzun_sayi = 1000L * 50 * 100000 * 360 * 10;
        System.out.println("uzun_sayi.......:" + uzun_sayi);


        /**
         * Ondalıklı sayı türleri
         * float -> 2^32 = 4294967296 adet değer alabilir.
         * DİKKAT!!!!
         * java da ondalıklı değerler için kullanılan default değişken türü double dır.
         */
        float f_sayi = 590.54f;
        f_sayi = 54.34F;
        System.out.println("f_sayi......:" + f_sayi);

        /**
         * double -> 2^64 = 18,446,744,073,709,551,616 adet değer alabilir.
         */
        double d_sayi = 665484747487.65675679576576;
        d_sayi = 75657575.5646474;
        d_sayi = 84937493740.979374973;

        int sayi = (int)544444.98f;
        System.out.println("sayi.....:" + sayi);
        int t_sayi = 46;
        float f_sayi4 = t_sayi;

        /**
         * DİKKAT!!!!!
         * Kullanmakta olduğumuz tüm ilkel veri türlerinin kapsayıcı sınıfları bulunur ve
         * bunlar referans veri tipleridir. Tanımları ilkel veri tür adlarının
         * sınıf adı şeklinde kullanılır halleridir.
         */
        System.out.println("byte max değeri......:" + Byte.MAX_VALUE);
        Byte bb_sayi = 5;
        System.out.println("short max değeri.....:" + Short.MAX_VALUE);
        System.out.println("int max değeri.....:" + Integer.MAX_VALUE);
        System.out.println("long max değeri.....:" + Long.MAX_VALUE);
        System.out.println("double max değeri.....:" + Double.MAX_VALUE);

        /**
         * Karakter veri tipleri
         * char ->
         * A -> sayı olarak aşgılar. 0-1
         * ? -> sayı olarak algılar. 0-1
         */
        char karakter = 't';
        System.out.println("karakter.....:" + karakter);
        char sayisal_olarak_karakter = 116;
        System.out.println("sayısal olarak karakter......:" + sayisal_olarak_karakter);

        /**
         * String veri tipi
         * "" tırnak ile yazılantüm ifadeler String olarak tanımlanır. Javanın default tanımlarından biridir.
         */

        System.out.println("Esra");

        String ad = "Esra";
        System.out.println("ad.....:" + ad);

        /**
         * boolean veri tipi
         * ---> 1 bit tir. -> 0 veya 1 değeri alabilir.
         * -> true - False
         */
        boolean isiklar_acik_mi = true;
        System.out.println("isiklar_acik_mi?.......:" + isiklar_acik_mi);

        boolean isActive = true; // 1 kutu

        String aktifMi1 = "evet"; // 32 kutu

        byte aktifMidir = 1; // 8 kutu



    }
}

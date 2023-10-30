package com.bilgeadam.insankaynaklari;

/**
 * Java Class
 * - Sınıfların belli üyeleri olur ve bunlar;
 * -- inner class
 * -- property
 * -- methods
 * temel tanımlanan bileşenleridir.
 */

public class Islemler {
    /**
     * Örn: Kedi
     * Değişken
     * --- bir varlığı niteleyen özellikleri belirlemek için kullanabiliriz.
     * int ayakSayisi;
     * String tuyRengi;
     * int uzunluk;
     * String goz;
     * int yas;
     *
     * Method
     * bir varlığın yapabildiği tüm işlevsellikler için kullanırız.
     * public void uyu();
     * public String miyavla();
     * public void yemekYe();
     * public Tepki seslenmek(String seslenmeSekli);
     *
     */

    /**
     * Kullanıcının verdiği sayılarla işlemler yapılacak
     * temel işlemleri yerine getirecek.
     */
    /**
     * Bir değişkenin scope'u içinde bulunduğu {} parantezlerin
     * içidir. Yani tanımlandığı yer içinde her alandan
     * çağırım yapılabilir.
     * DİKKAT!!!!!!!
     * Kodlamalarda akış yukarıdan aşağıya doğrudur, döngü ve koşul
     * ifadeleri ile akış yön değiştirir. Ancak bir sınıf içinde tanımlanan
     * sınıf üyeleri birbirlerine ulaşabilirler. Burada öncelik sonralık
     * yoktur. Çünkü derleyici tarafından sınıf bir bütün olarak ele alınır.
     * DİKKAT!!!!!
     * Methodlar içinde tanımlanan değişkenler başlatılmak(initialize)
     * zorundadır. Ancak sınıf içinde tanımlanan değişkenler tanımlanmasalar
     * bile default değerler alırlar.
     * Primitive data typelar akım geçmediği için 0 değeri alırlar.
     * References Data Typelar NULL değer alırlar.(bu da genellikle hataya neden olur)
     *
     */
    public int s3, s4;

    public void islem(){
        int sayi=6,sayii=4;
        int bolum=sayi/sayii;

    }
    public int topla(){
        int toplam =s1+s2;
        return toplam;
    }
    public int topla(int sayi1, int sayi2) {
        /**
         * Methodlar içinde tanımlanan değişkenlere yerel değişken denilir.
         */
        int toplam = sayi2+sayi1;
        return toplam;
    }

    public int carp(int sayi3, int sayi4){
        int carpim =sayi3*sayi4;
        return carpim;
    }
    public int s1, s2;

}

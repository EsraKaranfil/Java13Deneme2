package com.esra;

import java.util.concurrent.atomic.AtomicReference;

public class Runner {
    public static void main(String[] args) {
        /**
         * {34,3424,23423,42} -> kullanıcı sıra no, sayılar, not
         * {"xcz","hjhk","lnln",} -> kullanıcı adları, günler, aylar
         * {true, false, false} -> hobileriniz? check box mantığı
         * .....
         * int sayi = 45;
         * bir array tanımlamak;
         * int[] sayilar;
         * int [] günler;
         * int aylar[];
         * bir diziye(array) değer nasıl atanır?
         * int[] sayilar =4;//yanlış
         * DİKKAT!!!!
         * bir dizinin kullanılabilmesi için öncelikle başlatılması(initalize) gereklidir.
         * bu işlem 2 şekilde yapılır;
         * int[] sayilar = new int[uzunluk];
         * int[] sayilar = {3,2,2,21,2} // burada girilen bilgiler kadar değerler atanır ve dizinin uzunluğu
         * atanan değerler kadar olup sabit kalır.
         */
        int sayi =5;
        int[] sayilar = new int[5];//{0,0,0,0,0} //{int,int,int,int,int}
        int[] gunler = {1,2,3,4,5,6,7};
        /**
         * DİKKAT!!!!
         * - başlatılmamış(initalize) bir dizinin değer ataması yapılamaz ve hata fırlatır.
         * - sınırları dışında diziye değer atamaya çalışmak hata fırlatır ()
         * - sınırları dışında bir dizinin değerlerini okumaya çalışmak hata fırlatır (ArrayIndexOutOfBoundsException)
         */
        /**
         * Dizinin içinde değer okumak
         */
        System.out.println("sayı...:" +sayi);
        System.out.println("günler(0)..:" + gunler[0]); // dizi[index]
        System.out.println("günler(1)..:" + gunler[1]);
            // index number.....0....n -> boyut-1
        //System.out.println("günler(7)..:" + gunler[7]);
        sayi = 45;
        gunler[4]=54;
        /**
         * neler dizi olarak tanımlanır?
         */
        int[] sayiDizisi;
        double[] ondalilkliDizi;
        boolean[] hobilerim;
        String[] ifadelerDizisi;
        Runner[] sinifDizisi;
    }
}
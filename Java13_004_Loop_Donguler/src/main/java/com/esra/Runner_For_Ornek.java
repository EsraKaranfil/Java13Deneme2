package com.esra;

public class Runner_For_Ornek {
    /**
     * 20 ile 50 arasındaki sayıları ekrana yazdıran programı yazınız.
     */
    public static void main(String[] args) {

        /**
         * 20 ile 50 arasındaki sayıları ekrana yazdıran programı yazınız.
         */

        for (int i = 20; i <= 50; i++) {
            System.out.println(i);
        }

        /**
         * 1 ile 65 arasındaki sayıların toplamını yazdıran programı yazınız
         */

        int toplam = 0;
        for (int i = 1; i <= 65; i++) {
            toplam += i;
        }
        System.out.println("1 ile 65 arasındaki sayıların toplamı: " + toplam);
        /**
         * 80 ile 32 arasındaki sayıları 80 den geriye gelerek ekrana yazdırın.
         */
        for (int i = 80; i >= 32; i--) {
            System.out.println(i);
        }
        int sayi = 80;
        while (sayi >= 32) {
            System.out.println(sayi);
            sayi--;
        }
        /**
         * 30 ile 99 arasındaki tek sayıları ekrana yazdıran programı yazınız
         */
        for (int i = 30; i <= 99; i++) {
            if (i % 2 == 1) { // Eğer i tek sayı ise
                System.out.println(i);
            }

        }
        /**
         * 120 ile 21 arasındaki 5 ve 5 in katı olan sayıların toplamlarını bulan kod yazınız
         */
        int toplam1 = 0;
        for (int i = 120; i >= 21; i -= 5) {
            toplam1 += i;
        }
        System.out.println("120 ile 21 arasındaki 5 ve 5'in katı olan sayıların toplamı: " + toplam);
        /**
         * 1. Genel yapılabilecek hatalar ve kıllanımlar.
         */
        for (int i=0;i<10;i++){
            System.out.println("bir kod satırı");
        }

    }

}
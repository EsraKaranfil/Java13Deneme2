package com.esra;

public class Ouestion15 {
    public static void main(String[] args) {
        /*
        1 den 100 e kadar (100 de dahil) olan çift sayıların toplamının
        tek sayıların toplamına oranını bulan program. çıktılar şu şekilde olacaktır;
        tek sayılar toplamı:
        çift sayolar toplamı:
        oran:
         */
        int tekToplam = 0;
        int ciftToplam = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                ciftToplam += i;
            } else {
                tekToplam += i;
            }
        }

        System.out.println("Tek sayılar toplamı: " + tekToplam);
        System.out.println("Çift sayılar toplamı: " + ciftToplam);

        double oran = (double) ciftToplam / tekToplam;
        System.out.println("Oran: " + oran);
    }
}

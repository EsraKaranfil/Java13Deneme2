package com.esra;
/*
    1 den başlayarak sırayla sayıları toplayalım. Toplamamız 50 den
    büyük olana kadar programımız çalışsın. Program sonunda toplamı
    ve programın kaç kere çalıştığını yazdıran program yapalım.
 */

public class Question7 {
    public static void main(String[] args) {
        int toplam = 0;
        int sayac = 0;

        while (toplam <= 50) {
            sayac++;
            toplam += sayac;
        }

        System.out.println("Toplam: " + toplam);
        System.out.println("Program " + sayac + " kere çalıştı.");

    }
}

package com.esra.lesson008;
/*
bir başlangıç ve bitiş değeri arasında ki sayılardan eğer sayi 3 ün katı
ise bilge 5 in katı ise adam hem 3 ün hem 5 in katı ise bilgeadam yazdıralım.
int start=2; int end=22;
çıktı [2,bilge,4,adam,bilge,7,8,bilge,adam,11,...,14,bilgeadam,...,22]
 */

public class Question39 {
    public static void main(String[] args) {
        int start = 2;
        int end = 22;

        String[] result = new String[end - start + 1];
        int sayac=0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[sayac] = "bilgeadam";
                sayac++;
            } else if (i % 3 == 0) {
                result[sayac] = "bilge";
                sayac++;
            } else if (i % 5 == 0) {
                result[sayac] = "adam";
                sayac++;
            } else {
                result[sayac] = String.valueOf(i);
                sayac++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");
        }
    }
}

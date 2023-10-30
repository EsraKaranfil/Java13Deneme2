package com.esra;

public class Runner_Varargs_Soru1 {
    public static void main(String[] args) {
        /**
         * Bir ifade içinde belirtilen index lerdeki karakterlerin listesini
         * dönen methodu yazınız.
         * ÖRN:
         * muhammet hoca java için önemli bir konu olan Class kavramını anlatacak,44,3,9
         * sonuc-> [C,a,h]
         */
        for (char karakter:karaklerListesi("muhammet hoca java için önemli bir konu olan Class kavramını anlatacak",5,3,9,35))
            System.out.println(karakter);
    }

    public static char[] karaklerListesi(String ifade, int... indexListesi){
        char[] karakterdizisi=new char[indexListesi.length];
        for (int i=0;i<indexListesi.length;i++){
            int indexnumber=indexListesi[i];
            char karakter= ifade.charAt(indexnumber);
            karakterdizisi[i]=karakter;
        }
        return karakterdizisi;
    }
}

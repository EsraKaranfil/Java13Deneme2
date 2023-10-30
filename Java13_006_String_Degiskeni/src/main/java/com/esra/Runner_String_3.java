package com.esra;

import java.util.Scanner;

public class Runner_String_3 {
    public static void main(String[] args) {
        /**
         * Bazen metinler içindeki yazıları değiştirmek isteyebiliriz. bunu yapmak için String sınıfı içinde
         * replace(oldStr, newStr) şeklinde kullanılan bir method vardır.
         * Ev kiralama -> Kontrat -> Ev sahibi ........ ile kiracı ......10.000tl kiraya anlaşmıştır.
         *
         * replace("ali","ahmet");
         * replace("a","A");
         * replace("t","₺");
         * replace("aş","Anonim Şirketi");
         * ÇOOOK DİKKAT!!!!!
         * String methodları tanımlı değişken üzerinde değişiklik yapmazlar bu nedenle işlem yaptıktan sonra
         * değişkeni değiştirmek için atama yapmak zorundasınız.
         */
        String kontrat = "Ev sahibi [EVSAHİBİ] ile kiracı (KİRACI) 10.000tl kiraya anlaşmıştır.";
        System.out.println("ev sahibi...: ");
        String evSahibi = new Scanner(System.in).nextLine();
        System.out.println("kiracı.....: ");
        String kiraci = new Scanner(System.in).nextLine();
        System.out.println(kontrat);
        System.out.println(
                kontrat.replace("[EVSAHİBİ]",evSahibi).replace("(KİRACI)", kiraci));
        kontrat= kontrat.replace("[EVSAHİBİ]",evSahibi).replace("(KİRACI)", kiraci);
        System.out.println(kontrat);

        /**
         * muhammet hoca cv.pdf -> muhammet_hoca_cv.pdf
         */
    }
}

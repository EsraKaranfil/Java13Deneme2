package com.esra;

import java.util.Scanner;

public class Runner_GorevOperatorleri_Ornek {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan alınan vize1, vize2 ve final notlarının ortlamalarını bulan programı yazınız.
         * v1 %23, v2 %28, f %49 şeklinde ağırlıklıdır.
         */

        Double v1, v2, f, ort;
        Scanner sc = new Scanner(System.in);
        System.out.println("vize1 notunu giriniz : ");
        v1 = sc.nextDouble();
        System.out.println("vize2 notunu giriniz : ");
        v2 = sc.nextDouble();
        System.out.println("final notunu giriniz : ");
        f = sc.nextDouble();
        ort = (v1*23)/100 + (v2*28)/100 + (f*49)/100;
        System.out.println("Sınav ortalamanız : " + ort);


    }
}

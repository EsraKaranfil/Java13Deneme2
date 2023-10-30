package com.esra;

import java.util.Scanner;

public class Ruuner_Logic_Ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v, f, ort;
        System.out.println("Vize notunu giriniz: ");
        v = sc.nextInt();
        System.out.println("Final notunu giriniz: ");
        f = sc.nextInt();
        ort = (v + f)/2;
        /**
         * öğrencinin notu 50 den büyük ise ve final notu 40 ve üzerinde ise geçer değilse kalır
         */
        if (ort>50 && f>=40) {
            ;
            System.out.println("öğrenci geçti");
        }
        else {
            System.out.println("öğrenci kaldı");
        }
    }
}

package com.esra;
/*
telefonkod mailkod başlangıç değerleri int olarak biz atayacağız
daha sonra dışarıdan bir tane telefon kodu alacağız
bir tane de mail için kod alacağız.
eğer telefonkodu hatalı ise tel kod hatalı çıktısı verelim
eğer mail kodu hatalı ise mail kodu hatalı çıktısı verelim

 */

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        int telefonKod = 12345;
        int mailKod = 67890;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Telefon kodunu giriniz: ");
        int girilenTelefonKod = scanner.nextInt();

        System.out.print("Mail kodunu giriniz: ");
        int girilenMailKod = scanner.nextInt();

        if (girilenTelefonKod != telefonKod && girilenMailKod != mailKod) {
            System.out.println("Telefon kodu ve Mail kodu hatalı.");
        } else if (girilenTelefonKod != telefonKod) {
            System.out.println("Telefon kodu hatalı.");
        } else if (girilenMailKod != mailKod) {
            System.out.println("Mail kodu hatalı.");
        } else {
            System.out.println("Her iki kod da doğru.");
        }
    }
}

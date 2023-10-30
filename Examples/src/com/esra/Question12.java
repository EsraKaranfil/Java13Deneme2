package com.esra;
/*

 */

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        int telefonKod = 12;
        int mailKod = 64;

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
            System.out.println("Sisteme kayıt oldunuz");
        }
    }
}

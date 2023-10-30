package com.esra;

import java.util.Scanner;

public class Runner_Odev5 {
    public static void main(String[] args) {
        int boyut = 5;
        int sayi;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Lütfen bir sayı girin (2, 4, 6, 8): ");
            sayi = scanner.nextInt();

            if (sayi == 2 || sayi == 4 || sayi == 6 || sayi == 8) {
                break;
            } else {
                System.out.println("Geçersiz giriş! Lütfen belirtilen sayılardan birini girin.");
            }
        }

        int yildizSatir = boyut/2;
        int yildizSutun = boyut/2;

        switch (sayi) {
            case 2:
                yildizSatir++;
                break;
            case 4:
                yildizSutun--;
                break;
            case 6:
                yildizSutun++;
                break;
            case 8:
                yildizSatir--;
                break;
        }

        for (int satir = 0; satir < boyut; satir++) {
            for (int sutun = 0; sutun < boyut; sutun++) {
                if (satir == yildizSatir && sutun == yildizSutun) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}

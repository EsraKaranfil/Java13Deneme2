package com.esra;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        boolean asal = true;

        if (sayi <2) {
            asal = false;
        } else if (sayi == 2) {
            asal = true;
        } else {
            for (int i = 2; i<= sayi/2; i++) {
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
        }

        if (asal) {
            System.out.println(sayi + " asaldır.");
        } else {
            System.out.println(sayi + " asal değildir.");
        }
    }
}

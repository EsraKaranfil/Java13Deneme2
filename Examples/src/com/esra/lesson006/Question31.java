package com.esra.lesson006;
/*
dışarıdan girilen kelimenin palindrom olup olmadığını
kontrol edelim.
 */

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        boolean palindrom = true;

        int baslangic = 0;
        int son = kelime.length() - 1;

        while (baslangic < son) {
            if (kelime.charAt(baslangic) != kelime.charAt(son)) {
                palindrom = false;
                break;
            }
            baslangic++;
            son--;
        }

        if (palindrom) {
            System.out.println(kelime + " bir palindrom kelime.");
        } else {
            System.out.println(kelime + " bir palindrom kelime değil.");
        }

    }
}

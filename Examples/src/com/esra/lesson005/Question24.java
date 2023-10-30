package com.esra.lesson005;
/*
dışarıdan bir kelime girelim bu kelime içerisinde
dışarıdan girdiğimiz harf kaç defa geçiyor bize sonucunu versin
 */

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz:");
        String kelime = sc.nextLine();
        System.out.print("Aranacak harfi girin: ");
        char harf = sc.next().charAt(0);
        int sayac=0;
        for (int i = 0; i < kelime.length(); i++){
            if (kelime.charAt(i) == harf) {
                sayac++;
            }

        }
        System.out.println("Girilen harf " + harf + ", kelime içinde " + sayac + " kez geçiyor.");

    }
}

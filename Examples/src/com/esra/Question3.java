package com.esra;

/*
    Dışarıdan bir isim ve bir doğum yılı alalım
    Mustafa 35 yaşında Ehliyet alabilir veya Mustafa 17 yaşında ehliyet alamaz
    ehliyet alma koşulumuz 18 yaşından büyük olma olsun (if else kullanmadan yapalım)
 */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String isim = scanner.nextLine();

        System.out.print("Doğum yılınızı girin: ");
        int dogumYili = scanner.nextInt();
        scanner.close();

        int yas = 2023 - dogumYili;

        String sonuc = (yas >= 18) ? "Ehliyet alabilir" : "Ehliyet alamaz";

        System.out.println(isim + " " + yas + " yaşında, " + sonuc);

    }
}

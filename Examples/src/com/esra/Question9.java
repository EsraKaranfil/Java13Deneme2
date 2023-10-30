package com.esra;
/*
dışarıdan bir taban değeri birde üs değeri alalım ve bu işlemin sonucunu bulan algoritma yazalım
 */

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taban, us, islem=1;
        System.out.println("Lütfen taban değerini giriniz:");
        taban = sc.nextInt();
        System.out.println("Lütfen üs değerini yazınız:");
        us = sc.nextInt();
        for(int i=0;i<us;i++){
            islem *= taban;
        }
        System.out.println(taban + "üzeri" + us + "=" + islem);
    }
}

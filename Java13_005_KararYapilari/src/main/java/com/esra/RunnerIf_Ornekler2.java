package com.esra;

import java.util.Scanner;

public class RunnerIf_Ornekler2 {
    public static void main(String[] args) {
        /**
         * gördüğünüz ifadeyi ekrana yazdıran kodu yazınız
         *
         *  * * * * *
         *  * * * * *
         *  * * * * *
         *  * * * * *
         *  * * * * *
         *  Ödev
         *  * * * * *
         *  *       *
         *  *       *
         *  *       *
         *  * * * * *
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır ve sütun sayısını girin: ");
        int sayi = scanner.nextInt();

        for (int i = 0; i < (sayi * sayi); i++) {
            if (i % sayi == 0 && i != 0) {
                System.out.println();
            }
            System.out.print("* ");
        }


    }
}

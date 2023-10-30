package com.esra.lesson008;
/*
1bile 10 arasındaki çarpım tablosunu çift boyutlu bir arrray ile yazdıralım
 */

public class Question41 {
    public static void main(String[] args) {
        int[][] carpimTablosu = new int[10][10];

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                carpimTablosu[i - 1][j - 1] = i * j;
            }
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + carpimTablosu[i - 1][j - 1] + "\t");
            }
            System.out.println();
        }
    }
}

package com.esra.lesson007;
/*
bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true
yazdırıp döngüyü sonlandıralım değilse false yazdıralım
int[] sayilar ={2,-256,16,1258,5,2}
 */

public class Question37 {
    public static void main(String[] args) {
        int[] sayilar = {2, -256, 16, 1258, 5, 2,};
        boolean ardArdaIki = false;

        for (int i = 0; i < sayilar.length - 1; i++) {
            if (sayilar[i] == 2 && sayilar[i + 1] == 2) {
                ardArdaIki = true;
                break;
            }
        }

        if (ardArdaIki) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

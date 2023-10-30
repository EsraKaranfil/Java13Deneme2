package com.esra;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ay, gun;
        System.out.println("Lütfen doğum gününüzü giriniz:");
        gun =sc.nextInt();
        System.out.println("Lütfen doğum ayınızı giriniz:");
        ay = sc.nextInt();

        if ((gun<=31 && gun>0) && (ay>0 && ay<=12)){
            if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
                System.out.println("Kova burcu");
            } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
                System.out.println("Balık burcu");
            } else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
                System.out.println("Koç burcu");
            } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
                System.out.println("Boğa burcu");
            } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
                System.out.println("İkizler burcu");
            } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
                System.out.println("Yengeç burcu");
            } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
                System.out.println("Aslan burcu");
            } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
                System.out.println("Başak burcu");
            } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
                System.out.println("Terazi burcu");
            } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
                System.out.println("Akrep burcu");
            } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
                System.out.println("Yay burcu");
            } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 19)) {
                System.out.println("Oğlak burcu");
            }
            } else {
            System.out.println("Yanlış tarih girdiniz. Lütfen geçerli bir tarih giriniz");
        }


    }

}

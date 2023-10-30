package com.esra;

import java.util.Scanner;

public class Runner_Switch_Case_Ornek {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("**** HESAP MAKİNESİ ****");
        System.out.println("************************");
        System.out.println();
        System.out.println("1- Toplama");
        System.out.println("2- Çıkartma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.println("5- Mod alma");
        System.out.println("0- ÇIKIŞ");
        System.out.println();
        System.out.println("*Lütfen seçiniz...:");
        int secim = new Scanner(System.in).nextInt();

        if (secim==1) System.out.println("Toplama yapıldı");
        else if (secim==2) System.out.println("Çıkartma yapıldı");
        else if (secim==3) System.out.println("Çarpma yapıldı");
        else if (secim==4) System.out.println("Bölme yapıldı");
        else if (secim==5) System.out.println("Mod alma yapıldı");
        else if (secim==0) System.out.println("Çıkış yapıldı");
        else System.out.println("Lütfen geçerli bir seçim yapınız.");

        switch (secim){
            case 1:
                System.out.println("Toplama yapıldı"); break;
            case 2:
                System.out.println("Çıkartma yapıldı");break;
            case 3:
                System.out.println("Çarpma yapıldı");break;
            case 4:
                System.out.println("Bölme yapıldı");break;
            case 5:
                System.out.println("Mod alma yapıldı");break;
            case 0:
                System.out.println("Çıkış yapıldı");break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız.");
        }



    }


}

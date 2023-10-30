package com.esra;
/*
Pizza boyut seçimi yapacağız.
bizim belirlemiş olduğumuz pizza boylarından birisi seçilecek
S girilirse küçük boy pizza seçtiniz
M girilirse orta boy pizza seçtiniz
L girilirse büyük boy pizza seçtiniz
XL girilirse ekstra büyük boy pizza seçtiniz çıktıı alınacak
bunlardan farklı bir değer girlirse yanlış seçim yaptınız çıktısı verilecek

 */

import java.util.Scanner;

public class Ouestion14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pizza boyutu seçimi yapın:");
        System.out.println("S - Küçük boy pizza");
        System.out.println("M - Orta boy pizza");
        System.out.println("L - Büyük boy pizza");
        System.out.println("XL - Ekstra büyük boy pizza");

        String secim;
        boolean kontrol=true;
        while(kontrol){
            kontrol=false;
            System.out.println("Lütfen bir pizza boyutu seçiniz");
            secim=scanner.nextLine();

        switch (secim) {
            case "S":
                System.out.println("Küçük boy pizza seçtiniz.");
                break;
            case "M":
                System.out.println("Orta boy pizza seçtiniz.");
                break;
            case "L":
                System.out.println("Büyük boy pizza seçtiniz.");
                break;
            case "XL":
                System.out.println("Ekstra büyük boy pizza seçtiniz.");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
                kontrol=true;
                break;
        }
        }
    }
}

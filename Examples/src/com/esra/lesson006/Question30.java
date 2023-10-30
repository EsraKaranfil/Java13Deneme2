package com.esra.lesson006;

import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("IBAN Değerini Girin: ");
        String iban = scanner.nextLine();
        // TR 500051 OTH 568997
        System.out.println(iban.indexOf(" "));
        String kontrol =iban.substring(0,iban.indexOf(" "));
        System.out.println(kontrol);
        String bankaNo=iban.substring(iban.length()-4);
        switch (kontrol){
            case "TR":
                System.out.println("yurt içi işlemler");
                switch (bankaNo){
                    case "5001":
                        System.out.println("Ziraat");
                    case "5002":
                        System.out.println("Garanti");
                    case "5003":
                        System.out.println("İş bankası");
                    default:
                        System.out.println("Diğer");
                }
                break;
            case "OTH":
                System.out.println("yurt dışı işlemler");
                switch (bankaNo){
                    case "2000":
                        System.out.println("Kıta içi işlemler");
                        System.out.println(iban.replace("OTH","Ki"));
                    default:
                        System.out.println("Kıta dışı işlemler");
                        System.out.println(iban.replace("OTH","Kd"));
                        break;
                }
                break;
            default:
                break;
        }

    }
}

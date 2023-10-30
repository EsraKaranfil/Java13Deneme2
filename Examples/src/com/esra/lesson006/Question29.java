package com.esra.lesson006;
/*
Dışarıdan bir iban değeri girelim TR1001005002 veya OTH 2002002000
gibi daha sonra bu değerleri kontrol edelim eğer TR ile başlıyorsa
yurt içi işlemler yazsın ve eğer 5001 ile bitiyorsa Ziraat, 5002 ile bitiyorsa Garanti,
5003 ile bitiyorsa İş Bankası yazdırsın. Eğer OTH ise yurtdışı işlemler
yazdırsın. 2000 ile bitiyorsa kıta içi işlemler ve OTH 2002002000 yerine
Ki 200200... eğer 2000 ile bitmiyorsa Kd 200201 yazdırsın
 */

import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("IBAN Değerini Girin: ");
        String iban = scanner.nextLine();

        if (iban.startsWith("TR")) {
            System.out.println("Yurt İçi İşlemler");
            if (iban.endsWith("5001")) {
                System.out.println("Ziraat");
            } else if (iban.endsWith("5002")) {
                System.out.println("Garanti");
            } else if (iban.endsWith("5003")) {
                System.out.println("İş Bankası");
            }else{
                System.out.println("Diğer");
            }
        } else if (iban.startsWith("OTH")) {
            System.out.println("Yurtdışı İşlemler");
            if (iban.endsWith("2000")) {
                System.out.println("Kıta İçi İşlemler");
                System.out.println(iban.replace("OTH","Ki"));
            } else {
                System.out.println("Kıta dışı İşlemler");
                System.out.println(iban.replace("OTH","Kd"));

            }
        } else {
            System.out.println("Geçersiz IBAN");
        }
    }
}

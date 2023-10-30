package com.esra.lesson007;

import java.util.Scanner;

/*
kullanıcıdan bir ülke ismi alacağız daha sonra bu ülke ismi eğer
arrayimizde varsa girdiğiniz ülke bulundu yoksa girdiğiniz ülke
bulunamadı çıktısı verelim
String[] dizi={"Türkiye","Japonya","Danimarka","Fransa"};


 */
public class Question34 {
    public static void main(String[] args) {
        String[] dizi = {"Türkiye", "Japonya", "Danimarka", "Fransa"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ülke ismi girin: ");
        String girilenUlke = scanner.nextLine();

        boolean ulkeBulundu = false;

        for (String ulke : dizi) {
            if (ulke.equals(girilenUlke)) {
                ulkeBulundu = true;
                break;
            }
        }

        if (ulkeBulundu) {
            System.out.println("Girdiğiniz ülke bulundu.");
        } else {
            System.out.println("Girdiğiniz ülke bulunamadı.");
        }
    }
}

package com.esra;

import java.util.Scanner;

public class Runner_Logic_Mantiksal_Operatorler {
    public static void main(String[] args) {

        /**
         *
         * VE -> &&
         * VEYA -> ||
         *
         * Bir e-ticaret sitesinde üyeliğimiz var burada işlem yapmak ürün satın almak istiyoruz.
         */
        String username= "esra";
        String password= "12345";
        String gu, gp;
        /**
         * bir kullanıcı doğrulama işleminde kural olarak hangi bilgilerin doğru olmasına gerek vardır?
         */

        /**Scanner sc = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz : ");
        gu = sc.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        gp = sc.nextLine(); */

        boolean girisYpabilirMi;
        girisYpabilirMi = username == "esra" && password == "12345";
        System.out.println("giriş yapabilir mi : " + girisYpabilirMi);


    }
}

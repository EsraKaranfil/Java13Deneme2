package com.esra;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        /**
         * String değişkeni,
         * Bildiğimiz gibi, iki tür  değişken bulunmakta idi;
         * 1-Primitive data type
         * 2-Referances data type
         * String değişkeni referans tipli bir değişkendir ve kendi bellek ynetimi vardır.
         * bu değişken türü bellek anlanının hem sıcak hemde heap alanını kullanır.
         * Bu nedenle sabit bir genişliği yoktur. içerisine eklenen değerle büyümektedir.
         */
        String ifade="esra";
        String musteriAdi="mert";
        String makale= "Bugün hava yağmurlu";
        String userName="muhammedali";
        /**
         * userName değerini 2 şekilde if ile kontrol ediniz.
         */
        if (userName=="muhammedali"){
        System.out.println("elle giriş testi...: giriş başarılı");
        }else{
            System.out.println("elle giriş testi...: giriş başarısız");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen username giriniz:");
        String okunandeger = sc.nextLine();
        if (userName.equals(okunandeger)){
            System.out.println("consoldan giriş testi...: giriş başarılı");
        }else{
            System.out.println("consoldan giriş testi...: giriş başarısız");
        }

    }
}

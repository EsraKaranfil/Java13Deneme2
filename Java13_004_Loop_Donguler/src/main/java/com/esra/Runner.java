package com.esra;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //System.out.println("Muhammet HOCA");
        //int tekrar = new Scanner(System.in).nextInt();
        /**
         * for loop -> for döngüsü ile kadun akışını değiştirebilir
         * belli kod bloklarının tekrar etmesini sağlayabiliriz.
         * SYNTAX:
         * for(int i=0; i<5;i++){
         * //kod bloğu
         * }
         * for döngüsünde kural doğru olduğu sürece kod bloğundaki kodlar
         * çalıştırılmaya devam eder
         */

        //for(int sayaç=1;sayaç<=10;sayaç++){
           // System.out.println("Muhammet HOCA");
        //}
        //System.out.println("Program sonlandırıldı.");

        /**
         *
         * parantezlerin içi doğru olduğu sürece döngü devam eder.
         * while(true){
         *  //kod
         *  }
         */
        int sayi=0;
        while (sayi<5){
            System.out.println("sayi.....:" + sayi);
            sayi++;
        }
        for (int sayi1=0;sayi1<5;sayi1++){
            System.out.println("sayi...:" + sayi1);
        }

        /**
         * SYNTAX:
         * do{
         *  //kod
         *  }while(true);
         *  while parantez içi doğru olduğu sürece döngü devam eder, ancak dikkat edileceği üzere
         *  durumun incelenmesi kod bloğunun çalışmasında sonra gerçekleşir.
         */
        System.out.println("While loop");
        int s=5;
        while(s<5){
            s++;
            System.out.println(s);
        }
        System.out.println("do while loop");
        int s1=5;
        do{
            s++;
            System.out.println(s1);
        }while (s1<5);
    }
}

package com.esra;

import java.util.Scanner;

public class Runner_String_2 {
    public static void main(String[] args) {
        String ifade;
        int index ;
        do {
            System.out.println("Kullanıcı adı....: ");
            ifade = new Scanner(System.in).nextLine();
            index = ifade.indexOf(" ");

            if (index != -1) {
                System.out.println("Kullanıcı adında boşluk kullanmayın");
            }
        }while(index!=-1);


    }//main sonu
}//class sonu

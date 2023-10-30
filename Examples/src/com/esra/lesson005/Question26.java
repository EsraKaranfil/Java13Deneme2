package com.esra.lesson005;
//dışarıdan bir metin girelim daha sonra tersini yazdıralım


import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kelimeyi girin:");
        String kelime = sc.nextLine();
        for (int i=kelime.length()-1;i>=0;i--){
            System.out.print(kelime.charAt(i));
        }
    }
}

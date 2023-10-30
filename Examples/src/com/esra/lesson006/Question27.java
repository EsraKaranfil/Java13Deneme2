package com.esra.lesson006;

public class Question27 {
    public static void main(String[] args) {
        /*
        bu string değeri virgüllerden ayırın ve her kelimeyi alt alta yazdır
         */
        String kelime = "Java,React,Css,Html";

        int baslangic = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == ',') {
                String altKelime = kelime.substring(baslangic, i);
                System.out.println(altKelime);
                baslangic = i + 1;
            }
        }
        String sonKelime = kelime.substring(baslangic);
        System.out.println(sonKelime);

        //diğer çözüm
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == ',') {
                System.out.println();
            }else{
                System.out.print(kelime.charAt(i));
            }
        }
        //diğer çözüm
        System.out.println(kelime.replace(",","\n"));

        //diğer çözüm
        for (int i=0; i<kelime.length();i++){
            int loc1 =kelime.indexOf(",");
            if (loc1!=-1){
                System.out.println(kelime.substring(0,loc1));
                kelime = kelime.substring(loc1+1);
            }
        }
        System.out.println(kelime);
        kelime = "Java,React,Css,Html";

    }
}


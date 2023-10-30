package com.esra.lesson007;


public class Odev3 {
    public static void main(String[] args) {
        String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
                + "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya;100-Erdemit";

        String[] sehirBilgileri = sehirler.split(";");

        for (int i=0; i< sehirBilgileri.length;i++) {
            int index=sehirBilgileri[i].indexOf("-");
            System.out.println(sehirBilgileri[i].substring(index+1)+"adlı şehrin plaka kodu :"+ sehirBilgileri[i].substring(0,index));

        }
    }

}

package com.esra;

public class Runner_Ornek_004_MultiParam {
    public static void main(String[] args) {
        System.out.println(islemYap(4,8,"toplama"));
        System.out.println(islemYap(4,8,"çarpma"));

    }

    public static int islemYap(int s1,int s2, String islemTuru){
        int sonuc;
        switch (islemTuru){
            case "toplama": sonuc=s1+s2;break;
            case "çıkartma": sonuc=s1-s2;break;
            case "çarpma": sonuc=s1*s2;break;
            case "bölme": sonuc=s1/s2;break;
            default:sonuc=0;break;
        }
        return sonuc;
    }
}

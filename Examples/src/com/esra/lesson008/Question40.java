package com.esra.lesson008;
/*

 - Türkçe karakterleri inglizce karakterler çevirme
'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'
dışarıdan bir kelime alacagız bu kelime içerisinde geçen türkçe
karakterleri ing karakterlere dönüştüreceğiz ;
*
*/

public class Question40 {
    public static void main(String[] args) {
        String kelime="Maç";
        char[] turkceKarakterler = {'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'};
        char[] ingilizceKarakterler = {'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O'};

        char[] kelimeKarakterleri = kelime.toCharArray();

        for (int i = 0; i < kelimeKarakterleri.length; i++) {
            for (int j = 0; j < turkceKarakterler.length; j++) {
                if (kelimeKarakterleri[i] == turkceKarakterler[j]) {
                    kelimeKarakterleri[i] = ingilizceKarakterler[j];
                    break;
                }
            }
        }

        String cevrilmisKelime = new String(kelimeKarakterleri);
        System.out.println("Dönüştürülmüş kelime: " + cevrilmisKelime);

    }
}

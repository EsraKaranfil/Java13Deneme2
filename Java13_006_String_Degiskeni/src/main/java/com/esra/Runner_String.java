package com.esra;

import java.util.Locale;
import java.util.Scanner;

public class Runner_String {
    public static void main(String[] args) {
        /**
         * Klavye -> A-> 65-> Monitör-> A
         * char
         */
        char karakter= 'A';
        System.out.println(karakter);
        System.out.println((int)karakter);
        String ifade= "Bugün hava yağmurlu"; // String bir karakterler dizisidirç{'b','u','g',.....}

        /**
         * length -> bir String in uzunluğu - karakter sayısı
         * DİKKAT!!! [ ] boşluk da bir karakterdir. sayıya dahil edilir.
         */
        System.out.println("ifadenin uzunluğu...:" + ifade.lines());

        /**
         * elimizde karakter dizi şeklinde tutulan bir değerler bütünü var ise
         * o zaman istediğim bir değere erişim sağlamalıyım.
         * charAt(Index); -> String bir ifadenin istenilen sırasında ki karakter döner.
         * DİKKAT!!!!! Diziler dizi olarak ifade edilenler daima sıra numarası olarak 0(sıfır) dan başlar.
         * bu nedenle son okuyacağınız değeri String değişkenin uzunluğu - 1 şeklinde değer
         */
        System.out.println("******charAt(Index)******");
        String ad="Muhammet"; // {'M','u','h','a','m','m','e','t'} //
        System.out.println(ad.charAt(0));
        System.out.println(ad.charAt(6));

        /**
         * Soru: aşağıda gördüğünüz şekli kendi adınızı kullanarak yazınız.
         * E
         * Es
         * Esr
         * Esra
         * ÖDEV!
         *     E
         *    E s
         *   E s r
         *  E s r a
         *
         */
        String isim="Esra";
        System.out.println(isim.charAt(0));
        System.out.print(isim.charAt(0));
        System.out.println(isim.charAt(1));
        System.out.print(isim.charAt(0));
        System.out.print(isim.charAt(1));
        System.out.println(isim.charAt(2));
        System.out.print(isim.charAt(0));
        System.out.print(isim.charAt(1));
        System.out.print(isim.charAt(2));
        System.out.println(isim.charAt(3));

        for(int i=0;i<isim.length();i++){
            System.out.println();
            for (int j=0;j<=i;j++){
                System.out.print(isim.charAt(j));
            }
        }
        System.out.println();
        /**
         * indexOf(char), indexOf(String) -> girilen karakter yada metni ifadenin içinde arar ve
         * bulduğu ilk konumu döner.
         * DİKKAT!!! bulunan konum, index türündendir ve bir ifadenin ilk başladığı yeri döner.
         */
        ifade ="bugün hava kapalı, ancak daha bir kaç gün önce hava açık idianack havalar daha da kapalı olacak gibi.";
        System.out.println("c karakterinin ilk konumu...:"+ ifade.indexOf('c'));
        System.out.println("hava kelimesinin ilk görüldüğü yer..:" +ifade.indexOf("hava"));
        System.out.println("10. indexten sonra bulunan ilk hava ifadesi...:" +ifade.indexOf("hava", 10));
        System.out.println("en son rastlanılan hava ifadesinin konumu...:"+ifade.lastIndexOf("hava"));
        /**
         * ÖDEV:
         * bir metinde aranılan bir kelimenin rastlandığı tüm konumları listeleyen kodu yazınız.
         */

        /**
         * String bir karakterler dizisi olduğu için belli noktalardan parçalama imkanınız olabilir
         * bunun için;
         * subString(Index) -> başlangıç değerinden ifadenin sonuna kadar olan kısmını keser
         */
        System.out.println("***** substring *****");
        ifade="yeni bir güne merhaba";
        System.out.println(ifade.substring(5));
        System.out.println(ifade.substring(5,12));
        /**
         * dosya uzantısı?
         * -> sabah-yürüyüaü.10.10.2023.png
         * -> okul-gezisi.jpg
         */
        String dosyaAdi="okul-gezisi.jpg";
        if (dosyaAdi.length()>=3){
            System.out.println(dosyaAdi.lastIndexOf("."));
            System.out.println(dosyaAdi.substring(11));
        }else{
            System.out.println("bulunamadı");
        }
        /**
         *
         * str.equals(str1) -> iki String ifadenin içinde barındırdığı metinlerin eşitliğini kontrol eder
         *
         * str.trim() -> String bir ifadenin başında ve sonunda bulunan bolukları temizler.
         *
         * str.toLowerCase() -> String ifadeyi tamamen küçük harfe çevirir.
         * str.toUpperCase() -> String ifadeyi tamamen büyük harfe çevirir.
         *
         * --> toUpperCase(Locale)
         * Locale.ENGLISH
         */
        System.out.println("******* trim() *******");
        ifade="    bir boşlukçu dayı bizi gümletti.  :";
        System.out.println(ifade.trim());
        System.out.println();
        System.out.println("******* toLower - toUpper - Case *******");
        System.out.println(ifade.toUpperCase());
        System.out.println(ifade.toUpperCase(Locale.forLanguageTag("tr-TR")));
        ifade = "this Java?";
        System.out.println(ifade.toUpperCase(Locale.ENGLISH));

        String ka="admin", sf="1223445";
        System.out.println("Kullanıcı adınızı giriniz: ");
        String kullaniciAdi=new Scanner(System.in).nextLine();
        System.out.println("Şifrenizi giriniz: ");
        String sifre=new Scanner(System.in).nextLine();
        if (ka.equals(kullaniciAdi.trim())&& sf.equals(sifre.trim())){
            System.out.println("Giriş başarılı");
        }else{
            System.out.println("Lütfen kullanıcı adı veya şifrenizi kontrol ederek tekrar deneyiniz");
        }




    }//main sonu
}//class sonu

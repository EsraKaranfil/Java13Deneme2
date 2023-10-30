package com.esra;

import java.net.URL;
import java.util.Scanner;

public class Runner_Burc_Yorumu {
    public static void main(String[] args) throws Exception {
        /**
         * https://www.elle.com.tr/astroloji/ikizler
         * Ay = Ekim
         */
        String ay = "Ekim";
        System.out.println("*******************************");
        System.out.println("********* BURÇ YORUMU *********");
        System.out.println("*******************************");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen burcunuzu giriniz.....: ");
        String burc =sc.nextLine();
        System.out.println("Lütfen gün giriniz.....: ");
        String gun =sc.nextLine();
        Scanner scannerWeb = new Scanner(
                new URL("https://www.elle.com.tr/astroloji/" + burc).openStream(),"UTF-8"
        );
        /**
         * Scanner okuduğu web sitesinin içinde bir sonraki satırda bilgiye sahip olup olmadığını kontrol
         * edebilir ve var ise o satırı okuyabilir. Buradaki döngü koşulumuz sonraki satır var mı?
         */
        boolean flag = false;
        while (scannerWeb.hasNext()){
            String satir = scannerWeb.nextLine();
            if (satir.contains(gun) && satir.contains("</strong>"))
                flag= true;
            if (satir.contains("<p>") && flag) {
                System.out.println(
                        satir
                                .replace("</p>", "")
                                .replace("<p>", "")
                                .replace("<br>", "")
                );
                break; // içinde bylunduğu kod bloğundan çıkar ve döngüyü sonlandırı
            }
        }


    }
}

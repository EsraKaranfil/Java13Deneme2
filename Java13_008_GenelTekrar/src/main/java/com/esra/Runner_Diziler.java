package com.esra;

import java.util.Scanner;

public class Runner_Diziler {
    public static void main(String[] args) {
        /**
         * Bir işletme sahibi kiraladığı araçların kimlere kiralandığını
         * ve iade zamanlarını tutmak ve bunların istediği zaman görüntülemek
         * istemektedir. Bunu yapabilecek çok boyutlu dizi örneği yazınız.
         *
         * Kiralama:
         * Sıra No / Araç - Plaka /
         */
        int secim;
        String [][] aracListesi = new String[3][5];
        /**
         * 1. Araç
         */
        aracListesi[0][0] = "KİRA001";
        aracListesi[0][1] = "Mercedes S350";
        aracListesi[0][2] = "06 AAA 999";
        aracListesi[0][3] = "1.500TL";
        aracListesi[0][4] = "AKTİF"; // AKTİF - KİRADA
        /**
         * 2. Araç
         */
        aracListesi[1][0] = "KİRA002";
        aracListesi[1][1] = "Audi A7";
        aracListesi[1][2] = "06 BBB 999";
        aracListesi[1][3] = "1.620TL";
        aracListesi[1][4] = "AKTİF";
        /**
         * 3. Araç
         */
        aracListesi[2][0] = "KİRA003";
        aracListesi[2][1] = "BMW İ5";
        aracListesi[2][2] = "06 CCC 999";
        aracListesi[2][3] = "2.100TL";
        aracListesi[2][4] = "AKTİF";
        /**
         * araç no - araç adı - kiralayan - k. tarihi - iade tarihi - toplam tutar - ödeme
         */

        String[][] kiralamaListesi= new String[200][6];
        int kiralamaSayisi=0;
        do {

            System.out.println("*******************************");
            System.out.println("**** ARAÇ KİRALAMA SİSTEMİ ****");
            System.out.println("*******************************");
            System.out.println();
            System.out.println("1- Aktif Araç Listesi");
            System.out.println("2- Araç Kiralama");
            System.out.println("3- Kiralama Listesi");
            System.out.println("4- Araç İade");
            System.out.println("0- ÇIKIŞ ");
            System.out.println();
            System.out.print("Lütfen seçiniz...:");
            secim=new Scanner(System.in).nextInt();
            switch (secim){
                case 1:
                    for (int i=0; i<3;i++){
                        if (!aracListesi[i][4].equals("AKTİF")) continue;
                        for (int j=0; j<5;j++){
                            System.out.print(aracListesi[i][j]+" - ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("***************************");
                    System.out.println("***** ARAÇ KİRALAMA *******");
                    System.out.println();
                    System.out.println("Hangi aracı kiralayacaksınız...: ");
                    int indexNo =new Scanner(System.in).nextInt();
                    kiralamaListesi[kiralamaSayisi][0] = aracListesi[indexNo][0];//araç kodu
                    kiralamaListesi[kiralamaSayisi][1] = aracListesi[indexNo][1];//araç adı
                    System.out.println("Kiralayan Bilgisi...: ");
                    kiralamaListesi[kiralamaSayisi][2] = new Scanner(System.in).nextLine();
                    System.out.println("Kiralama Tarihi...: ");
                    kiralamaListesi[kiralamaSayisi][3] = new Scanner(System.in).nextLine();
                    System.out.println("İade Tarihi...: ");
                    kiralamaListesi[kiralamaSayisi][4] = new Scanner(System.in).nextLine();
                    System.out.println("Tutar ...: ");
                    kiralamaListesi[kiralamaSayisi][5] = new Scanner(System.in).nextLine();
                    aracListesi[indexNo][4]="KİRADA";
                    kiralamaSayisi++;

                    break;
                case 3:
                    System.out.println("******************************");
                    System.out.println("***** KİRALAMA LİSTESİ *******");
                    System.out.println();
                    for (int i=0;i<kiralamaSayisi;i++){
                        for (int j=0; j<6;j++)
                        System.out.println(kiralamaListesi[i][j]+" - ");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("*******************************");
                    System.out.println("********* ARAÇ İADESİ *********");
                    System.out.println("İade edilecek araç numarası...:");
                    int aracIndexNo=new Scanner(System.in).nextInt();
                    aracListesi[aracIndexNo][4]="AKTİF";
                    break;
                case 0:
                    System.out.println("Çıkış Yapıldı."); break;
                default:
                    System.out.println("Geçersiz seçim");
            }
        }while (secim!=0);






    }//main sonu
}// class sonu

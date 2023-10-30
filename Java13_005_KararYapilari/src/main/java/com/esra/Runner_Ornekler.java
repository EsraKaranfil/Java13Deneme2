package com.esra;

public class Runner_Ornekler {
    public static void main(String[] args) {

        /**
         * bir sınıfda 3 öğrenci vardır ve notları şu şekildedir;
         * Murat: 90, 40, 51
         * Deniz: 87, 35, 66
         * Bahar: 98, 74, 84
         * bu üç öğrencinin not ortalaması düşünüldüğünde notu en yüksek olan
         * öğrenciyi ve notu en düşük öğrenciyi bulun.
         * NOT: ortalama = (toplam not)/ not adedi
         */
        int mort=(90+40+51)/3;
        int dort=(87+35+66)/3;
        int bort=(98+74+84)/3;
        if (mort>dort && mort>bort){
            System.out.println("En yüksek not ortalaması Murat'ındır.");
        } else if (dort>mort && dort>bort) {
            System.out.println("En yüksek not ortalaması Deniz'indir.");
        } else if (bort>mort && bort>dort) {
            System.out.println("En yüksek not ortalaması Bahar'ındır.");
        }
        if (mort<dort && mort<bort){
            System.out.println("En düşük not ortalaması Murat'ındır.");
        } else if (dort<mort && dort<bort) {
            System.out.println("En düşük not ortalaması Deniz'indir.");
        } else if (bort<mort && bort<dort) {
            System.out.println("En düşük not ortalaması Bahar'ındır.");
        }

    }//main sonu
}//class sonu

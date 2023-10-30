package com.esra;

public class Runner_Uygulamalarin_Calıisma_Suresi_Performans {
    public static void main(String[] args) {
        /**
         * Kodlamalarınızı yaparken kodların işletim süreleri performansı
         * görmek için bir kriterdir. kullanıcı deneyimini direkt etkileyen
         * temel konulardan birisidir.
         * 1- String pool içinde her işlem sonunda yeni nesne yaratılarak String değeri atanır.
         * 2- Belli bir süre sonra kullanılamayan String değerleri yani adres tarafından
         * işaret edilmeyen bellek alanları GC(Garbage Collecter) tarafından toplanır(temizlenir)
         * 3- işlem sonuna kadar böyle devam eder.
         * Burada yapılan işlemler çok fazla işlemci ve bellek yükü getirdiği için işlem uzun sürer.
         */
        long start= System.currentTimeMillis();
        String ifade= "Asus Laptop AAA434X";
        int kullanici_sayisi=1000_000;
        for (int i=0; i<kullanici_sayisi;i++){
            ifade = ifade+i;
        }
        long end= System.currentTimeMillis();
        System.out.println("işlem süresi...: " + (end-start)+ "ms");

        start =System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("Asus Laptop AAA434X");
        kullanici_sayisi= 1000_00_000;
        for (int i=0;i<kullanici_sayisi;i++){
            sb.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("işlem süresi...: " + (end-start)+ "ms");

    }
}

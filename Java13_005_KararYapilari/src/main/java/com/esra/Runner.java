package com.esra;

public class Runner {
    public static void main(String[] args) {
        /**
         * SYNTAX: Yazım kuralları
         * if -> bir durumu irdeler ve koşul sağlıyor ise kod bloğunu işletir.
         * if(true){ -> eğer parantez içi doğru ise bunu yap
         * kod
         * }else{
         * diğer kod
         * }
         */
        int sayi=5;
        if (sayi>1){
            System.out.println("------ 1. durum çalıştı ------");
        }
        if (sayi%5==0)
            // DİKKAT!1 Eğer süslü parantez kullanmaz iseniz ilk kod satırı koşula dahil olur
            System.out.println("------ 2. durum çalıştı ------");

        if (sayi/2>8)
            System.out.println("------ 3. durum çalıştı ------");
        System.out.println("Ek kod çalıştı.");

        /**
         * Aynı anda birden farklı durumları irdelemek istersek ve sonuçlarını işlemek istersek ne olacak
         *
         */
        String username = "esrakaranfil";
        String password = "12345";
        System.out.println("************************");
        System.out.println("*** JAVA13 SOSYAL AĞ ***");
        System.out.println("************************");

        if (username=="esrakaranfil" && password=="12345"){
            System.out.println("Uygulamaya giriş yaptınız");
        }else{
            System.out.println("Kullanıcı adınız yada şifreniz yanlıştır. Lütfen kontrol ederek tekrar deneyin.");
        }

        /**
         * Bazen durumlar çok karışık olabilir ve 2 durum değil 1....n kadar durum irdelemek gerekebilir, bu gibi
         * kodlamalarda daha fazla if ihtiyacı ortaya çıkar. Bunun için şu şekilde kodlamalar yaparız.
         * SYNTAX:
         * if(true){
         * kod
         * }else if(true){ -> 1 den fazla kez kullanılabilir.
         * kod
         * }else if(true){
         * kod
         * }else{
         * kod
         * }
         */
        /**
         * FF 0<ort<10
         * FD 10<ort<20
         * DD 20<ort<30
         * DC 30<ort<40
         * CC 40<ort<50
         * CB 50<ort<60
         * BB 60<ort<70
         * BA 70<ort<80
         * AA 80<ort<100
         */
        int ort=3;
        if(ort<=10) System.out.println("FF");
        else if (ort<=20) System.out.println("FD");
        else if (ort<=30) System.out.println("DD");
        else if (ort<=40) System.out.println("DC");
        else if (ort<=50) System.out.println("CC");
        else if (ort<=60) System.out.println("CB");
        else if (ort<=70) System.out.println("BB");
        else if (ort<=80) System.out.println("BA");
        else System.out.println("AA");


        /**
         *switch....case
         * bir değeri incelemek ve kontrol etmek için bir bir uyuma bakar
         * ve eğer doğru ise kod çalışır.
         * switch(value){
         * case x: kod ; break;
         * caye y: kod ; break;
         * default: kod;
         * }
         */
        int secim = 3;
        switch (secim){
            case 1:
                System.out.println("toplama"); break;
            case 2:
                System.out.println("çarpma"); break;
            default:
                System.out.println("lütfen geçerli bir seçim yapınız");
        }



        System.out.println("PROGRAM SONLANDI.");

    }//main sonu
}//class sonu

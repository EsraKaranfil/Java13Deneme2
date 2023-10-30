package com.esra;

import java.util.Scanner;

public class Runner_Ornek_003_Return_Parameters {
    public static void main(String[] args) {
        System.out.println("hoca yaşını giriniz...:");
        int yas=new Scanner(System.in).nextInt();
        int yasFarki=yasFarkiniBul(yas);
        System.out.println("yaş farkı...: "+yasFarki);
    }//main sonu
    /**
     * Methodlar çalışmadan önce kendilerini çağırandan bilgi talep
     * edilebilirler ve aldıkları bilgileri kendi gövdelerinde kullanılabilirler
     *
     */
    public static int yasFarkiniBul(int yas){
        int mustafaninYasi=30;
        int fark= yas - mustafaninYasi;
        return fark;
    }

}//class sonu

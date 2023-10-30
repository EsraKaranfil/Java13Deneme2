package com.esra.lesson007;
/*
dizi içerisindeki 1 ve 4 ün adedi ve 1 sayısının adedi 4 sayısının
adedinden büyük ise true değilse false yazdıran algoritma.
eşitse eşit yazdırsın
int[] sayilar={1,4,5,6,1,1,4,8};
 */

public class Question38 {
    public static void main(String[] args) {
        int[] sayilar={1,4,5,6,1,1,4,8};
        int birAdedi = 0;
        int dortAdedi = 0;

        for (int sayi : sayilar) {
            if (sayi == 1) {
                birAdedi++;
            } else if (sayi == 4) {
                dortAdedi++;
            }
        }

        if (birAdedi > dortAdedi) {
            System.out.println("true");
        } else if (birAdedi < dortAdedi) {
            System.out.println("false");
        } else {
            System.out.println("eşit");
        }
    }
}

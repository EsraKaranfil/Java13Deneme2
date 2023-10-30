package com.esra;

public class Runner_Tanim {
    /**
     * Bir sınıf kodları çizgileri içinde - (scope) tanımlanabilecek temel bileşenler
     *
     * 1- Değişken tanımları
     * 2- Methodlar
     * 3- İç sınıflar
     *
     */
    public static void main(String[] args) {


    }//main sonu

    /**
     * Method tanımlama
     * 1-Tanım
     * aksiyon olarakta tanımlanabilir. methodlara görev
     * veririz ve verdiğimiz görevleri yerine getiriler.
     * görevden kastımız belli bir kodu barındırmak ve
     * gerekli olduğunda çağırılarak o kodun işlemesini sağlamaktır.
     * 2-Methodların sağladığı faydalar;
     * - kodun okunurluğunu arttırır.
     * - iş bölümünü kolaylaştırır.
     * - kod tekrarının önüne geçer.
     * 3-Kodlama
     * public -> Acces Modifier(Erişim Belirteci), yazılması zorunlu değildir.
     * static -> zorunlu değildir, önüne geldiği bileşenin adres edinimini sağlar ve sabit tutar.
     * final -> zorunlu değildir. nitelediği değeri değişmez kılar.
     * Return Type -> her method bir return type a sahiptir. Ancak her method bir değer dönmek zorunda değildir.
     * Method Name -> her methoda bir ad verilir. İsimlendirme işin niteliği ile ilgili aksiyon belirtir şekilde yazılırsa doğru olur
     * eğer isim birden fazla kelime içeriyorsa, ilk harf küçük diğer kelimelerin ilk harfi büyük yazılır.
     * Prantez -> buraya eğer dışarıdan bilgi talep ediliyorsa bilgi türüne uygun şekilde tanımlama yapılır. aksi halde boş kalır.
     */
    //final double PI = 3.14;

    public void aklindanSayiTut(){
        int sayi=5;
    }
    public int aklindanSayiTutVeSoyle(){
        int sayi=6;
        return sayi;
    }
    public String enSevdiginYemekNedir(){
        return "Döner";
    }

    public boolean aklindanSayiTutVeDogruMuSoyle(int tahmin){
        int sayi=7;
        return tahmin==sayi;
    }

    public static final Object birIslemYap(int sayi1, String ifade, boolean durum, Runner_Tanim runnerTanim,String... hobiler){
        Object o;
        o=454;
        o="jhjblhb";
        o= new Runner_Tanim();
        o='A';
        return o;
    }



    /**
     * İnternet bağlantısını kontrol eden method olduğu varsayılmıştır.
     * @return bağlantı var ise true, yoksa false
     */

    public static boolean isConnection(){
        return true;
    }
}//class sonu
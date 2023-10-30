package com.esra;

public class Runner_Ornek_002_1_Return {
    public static void main(String[] args) {
        System.out.println("fark..:" + (carpim1()-carpim2()));

    }
    /**
     * iki farklı method yaz. bu methodlar kendi içlerinde 2 farklı sayının
     * çarpımını bulun return ediyor olsun bu iki methoddan dönen sayıların farkını bulun
     */
    public static int carpim1(){
        int s1=3, s2=4;
        int carpim1 = s1*s2;
        return carpim1;
    }
    public static int carpim2(){
        int s1=2, s2=4;
        int carpim2 = s1* s2;
        return carpim2;
    }


}

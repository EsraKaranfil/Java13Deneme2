package com.esra.lesson007;

public class Question36 {
    public static void main(String[] args) {
        int[] sayilar ={0,1,2,3};
        int max =Integer.MAX_VALUE;
        int min =Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;
        for (int i=0;i< sayilar.length;i++){
            if (sayilar[i]>max){
                max=sayilar[i];
            }
            if (sayilar[i]<min){
                min=sayilar[i];
            }
            if (sayilar[i]>secondMax&&sayilar[i]<max){
                secondMax=sayilar[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(secondMax);
    }
}

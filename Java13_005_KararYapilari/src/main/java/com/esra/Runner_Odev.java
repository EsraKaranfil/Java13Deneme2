package com.esra;

public class Runner_Odev {
    public static void main(String[] args) {
        int n = 5;

        for (int satir = 0; satir < n; satir++) {
            for (int sutun = 0; sutun < n; sutun++) {
                if (satir == 0 || satir == n - 1 || sutun == 0 || sutun == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

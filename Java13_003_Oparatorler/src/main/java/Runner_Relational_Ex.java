import java.util.Scanner;

public class Runner_Relational_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v, f, ort;
        System.out.println("Vize notunu giriniz: ");
        v = sc.nextInt();
        System.out.println("Final notunu giriniz: ");
        f = sc.nextInt();
        ort = (v + f)/2;
        /**
         * öğrencinin notu 50 den büyük müdür?
         */
        if (ort>50) {
             ;
             System.out.println("öğrenci geçti");
         }
         else {
             System.out.println("öğrenci kaldı");
         }
    }
}

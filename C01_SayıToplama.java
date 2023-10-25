package day10_methodOluşturma;

import java.util.Scanner;

public class C01_SayıToplama {
    public static void main(String[] args) {
        // Verilen iki sayıyı toplayıp,
        // sonucu yazdıran bir method oluşturun

        toplaYazdır(5,6.4);
        toplaYazdır(7,6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen toplamak üzere iki sayı giriniz");
        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();

        toplaYazdır(sayı1,sayı2);
    }//main method sonu

    public static void toplaYazdır(double sayı1,double sayı2) {
        System.out.println("Verilen iki sayının toplamı : "+
                (sayı1+sayı2));
    }


}

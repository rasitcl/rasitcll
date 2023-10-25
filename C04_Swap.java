package day02_scanner_DataCasting;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {

        // Soru 7 (İnterview)- Kullanıcıdan iki sayı alıp
        //                     ikisinin değerlerini değiştirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk tamsayıyı giriniz");
        int sayı1 = scanner.nextInt();

        System.out.println("Lütfen ikinci tamsayıyı giriniz");
        int sayı2 = scanner.nextInt();

        System.out.println("Girdiğiniz değerler : sayı1 = " + sayı1 +", sayı2= "+ sayı2);

        int boşKova = 0;

        boşKova = sayı2;

        sayı2 = sayı1;

        sayı1 = boşKova;

        System.out.println("Değiştirilen değerler : sayı1 = " + sayı1 +", sayı2= "+ sayı2);
    }
}

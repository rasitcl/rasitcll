package day04_ifStatemets;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {

        // Soru 5- Kullanıcıdan notunu alın 50 veya faha büyükse "sınıfı geçtin",
        //         50'den küçükse "Maalesef kaldın" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not = scanner.nextDouble();


        if (not >= 50){
            System.out.println("Sınıfı geçtin");
        }
        if (not<50){
            System.out.println("Sınıfta kaldın");
        } else {
            System.out.println("Maalesef kaldın");
        }

    }
}

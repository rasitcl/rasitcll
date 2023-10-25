package day04_ifStatemets;

import java.util.Scanner;

public class C02_ifStatements {

    public static void main(String[] args) {

        //soru 4- Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alıp,
        //        üçgen eşkenar üçgen ise "eşkenar üçgen yazdırın"

        Scanner scanner =  new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        // Java ikili karşılaştırmaları kabul eder
        // daha fazla karşılaştırmaya ihtiyaç varsaa
        // matıksal operatörler kullanılarak şartlar ayrı ayrı yazılıp, birleştitrilir

        if (kenar1==kenar2 && kenar2==kenar3 && kenar2>0){
            System.out.println("Verilen kenar uzunlukları eşkenar üçgen oluşturur");
        }
    }
}

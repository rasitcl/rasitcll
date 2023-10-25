package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class c05_ternary {
    public static void main(String[] args) {
        //soru 1-Kullanıcıdan bir üçgenin üç kenar uzunluğunu isteyip
        //       üçgen eşkenar ya da eşkenar değil yazzdırın
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 kenar girinizs");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();
        System.out.println(kenar1==kenar2&&kenar3==kenar1&&kenar1>0?"Eşknar":"Eşknar değil");
    }
}

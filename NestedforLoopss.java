package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class NestedforLoopss {
    public static void main(String[] args) {

        /*
        Kullanıcıdan satır sayısını alıp,
        aşağıdaki gibi *'lardan oluşan bir şekil çizdirin

        *
        * *
        * * *
        * * * *


         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int satır = scanner.nextInt();


        for (int i = 1; i <=satır ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }


    }
}

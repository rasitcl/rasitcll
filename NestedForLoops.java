package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class NestedForLoops {
    public static void main(String[] args) {
        /*
        Kullanıcıdan satır ve sütün sayısını alıp
        aşağıdaki gibi *'lardan oluşan bir şekil çizdirin

        * * * * *
        * * * * *
        * * * * *
        * * * * *


        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısı girin");
        int satır = scanner.nextInt();

        System.out.println("sutun sayısını giriniz");
        int sutun = scanner.nextInt();


        for (int i = 1; i <= satır ; i++) {
            for (int j = 1; j <= sutun ; j++) {
                System.out.print(i+ " ");

            }
            System.out.println(" ");



        }



    }
}

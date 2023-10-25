package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class C07NestedForLoops {
    public static void main(String[] args) {
        /*
        kullanıcıdan satır ve sütün sayısını alıp
        aşağıdaki gibi *'lardan oluşan bir şekil çizin

        * * * * *
        * * * * *
        * * * * *
         */

        Scanner scanner = new Scanner( System.in);
        System.out.println("satır sayısını giriniz");
        int satır = scanner.nextInt();

        System.out.println("sutun sayısını giriniz");
        int sutun = scanner.nextInt();

        //satır = 5 sutun = 9

        for (int i = 1; i <= satır ; i++){
            for (int j = 1 ; j <= sutun ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

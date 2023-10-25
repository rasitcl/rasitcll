package day04_ifStatemets;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        // Soru 1- Kullanıcıdan bir üçgenin kenar uzunluklarını isteyip,
        //         üçgen eşkenar ise eşkenar üçgen değilse eşkenar değil yazdırın

        Scanner scanner =  new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();
        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("Eşkenar üçgen");
        }
        else{
            System.out.println("eşkenar değil");
        }


    }
}

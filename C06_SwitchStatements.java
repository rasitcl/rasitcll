package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class C06_SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfrn numara girin");
        int rak= scanner.nextInt();
        switch (rak) {
            case 1:
                System.out.println("pazarteasi");
                break;
             case 2:
                System.out.println("salı");
                 break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
                case 5:
                System.out.println("cuma");
                    break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
        }


    }

}

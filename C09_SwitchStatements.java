package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class C09_SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün numarası giriniz");
        int günNo = scanner.nextInt();

        switch (günNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Yanlış gün numarası");

        }
    }
}

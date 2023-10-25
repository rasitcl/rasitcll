package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class C07_SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen anlamını öğrenmek istediğiniz harfi giriniz");
        char hrf = scanner.next().charAt(0);
        switch (hrf){
            case 'ı':
            case 'I':
                System.out.println("International");
                break;
            case's':
            case'S':
                System.out.println("Software");
                break;
            case'T':
            case't':
                System.out.println("Testing");
                break;
            case 'Q':
            case'q':
                System.out.println("qualification");
                break;
            case'b':
            case'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("Lütfen kısaltmadaki harflerden birini yazınız");
        }
    }
}

package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class C10_SwitchStatements {

    public static void main(String[] args) {

        //soru 4-Kullanıcıdna ISTQB kısaltmasındaki harflerden,

        // anlamını öğrenmek istediği harfi alın

        // ve girilen harfin karşılığını yazdırın.

        // I:International S : Software T : Testing  Q : Qualifications B : Board

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen I,S,T,Q,B'den birini giriniz");

        char girilenHarf = scanner.next().charAt(0);

        switch (girilenHarf) {
            case 'I':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Hatalı giriş");

        }
    }
}

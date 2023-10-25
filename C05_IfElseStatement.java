package day04_ifStatemets;

import java.util.Scanner;

public class C05_IfElseStatement {
    public static void main(String[] args) {

        /*
        soru 1- kullanıcıdan bir karakter girmesini isteyip,
        girilen karakterin büyük harf olup olmadığını yazdırın
       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krk = scanner.next().charAt(0);

        if (krk >= 'A' && krk<='Z'){
            System.out.println("girilen karakter büyük harf");
        }
        else {
            System.out.println("girilen karakter büyük harf değil ");
        }
    }
}

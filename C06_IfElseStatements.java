package day04_ifStatemets;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        // <soru 5- Kullanıcıdan bir karekter isteyip,
        //          girilen karakter büyük harf ise onu büyük harf olarak yazdırın,
        //          yoksa girilen karakteri yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char krk = scanner.next().charAt(0);
        if (krk>= 'a'&& krk<='z'){
            System.out.println(Character.toUpperCase(krk));
        }
        else {
            System.out.println(krk);
        }

    }
}

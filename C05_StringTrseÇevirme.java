package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class C05_StringTrseÇevirme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen terse çevirmek için bir metin yazın");
        String girilenMetin =scanner.nextLine();
        String tersMetin ="";

        for (int i = girilenMetin.length()-1; i>=0 ;i--) {
            tersMetin += girilenMetin.charAt(i);
        }
        System.out.println("Girilen metnin ters hali : " + tersMetin);
      // tersi ile düzen yazılışı aynı olan metinlere palindrome denir.
        // ey edip adanada pide ye
        if (girilenMetin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin palidrome");
        }else {
            System.out.println("Girilen metin palidrome değil");
        }


    }
}

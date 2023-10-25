package day08_StringManipulations;

import java.util.Scanner;

public class C04_ReplaceAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String a = scanner.next();
        System.out.println("Lutfen soyadınızı giriniz");
        String b = scanner.next();
        System.out.println("Lütfen kart no giriniz");
        String c = scanner.next();
        String d = a.substring(0,1).toUpperCase() +
                a.substring(1)
                        .replaceAll("\\w","*");
        String e = b.substring(0,1).toUpperCase() +
                b.substring(1)
                        .replaceAll("\\w","*");
        String f = c.substring(0,4)+"**** **** ****";
        System.out.println("İsmim soyisim : " + d + " " + e);
        System.out.println("Kart No : " + f);
    }
}

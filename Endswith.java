package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class Endswith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mail adresinizi giriniz");
        String mail = scanner.nextLine();

        if (!mail.contains("@")) {
            System.out.println("Geçersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("Mail gmail olmalı");
            
        } else if (mail.endsWith("@gmail.com")) {
            System.out.println("Mailde yazım hatası var");

        }
    }
}

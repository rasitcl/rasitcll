package day08_StringManipulations;

import java.util.Scanner;

public class bağımsızifcümlleeriii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lüten bir sayı giriniz");
        int a = scanner.nextInt();
        if (a % 5==0){
            System.out.println("5'e tam bölündü");
            if (a % 3 == 0){
                System.out.println("3'e tam bölündü");
            }

        }
    }
}

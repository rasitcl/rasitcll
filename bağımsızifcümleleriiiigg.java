package day08_StringManipulations;

import java.util.Scanner;

public class bağımsızifcümleleriiiigg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını girin");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
         if (a==b&&b==c){
             System.out.println("eşkenar üçgen");
         }
    }
}

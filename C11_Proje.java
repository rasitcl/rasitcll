package Java_Projeleri;

import java.util.Scanner;

public class C11_Proje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayı ");
        double a = scanner.nextDouble();

        System.out.print("2. Sayı ");
        double b = scanner.nextDouble();

        System.out.print("3. Sayı ");
        double c = scanner.nextDouble();

        if (a> b && a> c){
            if (b>c){
                System.out.println("a>b>c");
            }else {
                System.out.println("a>c>b");
            }
        } else if (b>a && b>c) {
            if (a>c){
                System.out.println("b>a>c");
            }else {
                System.out.println("b>c>c");
            }
        } else  {
            if (a>b){
                System.out.println("c>a>b");
            }else {
                System.out.println("c>b>a");
            }
        }
    }
}

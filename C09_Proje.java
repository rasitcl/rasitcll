package Java_Projeleri;

import java.util.Scanner;

public class C09_Proje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayı : ");
        double a = scanner.nextDouble();
        System.out.print("2. Sayı : ");
        double b = scanner.nextDouble();

        System.out.println("İşlem seçiniz : ");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkartma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.println("İşleminiz : ");
        double select = scanner.nextDouble();

        if (select == 1) {
            System.out.println("Sonuç : " + (a + b));
        } else if (select == 2) {
            System.out.println("Sonuç : " + (a - b));
        } else if (select == 3) {
            System.out.println("Sonuç : " + (a * b));
        } else if (select == 4) {
            System.out.println("Sonuç : " + (a / b));
        }

    }
}

package Java_Projeleri;

import java.util.Scanner;

public class C05_Proje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();

        double indeks;

        indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz : " + indeks);
    }
}

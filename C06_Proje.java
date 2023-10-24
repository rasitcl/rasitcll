package Java_Projeleri;

import java.util.Scanner;

public class C06_Proje {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double Kilo;
        double toplam;

        double salatalık = 3.14;
        double elma = 4.11;
        double kabak = 2.22;
        double domates = 0.95;
        double patlıcan = 7.00;

        System.out.println("Salatalık kaç kilo : ");
        double salatalık1 = scanner.nextDouble();


        System.out.println("Elma kaç kilo : ");
        double elma2 = scanner.nextDouble();

        System.out.println("Domates kaç kilo : ");
        double domates3 = scanner.nextDouble();

        System.out.println("Kabak kaç kilo : ");
        double kabak4 = scanner.nextDouble();

        System.out.println("Patlıcan kaç kilo : ");
        double patlıcan5 = scanner.nextDouble();

        System.out.println("salatalık : "+(toplam = salatalık * salatalık1)+" tl.");
        System.out.println("patlıcan : "+(toplam = patlıcan5 * patlıcan)+" tl.");
        System.out.println("domates : "+(toplam = domates3 * domates)+" tl.");
        System.out.println("kabak : "+(toplam = kabak4 * kabak)+" tl.");
        System.out.println("elma : "+(toplam = elma2 * elma)+" tl.");




    }
}

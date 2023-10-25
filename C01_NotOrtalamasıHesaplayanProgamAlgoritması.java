package Java_Dersleri02;

import java.util.Scanner;

public class C01_NotOrtalamasıHesaplayanProgamAlgoritması {
    public static void main(String[] args) {
        double yazili, vize, finall;
        double ortalama;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yazılı notunuzu giriniz: ");
        yazili = scanner.nextDouble();
        System.out.println("Vize notunuzu giriniz: ");
        vize = scanner.nextDouble();
        System.out.println("Final notunuzu giriniz: ");
        finall = scanner.nextDouble();

        ortalama = (yazili * 0.2) + (vize * 0.35) + (finall * 0.45);
        String sonuç = (ortalama >= 50 ? "Geçitiniz " : "Kaldınız ");
        System.out.println("Not ortalamanız: " + ortalama + " & " + sonuç);

    }
}

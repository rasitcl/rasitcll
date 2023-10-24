package Java_Projeleri;

import java.util.Scanner;

public class C03_Proje {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double price, total, kdvPrice, rate = 18;

        System.out.print("Tutar giriniz : ");
        price = scanner.nextDouble();

        kdvPrice = price * (rate / 100);
        total = kdvPrice + price;

        System.out.println("KDV Oranı : % " + (int)rate);
        System.out.println("KDV Tutarı : " + kdvPrice);
        System.out.println("KDV'li Tutar : " + total);
    }
}

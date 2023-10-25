package Java_Dersleri02;

import java.util.Scanner;

public class C02_KDV_Hesaplama_Programı {
    public static void main(String[] args) {
        double tutar, KDVliFiyat, KDV = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün tutarını giriniz : ");
        tutar = input.nextDouble();
        KDVliFiyat = tutar + (tutar*KDV);
        System.out.println("Ürünün KDV'li fiyatı: " + KDVliFiyat);
    }
}

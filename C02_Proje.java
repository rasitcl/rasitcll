package Java_Projeleri;

import java.util.Scanner;

public class C02_Proje {
    public static void main(String[] args) {

        double KDV = 0.18, KDVliTutar, tutar, ÖTVliTutar = 0.38 ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürünün tutarını giriniz : ");
        tutar = scanner.nextDouble();

        KDVliTutar = tutar + (tutar*KDV);
        ÖTVliTutar = tutar + (tutar*ÖTVliTutar);
        System.out.print("Ürünün KDV+ÖTV'li tutarı : " + (KDVliTutar+ÖTVliTutar));


    }
}

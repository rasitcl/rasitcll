package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Forlop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Başlangıç değeri giriniz");
        int baş = scanner.nextInt();
        System.out.println("Bitiş değerini yazın");
        int bitiş = scanner.nextInt();
        int toplam = 0;

        if (bitiş> baş) {
            for (int i = baş; i <= bitiş; i++) {
                toplam += i;

            }

        }else {
            for (int i = bitiş; i <= baş; i++) {
                toplam += i;
            }
        }
        System.out.println("verilen aralıktaki sayıların toplamı : "+toplam);
    }
}

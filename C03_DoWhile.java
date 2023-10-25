package Java_Dersleri1;

import java.util.Scanner;

public class C03_DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz");
        int sayı= scanner.nextInt();
        int toplam =0;

        do {
            toplam += sayı % 10;
            sayı = sayı / 10;
            System.out.println("Toplam = " + toplam + " sayı = "+ sayı);
        }while (sayı>0);
        System.out.println("Toplam = "+ toplam);
    }
}

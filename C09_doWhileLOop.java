package day11_whileLoop_doWhileLoop;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class C09_doWhileLOop {
    public static void main(String[] args) {

        // Kullanıcıdan toplamak üzere sayılar isteyin
        // kullanıcı 0'a basıncaya kadar işlemi tekrar ettirin
        // kullanıcı 0'a bastığında girilen sayıların toplamını yazdırın

        Scanner scanner = new Scanner(System.in);
        int toplam= 0;
        int sayı;

        do {
            System.out.println("Lütfen toplanmak üzere bir sayı giriniz\nişlemi bitirmek için 0'a basınız");
            sayı = scanner.nextInt();

            toplam += sayı;
        }while (sayı!=0);

        System.out.println("Girilen sayıların toplamı : "+ toplam);
    }
}

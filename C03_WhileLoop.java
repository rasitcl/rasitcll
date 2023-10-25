package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan toplamak üzere sayılar isteyin
        // Kullanıcı 0'a basıncaya kadar işlemi tekrar ettirin
        // Kullanıcı 0'a bastığında girilen sayıların toplamını yazdırın

        // Döngünün kaç kere çalışacağı belli olmayan işlemlerde while loop tercih edilir

        Scanner scanner = new Scanner(System.in);
        double sayı = 44;
        double toplam = 0;
        /*
        Kullanıcıdan alacağınız sayı 0 olmadığı sürece kod çalışacak
        loop'dan önce bu sayıyı oluşturmamız gerekir ki
        while() içinde kullanabilelim

        NOT : ilk değer ataması yaparken
        loop'un ilk çalışmasını engellenmeyecek bir değer atamaya
        DİKKAT EDİLMELİDİR
         */
        while (sayı != 0) {// kullanıcı 0'a basıncaya kadar

            System.out.println("Toplamak üzere sayılar giriniz \nBitirmek için 0'a basınız");

            sayı = scanner.nextDouble();

            toplam += sayı;
        }
        System.out.println("Girilen sayıların toplamı : "+ toplam);
    }
}
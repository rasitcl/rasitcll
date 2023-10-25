package day11_whileLoop_doWhileLoop;

import day10_methodOluşturma.C05_AsalSayıMıDöndür;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan bir asal sayı girmesini isteyin
        // Kullanıcı asal girmezse "Bu asal değil, tekrar dene" yazdırın
        // Kullanıcı asal sayı girdiğinde, "işlem başarılı tamamlandı" yazdırın


        Scanner scanner = new Scanner(System.in);
        int sayı = 6;

        while (!C05_AsalSayıMıDöndür.asalMıDöndür(sayı)){



            System.out.println("Lütfen asal bir sayı giriniz");
            sayı = scanner.nextInt();

            if (C05_AsalSayıMıDöndür.asalMıDöndür(sayı)){
                System.out.println("İşlem başarılı olarak tamamlandı");
            }else {
                System.out.println("Bu asal değil, tekrar dene");
            }
        

        }
    }
}

package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // While loop kullanarak
        // kullanıcıdan alınan sayının rakamlar toplamını bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen rakamlar toplamını bulmak için bir sayı giriniz");
        int girilenSayı = scanner.nextInt();

        int rakam = 0;
        int rakamlarToplamı = 0;
        int geçiciSayı = girilenSayı;

        while (geçiciSayı>0){

            rakam = geçiciSayı%10;
            rakamlarToplamı += rakam;
            geçiciSayı /= 10;

        }

        System.out.println(girilenSayı+" sayısının rakamlar toplamı"+ rakamlarToplamı);
    }
}

package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayı ve hesaplamak istediği üssü isteyin
        // While loop kullanarak verilen sayının istenen üssünü hesaplayıp
        // yazdıran bir method oluşturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üs hesaplamak istediğiniz pozitif tamsayıyı giriniz");
        int sayı = scanner.nextInt();

        System.out.println("Lütfen hesaplanacak üs değerini pozitif tamsayı olarak giriniz");
        int üs = scanner.nextInt();

        üsHesaplama(sayı,üs);
    }

public static void üsHesaplama(int sayı,int üs){

        //sayı 3, üs 5 olsa 3 * 3 * 3 * 3 * 3
        int sonuç = 1;
        int geçiciÜs = üs;

        while (geçiciÜs>0){
            sonuç *= sayı;
            geçiciÜs--;
        }
    System.out.println(sayı+" üzeri "+üs+" : "+sonuç);
    }

}

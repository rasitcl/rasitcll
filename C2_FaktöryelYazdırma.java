package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class C2_FaktöryelYazdırma {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 20'den küçük bir sayı alıp,
        bu sayının faktöryel değerini hesaplayın.
        Konsolda faktöryel hesabının yapılışını da yazdırın.
        ör :  6! = 6.5.4.3.2.1 = 720

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 20'den küçük bir tamsayı giriniz");
        int sayı = scanner.nextInt();

        long faktöryel = 1;
        System.out.print(sayı+"!= ");

        for (int i = sayı; i > 1 ; i--) {
            faktöryel  *= i;
            if (i != 1) {
                System.out.print(i+ " *");
            }else {
                System.out.print(i +" = ");
            }

        }
        System.out.println("Verilen sayının faktöryel değeri : "  +faktöryel);
        }


    }


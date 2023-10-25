package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class C01_Faktoryel {
    public static void main(String[] args) {
        // Soru 1-Kullanıcıdan 20'den küçük bir sayı alıp,
        //        bu sayının faktoryel değerini hesaplayın.
        //        5! =5*4*3*2*1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük pozitif bir tamsayı giriniz");
        int sayı = scanner.nextInt();

        int faktoryelSonuç =1;

        for (int i = sayı; i >=1 ; i--) {
            faktoryelSonuç *= i;
        }

        System.out.println("Verilen sayının faktöryel değeri : " + faktoryelSonuç );
    }
}
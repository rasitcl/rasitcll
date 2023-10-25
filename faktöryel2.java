package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class faktöryel2 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 20'den küçük bir tamsayı alıp,
        bu sayının faktöryel değerini hesaplayın.
        Konsolda faktöryel hesabının yapılışını da yazdırın.
        örnek : 5! = 5 * 4 * 3 * 2 * 1 = 120
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük bir pozitif tamsayı giriniz");
        int girilenSayı = scanner.nextInt();

        long faktöryelSonuç = 1;

        faktöryelSonuç = 1;

        System.out.print(girilenSayı+"! = ");

        for (int i = girilenSayı; i >= 1; i--) {
            faktöryelSonuç *= i;

            if (i!=1){
                System.out.print(i + " * ");
            }else {
                System.out.print(i + " = " );
            }
        }
        System.out.println(faktöryelSonuç);


    }



}

package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class C02_FaktoryelYazdırma {
    public static void main(String[] args) {
        //Soru 2-Kullanıcıdan 20'den küçük bir sayı alıp,
        //       bu sayının faktoryel değerini hesaplayın.
        //       Konsola faktoryel hesabının yapılışını da yazdırın.
        //       Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük pozitif bir tamsayı giriniz");
        int sayı = scanner.nextInt();

        long faktöryelSonuç=1;

        for (int i = sayı; i >= 1 ; i--) {
            faktöryelSonuç *= i;
            if (i != 1){
                System.out.println(i+ " * ");

            }else{
                System.out.println(i +" = ");
            }
        }

        System.out.println(faktöryelSonuç);
    }
}

package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class C1_FaktoryelHesaplama {
    public static void main(String[] args) {

        // Kullanıcıdan 20'den küçük bir sayı alıp,
        // bu sayının faktöryel değerini hesaplayın
        // 5! = 5*4*3*2*1


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük pozitif bir tamsayı yazınız");
        int sayı = scanner.nextInt();

        int faktöryelSonuç = 1;

        for (int i = sayı; i > 1; i--) {
            faktöryelSonuç *= i;
        }
        System.out.println("Verilen sayının faktöryel değeri : " + faktöryelSonuç);

    }
}

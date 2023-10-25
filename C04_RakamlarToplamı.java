package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class C04_RakamlarToplamı {
    public static void main(String[] args) {
        // Soru 7-Kullanıcıdan pozitif bir tamsayı alıp,
        //        rakamlar toplamını yazdırın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilensayı = scanner.nextInt();

        int rakamlarToplamı = 0;
        int rakam = 0;

        for (int i = girilensayı; i>0 ; i/=10) {

            rakam = i % 10;
            rakamlarToplamı += rakam;

        }

        System.out.println(girilensayı+  " sayının rakamlar toplamı : " + rakamlarToplamı);

        rakamlarToplamı =0;
        rakam =0;
        int basamaksayısı = (girilensayı+"").length();
        int sayı = girilensayı;

        for (int i = 1; i <= basamaksayısı ; i++) {

            rakam =sayı % 10 ;
            rakamlarToplamı += rakam;
            sayı /= 10;
        }
        System.out.println(girilensayı + "sayısının rakamlar toplamı : " + rakamlarToplamı);
    }
}

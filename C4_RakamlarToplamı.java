package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class C4_RakamlarToplamı {
    public static void main(String[] args) {

    /*
    Kullanıcıdan pozitif bir tamsayı alın, rakamlar toplamını yazdırın
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif tamsayı giriniz");
        int sayı = scanner.nextInt();

        int rakamlarToplamı = 0;
    int rakam = 0;
        for (int i = sayı; i > 0 ; i/=10) {
            rakam = i % 10;
            rakamlarToplamı +=rakam;
        }

        System.out.println(sayı + " sayısının rakamlar toplamı : "+ rakamlarToplamı);

        rakamlarToplamı =0 ;
        rakam = 0;
        int basamakSasyısı = (sayı+"").length();
        int sayı2 = sayı;

        for (int i = 1; i <= basamakSasyısı; i++) {
            rakam = sayı2 % 10;
            rakamlarToplamı += rakam;
            sayı2 /=10;

        }
        System.out.println(sayı + " sayının rakamlar toplamı : " + rakamlarToplamı);

    }
}

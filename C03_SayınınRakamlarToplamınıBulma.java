package day03_WrapperClasses_Matematikselİşlemler;

import java.util.Scanner;

public class C03_SayınınRakamlarToplamınıBulma {

    public static void main(String[] args) {

        // Kullanıcıdan 3 basamaklı bir tamsayı alıp
        // sayının rakamlar toplamını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen üç basamaklı bir pozitif tamsayı giriniz");
        int girilenSayı = scanner.nextInt();

        int rakamlarToplamı = 0;
        int rakam = 0 ;

        // girilen sayı : 257 , rakam : 0 , rakamlar topalmı : 0

        rakam = girilenSayı % 10 ; // 7
        rakamlarToplamı = rakamlarToplamı + rakam ; // 0 + 7 ==> 7
        girilenSayı = girilenSayı / 10 ; // 257 / 10 ==> 25,7 ==> 25

        // girilen sayı : 25 , rakam : 7 , rakamlar topalmı : 7

        rakam = girilenSayı % 10 ;
        rakamlarToplamı = rakamlarToplamı + rakam ;
        girilenSayı = girilenSayı / 10 ;

        // girilen sayı : 2 , rakam : 5 , rakamlar topalmı : 12

        rakam = girilenSayı % 10 ; // 2 % 10 ==> 2
        rakamlarToplamı = rakamlarToplamı + rakam ; // 12 + 2 ==> 14
        girilenSayı = girilenSayı / 10 ; // 2 / 10 ==> 0,2 ==> 0


    }
}

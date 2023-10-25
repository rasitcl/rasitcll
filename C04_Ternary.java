package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        //soru 3-Kullanıcıdan bir pozitif tamsayı alın
        //       sayının çift mi tek mi olduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayı = scanner.nextInt();
        //Ternary ile yazım
        System.out.println(sayı%2==0?"sayı çift":"sayı tek");
    }
}

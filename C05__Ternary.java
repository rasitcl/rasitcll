package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class C05__Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayı = scanner.nextInt();

        System.out.println(sayı % 2 == 0 ? "Sayı çift" : "Sayı tek");
    }
}

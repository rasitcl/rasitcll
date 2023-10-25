package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {
//KUllanıcıdan iki sayı alın ve büyük olmayan sayıyı yazdırn
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();
        System.out.println(sayı1 > sayı2 ? sayı2 : sayı1);
    }
}//ilk sonuç doğru çıkarsa ? tinden hemen sonraki ifade yazılır
//sonuç yanlış çıkarsa o zaman : dan sonraki ifade olur.

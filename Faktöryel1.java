package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class Faktöryel1 {
    public static void main(String[] args) {

       // Kullanıcıdan 20'den küçük bir sayı alıp,
        // bu sayının faktöryel değerini hesaplayın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük pozitif tamsayı giriniz");
        int sayı = scanner.nextInt();

        int faktöryelDeğer = 1;

        for (int i = sayı; i >= 1 ; i--) {
            faktöryelDeğer *= i;
        }
        System.out.println(sayı + " faktöryel değeri : "+ faktöryelDeğer);




    }
}

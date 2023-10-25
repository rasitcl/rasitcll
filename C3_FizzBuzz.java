package day09_ForLoopVeMethodOluşturma;

import java.util.Scanner;

public class C3_FizzBuzz {
    public static void main(String[] args) {

        /*
        Kullanıcıdan pozitif bir sayı alın,
        1'den başlayarak tüm tamsayıları yazdırın, sıra
        3 ile bölünebilen bir sayıya gelirse, sayı yerine Fizz,
        5 ile bölünebilen bir sayıya gelirse sayı yerine buzz,
        hem 3 hem 5 ile bölünebilen bir sayıya gelirse sayı yerine fizzBuzz yazdırın
           */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayı = scanner.nextInt();

        for (int i = 1; i < sayı ; i++) {
           if (i%3==0&&i%5==0){
               System.out.println("fizzbuzz ");
           } else if (i%3==0) {
               System.out.print("fizz ");
           } else if (i%5==0) {
               System.out.print("buzz ");
           }else {
               System.out.print(i + " ");
           }

        }



    }
}

package Java_Projeleri;

import java.util.Scanner;

public class C17_Proje {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
       int number;
        int total = 0;

        do {
            System.out.println("Sayı giriniz");
            number = scanner.nextInt();
            if (number % 2 == 1) {
                total += number;
            }
        }while (number > 0);

        System.out.println("Toplam : " + total);

       /* while (true) {
            System.out.println("Sayı giriniz");
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            if (number % 2 == 1) {
                total += number;
            }
        }

        System.out.println("Toplam : " + total); */

    }
}

package Java_Projeleri;

import java.util.Scanner;

public class C16_Proje {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number ; i++) {
           if (i % 2 == 0) {
               System.out.print(i + " ");
           }
        }

    }
}

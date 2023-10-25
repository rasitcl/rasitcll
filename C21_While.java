package Java_Dersleri1;

import java.util.Scanner;

public class C21_While {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);

            String a = scanner.nextLine();

            if (a.equals("q")) {
            break;
            }
            System.out.println(a);
        }

    }
}
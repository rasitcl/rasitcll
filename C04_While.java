package Java_Dersleri1;

import java.util.Scanner;

public class C04_While {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            System.out.println("Karekter giriniz");

            if (s.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(s.equals("Q")) {
                    System.out.println("Programdan çıkılıyor...");
                    break;
                }
            System.out.println("Karakter : "+ s);
        }
    }

    }

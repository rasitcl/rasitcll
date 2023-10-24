package Java_Projeleri;

import java.util.Scanner;

public class C04_Proje {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz : ");
        double value1 = scanner.nextDouble();

        System.out.print("2. Kenarı Giriniz : ");
        double value2 = scanner.nextDouble();

        double value3 = Math.sqrt((value1*value1) + (value2*value2));

        System.out.println("Hipotenüs : " + value3);

        // c*c = (a*a) + (b*b), Math.sqrt();


    }
}

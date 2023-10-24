package Java_Projeleri;

import java.util.Scanner;

public class C07_Proje {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Direnin yarıçap değerini giriniz : ");
        double r = scanner.nextDouble();
        double alan = (3.14) * r * r;
        double çevre = 2 * Math.PI * r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + çevre);


    }
}

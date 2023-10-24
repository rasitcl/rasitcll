package Java_Projeleri;

import java.util.Scanner;

public class C13_Proje {
    public static void main(String[] args) {
        // 4'e tam bölünecek
        // 100'ün katlarından 400'ün katları olanlar sayılacak



        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        double year = scanner.nextDouble();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " Artık Yıldır");
        }else {
            System.out.println(year + " Artık Yıl Değildir");
        }
    }
}

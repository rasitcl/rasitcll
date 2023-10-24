package Java_Projeleri;

import java.util.Scanner;

public class C08_Proje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("KM verisini giriniz : ");
        double km = scanner.nextDouble();

        double price = 10+ (km*2.20);

        price = (price < 20)? 20 : price;

       // if (price < 200) price = 20;
        System.out.println("Taksimetre : "+price);



    }
}

package Java_Projeleri;

import java.util.Scanner;

public class C12_Proje {
    public static void main(String[] args){
        double km = 0;
        double age = 0;
        double tripType = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        km = scanner.nextDouble();
        System.out.println("Yaşınızı giriniz : ");
        age = scanner.nextDouble();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) ");
        tripType = scanner.nextDouble();

     if (km > 0 && age > 0 && (tripType == 1 || tripType == 2)){
         double ticketPrice = km * 0.10;
         double ageDiscountPrice = 0;
         double ageDiscountRate = 0;
         double tripDiscount = 0;

         if (age < 12) {
             ageDiscountRate = 0.50;
         } else if (age >= 12 && age <= 24) {
             ageDiscountRate = 0.10;
         } else if (age > 65) {
            ageDiscountRate = 0.30;
         }
         ageDiscountPrice = ticketPrice * ageDiscountRate;
         double ticketDiscountPrice = ticketPrice - ageDiscountPrice;

         if (tripType == 2) {
             ticketDiscountPrice -= ticketDiscountPrice * 0.20;
            ticketDiscountPrice *= 2;
         }

         System.out.println("Toplam tutar = " + ticketDiscountPrice);
     }else {
         System.out.println("Hatalı veri girdiniz");
     }
    }
}

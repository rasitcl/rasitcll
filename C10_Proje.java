package Java_Projeleri;

import java.util.Scanner;

public class C10_Proje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Derece : ");
        double sıcaklık = scanner.nextDouble();
        String event = "";

        if (sıcaklık<5){
            event = "Kayak";
        } else if (sıcaklık>=5 && sıcaklık<15) {
            event = "Tiyatro";
        } else if (sıcaklık>=15 && sıcaklık<25) {
            event = "Mangal";
        } else  {
           event = "Yüzme";
        }

        System.out.println("Önerilen etkinlik : " + event);
    }
}

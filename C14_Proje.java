package Java_Projeleri;

import java.util.Scanner;

public class C14_Proje {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz : ");
        int age = scanner.nextInt();
        int result = age % 12;
        String animal = "";


        switch (result) {
            case 0:
                animal = " Maymun";
                break;
            case 1:
                animal =  " Horoz";
                break;
            case 2:
                animal = " Köpek";
                break;
            case 3:
                animal = " Domuz";
                break;
            case 4:
               animal = " Fare";
                break;
            case 5:
                animal = " Öküz";
                break;
            case 6:
                animal = " Kaplan";
                break;
            case 7:
                animal = " Tavşan";
                break;
            case 8:
                animal = " Ejderya";
                break;
            case 9:
                animal = " Yılan";
                break;
            case 10:
                animal = " At";
                break;
            case 11:
                animal = " Koyun";
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz : " + animal);

    }
}

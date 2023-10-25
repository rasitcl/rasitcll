package day06_Manipulations;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {

        // Kullanıcıdan bir cümle alın
        // cümlede ev geçiyorsa, " home home sweet home " yazdırın
        // ikisini de içeriyorsa "Hem ev lazım hem iş"
        // hiçbirini içermiyorsa "çok çalışman lazım" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();
        
        String büyükCümle = cümle.toUpperCase();
        
        if (büyükCümle.contains("EV") && büyükCümle.contains("İŞ")){
            System.out.println("Hem ev lazım hem iş");
        } else if (büyükCümle.contains("EV")) {
            System.out.println("home home sweet home");
        } else if (büyükCümle.contains("İŞ")) {
            System.out.println("çalışmak güzeldir");
        }else {
            System.out.println("çok çalışman lazım");
        }
    }
}

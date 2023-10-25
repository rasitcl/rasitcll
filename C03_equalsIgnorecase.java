package day06_Manipulations;

import java.util.Scanner;

public class C03_equalsIgnorecase {
    public static void main(String[] args) {
        //kullanıcı a yazarsa aile i yazarsa iş yazdırın bu harflerin dışında bir karekter girerse
        //bu harfi bilmiyorum yazın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf = scanner.next().charAt(0);
        // kullanıcı büyük ya da küçük harf girmiş olabişlir
        String hrf = harf+"";

        if (hrf.equalsIgnoreCase("a")){
            System.out.println("aile");
        } else if (hrf.equalsIgnoreCase("i")) {
            System.out.println("iş");
        }else {
            System.out.println("bu harf yok");
        }
    }

}

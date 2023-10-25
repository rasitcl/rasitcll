package day02_scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Soru 5- Kullanıcıdan ismini, soyismini ve yaşını alıp aşağıdaki formatta yazdırın.
        //         girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen İsminizi Giriniz");
        char ilkHarf = scanner.nextLine().charAt(0);

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yaş = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + ilkHarf +" "+soyisim+", "+yaş);



    }
}

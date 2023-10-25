package day02_scanner_DataCasting;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        //Soru 1- Kullanıcıdan üç farklı data türünde değer alıp,
        //        girilen değerleri açıklamalarıyla yazdırın.

        // adım 1- scanner objesi oluşturalım
        Scanner scanner = new Scanner(System.in);

        // adım 2- kullanıcıya ne istediğinizi söyleyin
        System.out.println("Lütfen isminizi giriniz");

        // adım 3- girilen bilgiye uygun bir variable oluşturup
        //         data türüne uygun next....() ile bilgiyi alıp kaydedin
        //String girilenİsim= scanner.next(); //sadece ilk ismi alır

        String girilenİsim = scanner.nextLine();



        // ikinci olarak bir tamsayı isteyelim mesela yaşını isteyelim

        System.out.println("Lütfen yaşınızı giriniz");
        int yaş = scanner.nextInt();




        // emekli misiniz? true / false

        System.out.println("Emekli misiniz ? true veya false olarak giriniz");
        boolean emekliMİ = scanner.nextBoolean();


        System.out.println("Girdiğiniz isim : " + girilenİsim);
        System.out.println("Yaşınız : " + yaş);
        System.out.println("Emekli misiniz : " + emekliMİ);


    }
}

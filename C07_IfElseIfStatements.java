package day04_ifStatemets;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {

        // Soru 6- Kullanıcıdan pozitif bir tamsayı isteyin
        //         sayı 3'e bölünüyorsa 3'e bölünüyor
        //         sayı 5'e bölünüyors 5'e bölünüyor
        //         sayı hem 3'e hem 5'e bölünüyorsa Süper Sayı"
        //         sayı ikisinede bölünmüyorsa "Geçersiz Sayı" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz");
        int tamsayı = scanner.nextInt();
          if (tamsayı % 3 ==0 && tamsayı % 5 == 0) {
              System.out.println("SÜPER SAYI");
          if
                  

              (tamsayı % 3 == 0  ) {
                  System.out.println("3'e bölünüyor");}
           }
           else
            if (tamsayı % 5 == 0 ) {
            System.out.println("5'e bölünüyor");

        }
        else{
            System.out.println("Geçersiz sayı");
        }

    }

    public static class C08_Ifelsestatements {


        public static void main(String[] args){

            // Soru 7- Kullanıcıdan boy ve kilosunu isteyin ve vücut kitle endeksini hesaplayın
            //         endeks : kg *10000 , cm*cm
            //         30' dan büyükaw OBEZ
            //         25-30 arası KİLOLU
            //         20-25 arası NORMAL
            //         20'den küçükse ZAYIF


            Scanner scanner = new Scanner(System.in);
            System.out.println("lütfen kg olarak kilonuzu giriniz");
            double kilo = scanner.nextDouble();

            System.out.println("Lütfen cm olarak boyunuzu giriniz");
            double boy = scanner.nextDouble();


            double vke = (kilo*10000 / (boy*boy));

                System.out.println("vücut kitle endeksiniz : " + vke);
            if (kilo<30 || kilo>200 || boy<30 || boy>220 || vke<10 || vke>50){
                System.out.println("geçersiz");
            }
            else if (vke>30){
                System.out.println("OBEZ");
            } else if (vke>25) {
                System.out.println("KİLOLU");

            } else if (vke>20){
                System.out.println("NORMAL");

            }
            else {
                System.out.println("ZAYIFSINIZ");
            }
        }

    }
}

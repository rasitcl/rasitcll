package day10_methodOluşturma;

import java.util.Scanner;

public class C02_maksimumSayıbulma {
    public static void main(String[] args) {
        
        // Kullanıcıdan method içerisinde üç sayı alıp bu 3 sayıdan 
        // en büyük olanı yazdıran bir method oluşturun

   enBüyükSayıyıYazdır();





    }

    public static void enBüyükSayıyıYazdır() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("En büyük sayıyı bulmak için, 3 adet sayı giriniz");
        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();
        double sayı3 = scanner.nextDouble();
    
        if (sayı1>sayı2 && sayı1>sayı3) System.out.println("En büyük sayı : " + sayı1);
        else if (sayı2>sayı1 && sayı2>sayı3) System.out.println("En büyük sayı : "+sayı2);
        else if (sayı3>sayı1 && sayı2>sayı3) System.out.println("En büyük sayı : "+sayı3);
        else System.out.println("En büyük sayıyı bulamadım");
        {

        }
    }
    }




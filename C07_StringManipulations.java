package day08_StringManipulations;

import java.util.Scanner;

public class C07_StringManipulations {

    public static void main(String[] args) {

        int flag = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen şifrenizi kaydediniz");

        String şifre = scanner.nextLine();

        char ilkHarf = şifre.charAt(0);

        if (!(ilkHarf>='a'&&ilkHarf<='z')){
            System.out.println("ilk karekter küçük harf olmalı");
            flag=11;
            char sonkarekter=şifre.charAt(şifre.length()-1);
            if (!(sonkarekter>='0'&&sonkarekter<='9')){
                System.out.println("son karekter rakam olmalı");
                flag=11;
            }
            if (şifre.contains(" ")) {
                System.out.println("hata içeren şifre boşluk olmamlı");
            }
            if (şifre.length()<10){
                System.out.println("şifrenin uzunluğu en az 10 karekter olmalı");
                flag=11;
            }
        }


    }
}

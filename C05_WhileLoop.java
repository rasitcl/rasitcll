package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan bir şifre isteyip,
        // aşağıdaki şartları kontrol edin ve
        // kullanıcıya düzeltmesi gereken tüm eksikleri söyleyin,
        // ve yeni değer isteyin eğer tüm şartları sağlarsa,
        // "şifre başarıyla kaydedildi" yazdırın
        // - ilk harf küçük harf olmalı
        // - son karakter rakam olmalı
        // - şifre boşluk içermemeli
        // - uzunluğu en az 10 karakter olmalı

        Scanner scanner = new Scanner(System.in);
        String şifre = " "; // şartları sağlamayan bir ilk değer ataması yaptık

        while (!şifreKontrolEt(şifre)) {

            System.out.println("Lütfen şifrenizi giriniz");
            şifre = scanner.nextLine();
        }
    }
    // bu class'da girilen şifreyi kontrol edip
    // uygun şifre ise true, uygun değilse false döndüren bir method oluşturalım

    public static boolean şifreKontrolEt(String şifre) {
        // flag kullanalım
        int flag = 10;

        // ilk harf küçük olmalı
        char ilkHarf = şifre.charAt(0);

        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("ilk karekter küçük harf olmalı");
            flag = 11;
        }
        // son karakter rakam olmalı
        char sonkarekter = şifre.charAt(şifre.length() - 1);
        if (!(sonkarekter >= '0' && sonkarekter <= '9')) {
            System.out.println("son karekter rakam olmalı");
            flag = 11;
        }


        // şifre boşluk içermemeli
        if (şifre.contains(" ")) {
            System.out.println("hata içeren şifre boşluk olmamlı");
        }


        // uzunluğu en az 10 karakter olmalı
        if (şifre.length() < 10) {
            System.out.println("şifrenin uzunluğu en az 10 karekter olmalı");
            flag = 11;
        }
        // bağımsız if cümlelerinden sonra
        // flag ya 10 değerinde olacak ya da 11
        if (flag == 10) {
            System.out.println("Şifreniz başarıyla kaydedildi");
            return true;
        } else {
            return false;
        }
    }
}
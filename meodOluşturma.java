package day09_ForLoopVeMethodOluşturma;

import java.util.Locale;

public class meodOluşturma {
    public static void main(String[] args) {
        String str = "Sevim bak kim gelmiş ?";

        str.toUpperCase();

        /*
        method bize bir sonuç döndürüyorsa 2 şekilde

        o sonucu kullanabiliriz

        sadece o satırda, sonucu görmek istiyorsanız,

        kalıcı bir değişiklik yapmayacaksınız

        direk yazdırabiliriz
         */


        System.out.println(str.toLowerCase());

        /*
        veya değişikliğn kalıcı olmasını istiyorsak

        yeni halini kaydedebiliriz
         */

        String strBüyükHarf=str.toUpperCase();

        System.out.println(str);
        System.out.println(strBüyükHarf);


    }
}

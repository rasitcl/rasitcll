package day06_Manipulations;

import java.util.Locale;

public class c01_touppercase {
    public static void main(String[] args) {
        String str = "Java Candır";
        System.out.println(str.toUpperCase());
        //tring methodları ile yapılan değişiklikler stringi kalıcı olarak değiştirmez
        System.out.println(str);
        //değişikleiklerin kalıcı olmasını isterseniz stringe atama yapmalısınız
        str=str.toUpperCase();
        //I yerine küçük harf seçtiğimizde i gelir türkçe karakter gelmesini istersek eğer
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));

    }
}

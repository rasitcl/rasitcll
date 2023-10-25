package day01_javaGiriş;

import java.util.Locale;

public class C04_NonprimitiveData {
    public static void main(String[] args) {
        int sayı = 10;
        String str = "Java Candır";
        System.out.println();
        System.out.println(str.toUpperCase(Locale.ROOT)); // JAVA CANDIR
        System.out.println(str); //Java Candır
        System.out.println(str.toLowerCase(Locale.ROOT)); // java candır


    }
}

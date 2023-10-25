package day09_ForLoopVeMethodOluşturma;

public class Replace {
    public static void main(String[] args) {

        String str = "Java candır";

        System.out.println(str.replace('a', 'q'));
        System.out.println(str.replace("Java", "Tava"));
        System.out.println(str.replace("Java", "x"));
        System.out.println(str.replace("x", "y"));
        System.out.println(str.replace("a", "e").replace("i", "a"));
        System.out.println(str.replace("i", "a").replace("a", "e"));


        // değişecek metin sadece ilk değer için değişsin diyorsak
        // replace() yerine replaceFirst() kullanılır

        System.out.println(str.replaceFirst("a", "x"));

        // regex : regular expressions : belirlenmiş kısaltmalar
        // ilk harfi * yapalım
        System.out.println(str.replaceFirst("\\w", "*"));

        // varsa ilk string içindeki ilk rakamı + yapalım
        str = "Java 44Candır";

        System.out.println(str.replaceFirst("\\d", "+"));
    }
}

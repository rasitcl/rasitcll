package day06_Manipulations;

public class ReplaceAll {
    public static void main(String[] args) {

        String str = "990087J1a5v**&^%$8a +/can809--=7dır_";

        // metindeki sayı ve karekterleri temizleyip
        // sadece harflerden oluşan "Java candır" şekline dönüştürün

        // tüm sayıları yok edelim
        str = str.replaceAll("\\d","");

        // space'i korumak için , space yerine bir rakam atayalım
        str = str.replaceAll("\\s","5");
        // özel karekterleri yok edelim
        str = str.replaceAll("\\W","");
        // W harf, rakam ve _'yi değiştirmez
        // _'yi yok etmek estersek alttaki satırı yazabiliriz
        str = str.replaceAll("_","");

        // space yerine yazdığımız sayıyı, yeniden space yapalım
        str = str.replaceAll("5"," ");

        System.out.println(str);

    }
}

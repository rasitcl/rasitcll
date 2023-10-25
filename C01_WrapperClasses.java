package day03_WrapperClasses_Matematikselİşlemler;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        int sayı = 20;
        String str = "Java";

        Integer sayı2 =30;

        sayı = sayı2;

        sayı2 = sayı;

        char chr1 = 'j';
        Character chr2 = chr1;

        Boolean bl = true;
        Short shr =3;
        Double dbl = 3.5;
        Float flt = 2.3f;

        // primitive data türleri ile o türün wrapper class'ı arasında geçiş mümkündür

        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Short.MIN_VALUE); //-32768

        String str1 = "34";
        String str2 = "45";

        // str1 ve str 2 nin değerlerini matematiksel olarak toplayın

        System.out.println(str1 + str2); // 3445

        System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2))); // 79

        str1 = "34a";
        str2 = "23";

        // System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2)));
        // NumberFormatException

        chr1 = 'a';
        System.out.println(Character.isDigit(chr1)); // false
        System.out.println(Character.isLetter(chr1)); // true
        System.out.println(Character.toUpperCase(chr1)); // A

        // int olarak verilen bir sayıyı, String'e nasıl çeviririz?

        String metin = 23 + "java";
        System.out.println(metin);
    }

}

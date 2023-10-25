package day06_Manipulations;

public class C02_Equals {
    public static void main(String[] args) {
        String str1 ="Java";
        String str2 ="java";
        String str3 ="Java";
        String str4 =new String("java");
        String str5 ="ja"+"va";
        String str6 ="ja";
        String str7 ="va";
        String str8 =str6+str7;
        //equals stringlerin case sensitive olarak eşitliğini kontrol eder
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str1.equals(str8));
        //equals sadece metinlere bakar
        //== hem metinlere hem de referanslara bakare
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str1==str5);
        System.out.println(str1==str8);


    }
}

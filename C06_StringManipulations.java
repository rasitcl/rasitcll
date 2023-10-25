package day08_StringManipulations;

public class C06_StringManipulations {

    public static void main(String[] args) {

        String fiyatstr1 = " 15,30 $";

        String fiyatstr2 = " 11,40 $";

        System.out.println( fiyatstr2 + fiyatstr1 );

        int fiyat1 = Integer.parseInt( fiyatstr1 . replaceAll("\\D", ""));

        int fiyat2 = Integer.parseInt( fiyatstr2 . replaceAll("\\D", ""));

        System.out.println("Toplam fiyat :"+ (double)(fiyat2+fiyat1)/100);





    }
}

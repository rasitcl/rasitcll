package day03_WrapperClasses_Matematikselİşlemler;

import java.sql.SQLOutput;

public class C05_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int a = 20 ;

        // a'nın değerini yazdırın
        // sonra a'nın değerini 1 artır ve oluşturacağınız b variable'ına yeni değeri atayın

        System.out.println("a : " + a);

        a += 1 ;
        int b = a ;

        System.out.println("işlem sonunda a : " + a + ", b : " + b);

        a = 20 ;
        // a'nın değerini b'ye atayın
        // sonra a'nın değerini 1 artırın

        System.out.println("işlem sonunda a : " + a + ", b : " + b);

        System.out.println("=====================");

        // bu anlatılan sadece ++ veya -- şeklindeki kullanım içindir

        a = 20 ;
        b = a++ ;
        System.out.println("a++ işlem sonunda a : " + a + ", b : " + b);

        a = 20 ;
        b = ++a ;
        System.out.println("++a işlem sonunda a : " + a + ", b : " + b);

        int c = 40 ;

        System.out.println("c++ ile yazdırınca : " + c++);
        System.out.println("c++ ile bir alt satırda c'nin değeri : " + c);

        c = 40 ;

        System.out.println("++c ile yazdırınca : " + ++c);
        System.out.println("++c ile bir alt satırda c'nin değeri : " + c);

    }



}

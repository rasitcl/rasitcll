package day03_WrapperClasses_Matematikselİşlemler;

public class C06_Concatenation {

    public static void main(String[] args) {

        String s1 = "Java" ;
        String s2 = "Kolaydır" ;
        String s3 = " " ;
        String s4 = "";

        int a = 4 ;
        int b = 3 ;

        // sadece verilen variable'ları kullanarak aşağıda istenen metinleri yazdırın

        // Java Kolaydır 12

        System.out.println( s1 + s3 + s2 + s3 + a * b );

        // Java7Kolaydır

        System.out.println( s1 + ( a + b ) + s2 ) ; // Java7Kolaydır

        // 43Java

        System.out.println( s4 + a + b + s1 ); // 43Java
        System.out.println( a + ( b + s1 )); // 43Java

        




    }
}

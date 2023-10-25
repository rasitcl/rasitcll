package day02_scanner_DataCasting;

public class C06_ExplicitlyNarrowing {

    public static void main(String[] args) {

        int sayı =  20;

        byte byt = (byte) sayı;
        System.out.println("20'nin byte olarak karşılığı : " + byt);
        // 20'nin byte olarak karşılığı : 20



        sayı = 130;
        byt = (byte)sayı;
        System.out.println("130'un byte olarak karşılığı : " + byt);
        // 130'un byte olarak karşılığı : -126


        sayı = 256;
        byt = (byte)sayı;
        System.out.println("256'nın byte olarak karşılığı : " + byt);
        // 130'un byte olarak karşılığı : 0


        sayı = 567;
        byt = (byte)sayı;
        System.out.println("567'nin byte olarak karşılığı : " + byt);
        // 567'nin byte olarak karşılığı : 55


        sayı = 640;
        byt = (byte)sayı;
        System.out.println("640'ın byte olarak karşılığı : " + byt);
        // 130'un byte olarak karşılığı : -128


        double dbl = 34.7;
        sayı = (int) dbl;

        System.out.println("34.7'nin int olarak değeri : " + sayı);
        // 34.7'nin int olarak değeri : 34

        /*
        String str = (String)sayı ;
        explicit casting her data türü için çalışmaz
        biz şimdilik sayısal primitive data türlerinde
        geniş değeri dar kapsamlı variable'a atamak için kullanıyoruz

        Non-primitive data türlerinde de olur
        ancak parent-child class'lar arasında geçerlidir
         */
    }
}

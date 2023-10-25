package day02_scanner_DataCasting;

public class C05_DataCasting {

    public static void main(String[] args) {

        int sayıInt = 34;
        String str  = "Java Candır";
        boolean bl  = true;
        char chr    = '%';
        double dbl  = 4.5;
        byte byt    = 10;
        short shrt  = 23;


        // Data casting : bir data türündeki variable'a başka data türünden değer atamaya denir

        // bl = sayıInt;
        // bl = str;
        // bl = chr;
        // boolean data türündeki bir variable'a sadece boolean değerler atayabiliriz

        // str = sayıInt;
        // str = bl;
        // str = chr;

        // sayısal değerler alan variable'lara başka sayısal data türlerindeki değerler ATANABİLİR Mİ?

        dbl = sayıInt;
        dbl = byt;
        dbl = shrt;
        dbl = chr;

        //sayıInt = dbl;
        sayıInt = shrt;
        sayıInt = byt;
        sayıInt = chr;

        //shrt = dbl;
        //shrt = sayıInt;
        shrt = byt;
        //shrt = chr;


    }
}

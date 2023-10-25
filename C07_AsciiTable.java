package day02_scanner_DataCasting;

import java.util.Scanner;

public class C07_AsciiTable {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';

        System.out.println(chr1 + chr2); // 97 + 98 = 195

        char chr3 = '1';
        char chr4 = '2';
        System.out.println(chr3 + chr4); // 49 + 50 = 99

        int sayı1 = chr1 ;
        /*

        char data türü özel bir duruma sahiptir
        Eğer char data türündeki bir değeri
        matematiksel işleme sokarsanız
        veya sayısal bir data türüne atama yaparsanız
        ASCİİ TABLE'daki değeri ile işleme girer

        */

        System.out.println("char 'a' nın int karşılığı : " + sayı1);
        // char 'a' nın int karşılığı : 97

        // kullanıcıdan bir char alıp
        // ascii table'da o karakterden sonra gelen 3 karakteri yazdırın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ascii table'dan bir karakter giriniz");
        char krk = scanner.next().charAt(0);

        System.out.println("girilen karakterden 1 sonraki karakter : "+(char)(krk + 1));
        System.out.println("girilen karakterden 2 sonraki karakter : "+(char)(krk + 2));
        System.out.println("girilen karakterden 3 sonraki karakter : "+(char)(krk + 3));
    }
}

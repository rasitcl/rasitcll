package day12_scope;

import java.io.FilterOutputStream;

public class C03_Scope_ClassVariables {
    String str ="Java";
    int sayı= 23;

    static boolean bl = true;
    static char chr = 'a';

    public static void main(String[] args){
       // static int a = 23;
       // System.out.println(str);
       // System.out.println(sayı);
        System.out.println(bl);
        System.out.println(chr);
    }

    public static  void staticMethod(){
       // static String s = "tava";
       // System.out.println(str);
       // System.out.println(sayı);
        System.out.println(bl);
        System.out.println(chr);
    }

    public void staticOlmayanMethod(){
        System.out.println(str);
        System.out.println(sayı);
        System.out.println(bl);
        System.out.println(chr);
    }

    /*
        Class level variable'lar class'ın içinde ama kod bloklarının dışında oluşturulur
        sonradan class'a bakıldığında ulaşılması kolay olsun diye class'ın başında oluşturulur

        Class level'da oluşturulan variable'ların scope'u BÜTÜN CLASS'DIR
        AMA class level variable'larda
        erişimi belirleyen SADECE scope değildir
        static KEYWORD de erişimde BELİRLEYİCİ bir role sahiptir

        static keyword'e sahip olan variable'lar tüm class içinden direk kullanılabilir

        static keyword kullanmayan variable'lar
        SADECE static keyword kullanmayan method'larda direk kullanılabilir
     */

}

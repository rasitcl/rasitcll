package day12_scope;

public class C02_Scope_LocalVariables {


    /*
        Bir method/kod içerisinde oluşturulan variable'lara local variable denir
        ve local variable'ların scopp'u içerisinde oluşturuldukları kod bloğudur.

        Loop'lar da bağımsız kod bloklarıdır
        loop içerisinde oluşturulan variable'ların scope'u
        içerisinde oluşturuldukları kod bloğu olan loop ile sınırlıdır
        yani loop içerisinde oluşturulan local variable'lar
        loop dışında KULLANILAMAZ
        */



    public static void main(String[] args) {

        int sayı = 20;
       // System.out.println(str);
        // System.out.println(bl);

        String s = "Hava";

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            String str = "Java";
            str += i;
            s+=i;
        }

       // System.out.println(str);
       // System.out.println(i);
        System.out.println(s);
    }
public static void staticMethod(){
   // System.out.println(sayı);
    String str = "Java";
   // System.out.println(bl);
}

public void staticOlmayanMethod(){
   // System.out.println(sayı);
   // str = "Tava";
    boolean bl = true;
}
}
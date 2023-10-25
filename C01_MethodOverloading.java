package day11_whileLoop_doWhileLoop;

public class C01_MethodOverloading {
    public static void main(String[] args) {

        /*
        Bir class'da ismi aynı ama signature'i farklı method'lar oluşturmaya
        Method OVERLOADİNG denir.

        Method overloading'in amacı aynı işlevi,
        farklı şekillerde kullanabilmektir

        Overloading'de isimler aynı olduğundan,
        aynı class'da birden fazla overloaded method yazabilmek için
        signature'ları değiştirmemiz GEREKLİDİR

        signature = method adı + parametrelerin data türleri
        toplama int int
        toplama int
        toplama int int int

        toplama double int
        tolama int double
        toplama float int
        toplama float double

        Java hangi method'u kullanamayacağına
        method call sırasında yazacağımız argument'lere göre karar verir

        1- argument sayısı == parametre sayısı
        2- argument data türleri ve sıralanışı == parametre data türleri ve sıralanışı
        3- argument'ler ile parametreler %100 uyumlu olmazsa
        casting ile çalıştırılabilir method var mı ? diye bakar
        casting ile çalıştırılabilecek birden fazla method varsa
        en az casting yaparak kullanılabileceğini tercih eder





         */

    String str = "Java candır";
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6));


        System.out.println(str.replace('a','b'));
        System.out.println(str.replace("can","Güzel"));



    }
}

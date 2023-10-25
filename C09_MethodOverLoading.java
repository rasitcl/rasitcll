package day10_methodOluşturma;

public class C09_MethodOverLoading {
    public static void main(String[] args) {

        /*
        Bir class'da aynı isim ve eşit sayıda parametre ile
        birden fazla method oluşturulabilir mi?

         */
    toplama(4,5);
    toplama(5,7);

    }



// Verilen iki integer sayıyı toplayıp yazdıran bir method oluşturun
public  static  void toplama(int a , double b){
    System.out.println("double ve int 2 sayının toplamı : "+ (a+b));

    }
public  static  void toplama(double a,double b){
    System.out.println("double ve int sayının toplamı : "+(a+b));
}

}

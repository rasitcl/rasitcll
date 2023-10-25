package day10_methodOluşturma;

public class C08_MethodOverloading {
    public static void main(String[] args) {

        toplama(5,7);

        toplama('a','b');

        //toplama(4.5,6.5);
    }


// Verilen iki integer sayıyı toplayıp yazdıran bir method oluşturun
    public static void toplama(int sayı1,int sayı2){
        System.out.println("İki in sayının toplamı : " + (sayı1+sayı2));
    }

}

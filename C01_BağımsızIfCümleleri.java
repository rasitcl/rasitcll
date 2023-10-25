package day04_ifStatemets;

public class C01_BağımsızIfCümleleri {

    public static void main(String[] args) {

        /*
            bağımsız if cümleleri kodun geriye kalanı ile ilgilenmez
            sadece kendi sattırına odaklanır

            birden fazla bağımsız if cümlesi varsa
            bütün if body'lerini çalıştıran durumlar olabileceği gibi
            a=230, b=45
            hiçbir if body'sinin çalışmayacağı durumlar da olabilir
            a=23, b44
     */


        int a = 23 ;
        int b = 42 ;

        // a b'den büyük mü?
        if ( a > b ){
            System.out.println("a b'den büyüky");

        }

        //a çift sayı mı?
        if (a % 2 == 0){
            System.out.println("a çift sayı");
        }

        //b 5 ile tam bölünebiliyor mu?
        if (b % 5 == 0){
            System.out.println("b 5 ile tam bölünür");
        }
        if (a >=100 && a<=999){
            System.out.println("a sayısı 3 basamaklı");
        }

        // a ile b'nin toplamı yüzden büyük
        boolean şart = a + b >100;
        System.out.println(şart); // false
        if (şart){
            System.out.println("a ile b'nin toplamı 100'den büyük");
        }
        if (true){
            System.out.println("Bu if body'si her zaman çalışır");

            if (false){
                System.out.println("Bu if body'si hiçbir zaman çalışmaz");

            }
        }
    }
}

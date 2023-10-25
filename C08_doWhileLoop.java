package day11_whileLoop_doWhileLoop;

public class C08_doWhileLoop {
    public static void main(String[] args) {

        /*
        While loop'u kullanıcıdan değer alınan
        ve/veya tekrar sayısı belli olmayan durumlarda kullanmayı tercih ediyoruz

        while loop'un 2 tane negatif yönü vardır
        1- loop öncesinde başlangıç değerini bizim atamamız gerekir
        kullanıcıfan değeri loop içinde alırız
        eğer ilk değer atamasında dikkat edilmezse
        hatalı bir değer atanabilir ve bu durumda loop çalışmayabilir

        2- kontrol işlemi başta yapılıp, body sonradan çalıştığı için
        konrol işlemi hep bir fazla yapılır
         */

        int sayı = 5;

        // verilen sayı (dahil) ile (hariç) arasındaki sayıları yazdırın

        while (sayı>3){
            System.out.println(sayı+ " ");
            sayı--;
        }
    // Java özellikle kullanıcıdan değer alırken
        // ilk değeri yanlış atamamamız için
        // bir alternatif olarak do-while loop'u oluşturmuştur
        // do-while loop'da önce işlem yapılır, sonra kontrol edilir

        sayı = 5 ;

        // verilen sayı(dahil) ile 3(hariç) arasındaki sayılar yazdırın
        do {

}while (sayı>3);


    }
}

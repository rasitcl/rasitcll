package day10_methodOluşturma;

public class C04_ToplaDöndür {
    public static void main(String[] args) {

        // Verilen 3 sayının toplamını
        // döndüren bir method oluşturun

    toplaDöndür(5,6,7);// bir sonuç döndüren method'lar
        // call edildiğinde
        // sonucu all edilen yere getirir bundan sonra
        // yapılacak şey kodu
        // yazan kşiye bağlıdır
        // 1- ya return edilen sonucu direk yazdırabilir
        // 2- ya da daha sonra kullanlmak üzere
        // bir variable'a atayabilir
        System.out.println(toplaDöndür(2,3,4));
    double toplam = toplaDöndür(6,9,1);
    }

    public static double toplaDöndür(double sayı1,double sayı2,double sayı3){
        double toplam = sayı1+sayı2+sayı3;
        return toplam;

    }



}

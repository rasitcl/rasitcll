package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class C03__NestedIfElse {
    public static void main(String[] args) {

        //Soru 1-Kullanıcıdan aldığı ürün adedi ve ürün fiyatını alın,
        //       kullanıcıya müşteri kartı olup olmadığını sorun.
        //       Müşteri kartı varsa
        //              10 ürün veya fazla alırsa % 20,
        //              10 üründen az alırsa %15 indirim yapın,
        //       Müşteri kartı yoksa
        //              10 ürün veya fazla alırsa %15,
        //              10 üründen az alırsa %10 indirim yapın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürün adedini giriniz");
        int ürünAdedi = scanner.nextInt();

        System.out.println("Lütfen ürün fiyatını giriniz");
        double ürünfiyatı = scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı ? \nE: Evet H: Hayır");
        char kartVarMı = scanner.next().toUpperCase().charAt(0);

        if (kartVarMı == 'E') {
            if (ürünAdedi>=10) {
                System.out.println("%20 indirimli toplam fiyat : " + ürünAdedi * ürünfiyatı * 80 / 100);
            }else {
                System.out.println("%15 indirimli toplam fiyat : " + ürünAdedi * ürünfiyatı * 85 / 100);
            }
        } else if (kartVarMı == 'H') {
            if (ürünAdedi>=10){
            System.out.println("%15 indirimli toplam fiyat : " + ürünAdedi * ürünfiyatı * 85 / 100);
            }else {
                System.out.println("%10 indirimli toplam fiyat : " + ürünfiyatı * ürünAdedi * 90 / 100);
            }
            }else {
            System.out.println("Kart bilgisini doğru giriniz");
        }
    }
}

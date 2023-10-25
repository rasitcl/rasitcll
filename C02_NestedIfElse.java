package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {
        //Soru 2- Kullanıcıdan aldığı ürün adedi ve fiyatını alın,
        //         müşteriye müşteri kartı olup olmadığını sorun kartı varsa,
        //         18 ürün ve daha fazla alırsa %20,
        //         10 üründen daha az alırsa %15 indirim,
        //         kartı yoksa
        //         10 ürün veya fazla alırsa %15
        //         10 üründen az %10 indirim yapın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürün adedini giriniz");
        int ürünadedi = scanner.nextInt();
        System.out.println("Lütfen ürün fiyatını giriniz");
        double ürünfiyatı = scanner.nextDouble();
        System.out.println("Müşteri kartınız var mı? \nE:Evet H:Hayır");
        char kartvarmı = scanner.next().toUpperCase().charAt(0);
        //Kartın olup olmaması ana değişkedn olsun
        if (kartvarmı == 'E') {
            if (ürünadedi >= 10)
                System.out.println("%20 indirimli toplam fiyat : " + ürünadedi * ürünfiyatı * 80 * 100);
        } else{
                System.out.println("%15 indirimli toplam fiyat : " + ürünadedi * ürünfiyatı * 85 * 100);
        } if (kartvarmı=='H') {
            if (ürünadedi>=10){
                System.out.println("%15 indirimli toplam fiyat : " + ürünadedi * ürünfiyatı * 85 * 100);
            }
            else {
                System.out.println("%10 indirimli toplam fiyat : " + ürünadedi * ürünfiyatı * 90 * 100);
            }
        } else{
            System.out.println("kart bilgisini doğru giriniz");
        }
    }
}

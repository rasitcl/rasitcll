package day10_methodOluşturma;

public class C06_AsalSayılarıBulma {
    public static void main(String[] args) {
        // bir önceki class'da oluşturulan method'u kullanarak
        // 3 basamaklı sayılardan asal olanları yazdırın
        for (int i = 100; i <1000 ; i++) {
            if (C05_AsalSayıMıDöndür.asalMıDöndür(i)){
                System.out.print(i + " ");
            }
        }

        System.out.println("");
    int sayaç =0;

        for (int i = 1000; i <10000 ; i++) {
            if (C05_AsalSayıMıDöndür.asalMıDöndür(i)){
                sayaç++;
            }
        }

        System.out.println("4 Basamaklı sayılardaki asal sayı adedi : "+ sayaç);
    }
}

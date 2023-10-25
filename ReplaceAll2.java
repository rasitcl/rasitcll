package day09_ForLoopVeMethodOluşturma;

public class ReplaceAll2 {
    public static void main(String[] args) {

        String str = "Arama sonucunda 1434 kelimeye ulaşıldı";

        // arama sonuçlarının 100'den fazla olduğunu test edin
        // 100'den fazla ise "Test Passed",
        // 100'den fazla değilse "Test Failed" yazdırın

        str = str.replaceAll("\\D","");

        int sonuçSayısı = Integer.parseInt(str);
        // parseInt() içinde sadece digit bulunan String'i
        // Integer'a dönüştürür

        if (sonuçSayısı > 100){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        System.out.println(str);
    }
}

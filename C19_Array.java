package Java_Dersleri1;

public class C19_Array {
    public static void main(String[] args) {

        /*
        Java'da diziler (arrays),
        aynı türden verilerin bir koleksiyonunu
        depolamak için kullanılan veri yapılarıdır.
        Diziler bir sabit boyuta sahiptir,
        yani oluşturduktan sonra boyutları değiştirilemez.
        İşte Java'da dizilerin temel kullanımı:
         */

        // Dizi oluşturmak için veri türünü ve
        // boyutunu belirtmeniz gerekir. Örneğin,
        // bir tamsayı dizisi oluşturalım:


        int[] sayiDizisi = new int[5]; // 5 elemanlı bir tamsayı dizisi oluşturur

        int[] sayiDizisi1 = {1, 2, 3, 4, 5}; // Elemanları başlangıç değerleri ile tanımlanan bir dizi

        int ikinciEleman = sayiDizisi[1]; // İkinci elemana erişim (diziler sıfırdan başlar)

        sayiDizisi[2] = 10; // Üçüncü elemanı 10 olarak güncelle


        // Döngüler, dizilerdeki elemanlara sırayla erişmek için sıkça kullanılır.
        // Örneğin for döngüsü:
        for (int i = 0; i < sayiDizisi.length; i++) {
            System.out.println(sayiDizisi[i]);
        }


        for (int sayi : sayiDizisi) {
            System.out.println(sayi);
        }


        // Java'da iki veya daha fazla boyutlu diziler de kullanılabilir.
        // Örneğin, 2x3'lük bir matris oluşturalım:
        int[][] matris = {{1, 2, 3}, {4, 5, 6}};


        int ikinciSatirUcuncuEleman = matris[1][2]; // 2. satır, 3. eleman












    }
}

package day01_javaGiriş;

public class C03_VariableOluşturma {
    public static void main(String[] args) {
        int sayı = 20;
        System.out.println(sayı); // 20
        System.out.println("sayı"); // sayı
        int sayı2;
        sayı2 = 30;
            /*
            java'da = işareti ATAMA işlemidir
            ='in solunda sadece variable olur

            ='in sağında ise değer olur
            java = işareti görünce
            önce sağ taraftaki değeri hesaplar
            bulduğu sonucu değer olarak soldaki variable'a atar
             */
            int a = 10 ;
            a = a + 20 ;
            a = 2 * a + 1 ;
            float sayıFL = 3.4F ;
            float sayı3 = 20f;
            float sayı4 = 6f;
        System.out.println(sayı3/sayı4); // 3.3333333
        double sayı5 = 20;
        double sayı6 = 3;
        System.out.println(sayı5 / sayı6); // 6.666666666666667

    }


}

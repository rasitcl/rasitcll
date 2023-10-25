package day11_whileLoop_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

         // 1'den 10'a kadar olan sayıları yazdırın

        for (int i = 1; i <10 ; i++) {
            System.out.println(i + " ");
        }

        System.out.println("");

        // soruyu while loop ile yapmak istersek
        // while loop'da
        //      - loop içinde kullanılacak variable,
        //      - bitiş şartı
        //      - artış/azalış yöntemini bizim yazmamız gerekilidir

        int sayı = 1;
        while (sayı <= 10){
            System.out.println(sayı+" ");
            sayı++;
        }

        // for loop sle yapılabilecek bir işlemi
        // for loop sle yapmak tercih edilir

    }
}

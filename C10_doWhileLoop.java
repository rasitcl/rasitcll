package day11_whileLoop_doWhileLoop;

public class C10_doWhileLoop {
    public static void main(String[] args) {

        int sayı = 10;

        // do-while loop ile sayıdan başlayıp, birer azaltarak
        // 3'e kadar olan sayıları yazdırın

        do {
            System.out.print(sayı + " ");
            sayı--;
        }while (sayı>3);


        System.out.println("");
        System.out.println("==============");
        sayı=2;
        System.out.println("do while loop ile : ");
        do {

            System.out.print(sayı + " ");
            sayı--;
        }while (sayı>3);


        System.out.println("");
        System.out.println("==============");
        // aynı soruyu while loop ile yapalım
        sayı = 2;
        System.out.println("while loop ile : ");
        while (sayı>3){

            System.out.println(sayı+ " ");
            sayı--;
        }
    }
}

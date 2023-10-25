package day12_scope;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // kullanıcıdan toplanmak üzere tamsayılar isteyin
        // toplam 500 olduğunda veya geçtiğinde işlemi durdurup
        // kaç sayı girildiğini ve toplamlarını yazdırın

        Scanner scanner = new Scanner(System.in);
        int sayı = 0;
        int toplam = 0;
        int sayaç =0;

        while (toplam<500){
            System.out.println("Lütfen toplamak üzere sayı giriniz");
            sayı = scanner.nextInt();
            toplam += sayı;
            sayaç++;
        }
        System.out.println(sayaç+" adet sayı girdiniz, sayıların toplam değeri : "+ toplam);




    }
}

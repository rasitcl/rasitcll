package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C11_DoWhileLoop {
    public static void main(String[] args) {


        // Kullanıcıdan bir pozitif sayı isteyin ,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise değeri, tam kare değişse uyarı yazdıeın.
        // Örnek Ç input : 16, output: 4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen tamkare olmasını kontrol etmek için bir tamsayı giriniz");
        int girilenSayı = scanner.nextInt();
        int karekök =1;

        do {
            if (karekök*karekök == girilenSayı){
                System.out.println("Girilen sayı bir tamkare. karekök değeri : "+ karekök);
            }
            karekök++;
        }while (karekök*karekök<= girilenSayı);
    }
}

package Day13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Arrays {
    public static void main(String[] args) {

        // Kullanıcıdan array'in boyutunu ve elemetlerini alıp
        // array'i oluşturan ve bize döndüren bir method oluşturun.

        String[] kullanıcıdanAlınanArray = stringArrayOluştur();

        System.out.println(Arrays.toString(kullanıcıdanAlınanArray));

    }

    public static String[] stringArrayOluştur() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'in uzunluğunu giriniz");
        int arrLenght = scanner.nextInt();

        String[] kullanıcıArrayi = new String[arrLenght]; // örn: 5 [null, null, null, null, null]
        scanner = new Scanner(System.in);
        for (int i = 0; i < kullanıcıArrayi.length; i++) {


            System.out.println("Array'e eklemek için bir isim söyleyin");
            kullanıcıArrayi[i] = scanner.nextLine();
        }

        return kullanıcıArrayi;
    }
}




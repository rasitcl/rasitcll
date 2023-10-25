package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {
    public static void main(String[] args) {

        int[] arr = {3,4,5};

        // Kullanıcıdan bir değer alıp, array'e ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen array'e eklemek için bir yamsayı giriniz");
        int eklenecekSayı = scanner.nextInt();

        arr = C02_ArrayeElemanEkleme.arrayeElemanEkle(arr,eklenecekSayı);

        System.out.println("Array'in yeni hali : " + Arrays.toString(arr));
    }
}

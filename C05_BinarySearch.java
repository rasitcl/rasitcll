package day14_Arrays;

import Day13_Arrays.C06_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {3,6,1,8,2,9,12,-1,4,3};

        // arr'de 5'in olup olmadığını ve varsa kaç tane olduğunu yazdırın
        C06_Arrays.elemanSayısıYazdır(arr,5); // Aranan eleman array'de yok

        // arr'de 3'ün olup olmadığını ve varsa kaç tane olduğunu yazdırın
        C06_Arrays.elemanSayısıYazdır(arr,3); // Aranan eleman array'de 2 kere kullanılmış

        String[] isimler = {"Esra", "İbrahim", "Hüseyin", "Ömer", "Azim"};
        // isimler'de Esra'nın olup olmadığını döndüren bir method oluşturun

        Arrays.sort(isimler);

        System.out.println(Arrays.binarySearch(isimler,"Esra")); // 1
        System.out.println(Arrays.binarySearch(isimler,"Azim")); // 0
        System.out.println(Arrays.binarySearch(isimler,"Ömer")); // 3

        // eleman varsa bize ilk uyan elemanın imdex'ini döndürür
        System.out.println(Arrays.binarySearch(isimler, "Ayça")); // -1
        System.out.println(Arrays.binarySearch(isimler,"Deniz")); // -3
    }
}

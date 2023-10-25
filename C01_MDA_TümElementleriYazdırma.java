package day15_multidimensionalArrays_arrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_MDA_TümElementleriYazdırma {
    public static void main(String[] args) {

        int[] arr1 = {3,4,6,8};

        // arr1'i yazdırın

        System.out.println(Arrays.toString(arr1)); //[3, 4, 6, 8]


        // arr1'in tüm elementlerini yazdırın

        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + " ");
        }// 3 4 6 8
        System.out.println("");

        int[][] arr2 = {{1,4,7},{3,5},{1,9,0,8},{2}};

        // arr2'yi yazdırın
        System.out.println(Arrays.deepToString(arr2));// [[1, 4, 7], [3, 5], [1, 9, 0, 8], [2]]

        // arr2'nin tüm elementlerini yazdırın

        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                System.out.print(arr2[i][j]+" ");
            }
        } // 1 4 7 3 5 1 9 0 8 2
    }
}

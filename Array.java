package Java_Dersleri04;

import org.intellij.lang.annotations.JdkConstants;

import java.util.Scanner;

public class Array {
    public static void mean(int[] arr){

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Ortalama : " + (double)total / arr.length);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr2 = new int[5];

        System.out.println("Array 2'nin değerlerini girin...");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
       mean(arr2);
    }
}

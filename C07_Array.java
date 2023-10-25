package Java_Dersleri1;

import java.util.Scanner;

public class C07_Array {
    public  static void mean(int[] arr1){
        int total =0;
        for (int i = 0; i < arr1.length ; i++) {
            total += arr1[i];
        }
        System.out.println("Ortalama : "+ (double)total/arr1.length);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Array'in değerlerini girin...");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
      mean(arr);
    }
}

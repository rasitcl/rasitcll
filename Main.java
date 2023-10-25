package Java_Dersleri1;

import java.util.Scanner;

public class Main {
    public static void mean(int[] arr){
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total+= arr[i];
        }
        System.out.println("Ortalama: "+(double)total/arr.length);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr2 = new int[5];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
    System.out.println( "Array2'nin değerleri yazılıyor...");

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Eleman: "+ arr2[i]);
        }

mean(arr2);



    }


}

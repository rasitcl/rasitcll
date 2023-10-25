package day08_StringManipulations;

import java.util.Scanner;

public class bağımsızifcümleleri1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı gviriniz");
        int a = scanner.nextInt();
        if (a % 5 == 0){
            System.out.println("satı 5'in tam katı");
        }
    }
}

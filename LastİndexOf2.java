package Day07_StringManipulations;

import java.util.Scanner;

public class LastİndexOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();

        System.out.println("Lütfen aranan metni giriniz");
        String metin = scanner.nextLine();

        int ilkİndex= cümle.indexOf(metin);
        int sonİndex = cümle.lastIndexOf(metin);

        if (ilkİndex==-1){
            System.out.println("Cümle aranan metni içermiyor");
        } else if (ilkİndex==sonİndex) {
            System.out.println("Cümlede aranan metin bir kere kullanılmış");

        }else {
            System.out.println("Cümlede aranan metin 1'den fazla kullanılmış");
        }

    }
}

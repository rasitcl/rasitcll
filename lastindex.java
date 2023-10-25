package Day07_StringManipulations;

import java.util.Scanner;

public class lastindex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();

        System.out.println("lütfen aranan metni giriniz");
        String metin = scanner.nextLine();

        int ilkindex = cümle.indexOf(metin);
        int sonindex = cümle.lastIndexOf(metin);
        if (ilkindex==-1){
            System.out.println("cümle aranan metni içermiyor");
        } else if (ilkindex==sonindex) {
            System.out.println("cümlede aranan metin sadece bir kere kullanılmış");
        }else {
            System.out.println("cümlede aranan metin birden fazla kullanılmış");
        }
    }
}

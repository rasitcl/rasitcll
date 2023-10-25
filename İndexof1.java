package Day07_StringManipulations;

import java.util.Scanner;

public class İndexof1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();

        System.out.println("Lütfen aranan metni giriniz");
        String metin = scanner.nextLine();
        int ilkİndex= 0;
        int ikinciİndex= 0;
        int üçüncüİndex= 0;

        ilkİndex = cümle.indexOf(metin);

        if (ilkİndex==-1){
            System.out.println("Cümle aranan metni içermiyor");
        } else if ((ikinciİndex=cümle.indexOf(metin,ilkİndex+1))==-1) {
            System.out.println("cümlede aranan metin 1 defa kullanılmış");

        }else {
        }
        üçüncüİndex=cümle.indexOf(metin,ikinciİndex+1);
        if (üçüncüİndex==-1){
            System.out.println("Cümlede aranan metin 2 defa kullanılmış");
        }else  {
            System.out.println("Cümlede aranan metin 2'den fazla kullanılmış");
        }


    }
}

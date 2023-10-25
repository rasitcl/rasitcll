package Day07_StringManipulations;

import java.util.Scanner;

public class C02_İndexOf {
    public static void main(String[] args) {

           //verilen bir cümlede
          // aranan bir metin için aşağıdaki cümlelerden
         // uygun olanı yazdıracak bir program yazdırınız
         // - Cümle aranan metni içermiyor
         // - Cümlede aranan metin sadece 1 kere kullanılmış
         // - Cümlede aranan metin sadece 2 kere kullanılmış
         // - Cümlede aranan metin 2'den fazla kullanılmış

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cümle = scanner.nextLine();

        System.out.println("Lütfen aranan metni giriniz");
        String metin = scanner.nextLine();

        int ilkİndex = 0;
        int ikinciİndex = 0;
        int üçüncüİndex = 0;

        ilkİndex = cümle.indexOf(metin); // -1 veya kullanılan index

        if (ilkİndex == -1){
            System.out.println("Cümle aranan metni içermiyor");
        } else if ((ikinciİndex = cümle.indexOf(metin,ilkİndex+1))==-1) {
         // ilk index -1 değil , ikinci index -1
            System.out.println("Cümlede aranan metin sadece bir kere kullanılmış");
        }else {
            //ilk index -1, ikinci index -1 değil
            // şimdiki sorumuz sadece 2 tane mi var , yoksa 2'den fazla mı?
            üçüncüİndex = cümle.indexOf(metin,ilkİndex+1);
            // üçüncüİndex == -1 veya var oaln bir index

            if (üçüncüİndex == -1){
                //ilk index -1 değil , ikinci index -1 değil ama üçüncü index -1
                System.out.println("Cümlede aranan metin sadece 2 kere kullanılmış");
            }else {
                // ilk index -1 değil , ikinci indedx -1 değil , üçüncü index -1 değil
                System.out.println("Cümlede aranan metin 2'den fazla kullanılmış");
            }
        }

        }
    }


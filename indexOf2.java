package Day07_StringManipulations;

import java.util.Scanner;

public class indexOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("lütfen aranan metni giriniz");
        String metin = scanner.nextLine();

        int ilkindex = 0;
        int ikinciindex =0;
        int üçüncüindex =0;

        ilkindex = cumle.indexOf(metin);

        if (ilkindex == -1){
            System.out.println("aranan metin yoh");
        } else if ((ikinciindex =cumle.indexOf(metin,ilkindex+1))==-1) {
            System.out.println("cümlede aranan metin bir kere kullanılmış");
        }else {
            üçüncüindex=cumle.indexOf(metin,ikinciindex+1);
            if (üçüncüindex==-1){
                System.out.println("cümlede araanan metin iki kere kullanmış");
            }else {
                System.out.println("cümlede araanan metin ikiden fazlaa kullanmış");
        }
            // BEN SENİ SEVERİM SANA YEMİN EDERİM

    }
}
    }

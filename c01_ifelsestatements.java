package day05_nestedıfelse_nestery_switch;

import java.util.Scanner;

public class c01_ifelsestatements {
    public static void main(String[] args) {
        /*
         Kullanıcıdan yaşını ve cinsiyetini alıp, kullanıcının emekli olup olamayacağını söyleyin
         kanın için 60 yaş erkek için 65 yaş.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz E:Erkek, K:Kadın");
        char cns = scanner.next().toUpperCase().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        double yaş = scanner.nextDouble();
        if (yaş < 20 || yaş > 80 || !(cns == 'E' || cns == 'K')) {
            System.out.println("Girilen bilgilerde hata var");
        } else if (cns=='E'&&yaş>=65) {
            System.out.println("Emekli olabilirsiniz");
        } else if (cns=='K'&&yaş>=60) {
            System.out.println("EMEKLİ OLABİLİRSİNİZ");
        } else if (cns=='E'&&yaş<65) {
            System.out.println("beklenecek yıl "+(65-yaş));
        } else if (cns=='K'&&yaş<60){
            System.out.println("beklenecek yıl "+(60-yaş));
        }

    }

}



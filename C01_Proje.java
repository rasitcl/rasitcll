package Java_Projeleri;

import java.util.Scanner;

public class C01_Proje {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double fizik, matematik, türkçe, kimya, müzik, tarih;

        System.out.print("Fizik Notunuz : ");
        fizik = scanner.nextInt();

        System.out.print("Matematik Notunuz : ");
        matematik = scanner.nextInt();

        System.out.print("Türkçe Notunuz : ");
        türkçe = scanner.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = scanner.nextInt();

        System.out.print("Müzik Notunuz : ");
        müzik = scanner.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = scanner.nextInt();

        double sonuç = (fizik + matematik + türkçe + kimya + müzik + tarih) / 6;

        System.out.print("Ortalamanız : " + sonuç);

        System.out.print(sonuç >= 50 ? " Geçtin" : " Kaldın");


    }
}

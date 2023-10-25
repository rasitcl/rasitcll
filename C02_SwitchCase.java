package Java_Dersleri1;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000;
        int işlem;

        System.out.println("1: Para Görüntüle");
        System.out.println("2: Para Yatırma");
        System.out.println("3: Para Çekme");
        System.out.println("4: Sistemden Çıkış");

        işlem = scanner.nextInt();


            switch (işlem) {
                case 1:
                    System.out.println("Bakiyeniz: " + bakiye + "tl dir");
                    break;
                case 2:
                    System.out.println("Ne kadar yatıracaksınız?");
                    int miktar = scanner.nextInt();

                    bakiye += miktar;
                    System.out.println("Bakiyeniz: " + bakiye + "tl dir");
                    break;
                case 3:
                    System.out.println("Ne kadar çekeceksiniz");
                    miktar = scanner.nextInt();

                    bakiye -= miktar;
                    System.out.println("Bakiyeniz: " + bakiye + "tl dir.");
                    break;
                case 4:
                    System.out.println("Sistemden çıkılıyor");
                    break;
                default:
                    System.out.println("Geçersiz işlem");
                    break;


            }


        }
    }

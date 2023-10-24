package Java_Projeleri;

import java.util.Scanner;

public class C15_Proje {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum tarihiniz ay olarak : ");
        int mount = scanner.nextInt();



        if (mount > 0 && mount <= 13) {
            System.out.println("Doğum tarihiniz gün olarak : ");
            int day = scanner.nextInt();


            if (mount == 1) {
                if (day >= 1 && day <= 31){
                }
                if (day <= 21) {
                    System.out.println("Burcunuz : Oğlak");
                } else {
                    System.out.println("Burcunuz : Kova");
                }
            }else {
                System.out.println("Hatalı bir giriş yaptınız lütfen tekrar deneyiniz.");
            }


            if (mount == 2) {
                if (day >= 1 && day <= 28) {
                }
                if (day <= 19) {
                    System.out.println("Burcunuz : Kova");
                } else {
                    System.out.println("Burcunuz : Balık");
                }
            }else {
                    System.out.println("Hatalı bir giriş yaptınız lütfen tekrar deneyiniz.");
                }


                if (mount == 3) {
                    if (day >= 1 && day <= 31){
                    }
                    if (day <= 20) {
                        System.out.println("Burcunuz : Balık");
                    } else {
                        System.out.println("Burcunuz : Koç");
                    }
                }else {
                    System.out.println("Hatalı bir giriş yaptınız lütfen tekrar deneyiniz.");
                }


            } else {
                System.out.println("Hatalı bir giriş yaptınız lütfen tekrar deneyiniz.");
            }
        }
    }


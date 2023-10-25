package Java_Dersleri1;

public class DoWhile {
    public static int main(String[] args) {

        int sayi = 1;

        do {
            System.out.println("Bir sayı girin: ");

            // Kullanıcı sıfır girene kadar döngü devam eder
        } while (sayi != 0);

        System.out.println("Döngüden çıkıldı. Program sonlandırılıyor.");

        return sayi ;
    }

}

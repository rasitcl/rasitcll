package Day13_Arrays;

public class C05_EnUzunKelime {
    public static void main(String[] args) {

        // Verilen String bir array'deki
        // en uzun ve en kısa kelimeleri yazdıran bir method oluşturun.

        String[] isimler = {"Zehra", "Ali", "Muhammed", "Hüseyin", "Mehmet", "Esra", "Ercan", "Ömer"};

        enUzunEnKısaYazdır(isimler);
    }

    public static void enUzunEnKısaYazdır(String[] arr) {

        String enKısaİsim = arr[0];
        String enUzunİsim = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > enUzunİsim.length()) {
                enUzunİsim = arr[i];

            }
            if (arr[i].length() < enKısaİsim.length()) {
                enKısaİsim = arr[i];
            }
        }
        System.out.println("en uzun isim : "+ enUzunİsim);
        System.out.println("en kısa isim : "+ enKısaİsim);
    }
}
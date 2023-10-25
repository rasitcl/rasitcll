package Java_Dersleri1;

public class C17_Override {
    static class UstSinif {
        // Üst sınıfta tanımlanan bir metot
        void merhabaDe() {
            System.out.println("Merhaba, ben üst sınıftan geliyorum!");
        }
    }

    static class AltSinif extends UstSinif {
        // Üst sınıftaki metodu geçersiz kılan ve özel işlevsellik ekleyen metot
        @Override
        void merhabaDe() {
            System.out.println("Merhaba, ben alt sınıftan geliyorum!");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            UstSinif ustSinifObje = new UstSinif();
            AltSinif altSinifObje = new AltSinif();

            ustSinifObje.merhabaDe(); // Üst sınıfın metodu çağrılır
            altSinifObje.merhabaDe(); // Alt sınıfın geçersiz kıldığı metodu çağrılır
        }
    }

}

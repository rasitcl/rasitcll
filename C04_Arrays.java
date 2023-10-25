package Day13_Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        // Verilen String bir array'de
        // istenen harfi içeren elementleri yazdırın

        String [] isimler = { "Hüseyin", "Mehmet", "Esra", "Ercan", "Ömer"};
        String istenenHarf = "e";


        for (int i = 0; i < isimler.length; i++) {


        if (isimler[i].contains(istenenHarf)){
            System.out.println(isimler[i]+" ");
        }
        }
    }
}

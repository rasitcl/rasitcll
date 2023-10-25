package Java_Dersleri1;

import java.util.ArrayList;

public class C18_ArrayList {


    public static class ArrayListOrnegi {
        public static void main(String[] args) {
            // String türünde elemanları içeren bir ArrayList oluşturmak
            ArrayList<String> arrayList = new ArrayList<>();

            // Eleman eklemek
            arrayList.add("Java");
            arrayList.add("Python");
            arrayList.add("C++");

            // Elemanları ekrana yazdırmak
            System.out.println("ArrayList Elemanları:");
            for (String dil : arrayList) {
                System.out.println(dil);
            }

            // Belirli bir indekse eleman eklemek
            arrayList.add(1, "JavaScript");

            // Belirli bir indeksteki elemanı değiştirmek
            arrayList.set(0, "TypeScript");

            // Elemanları ekrana yazdırmak
            System.out.println("\nGüncellenmiş ArrayList Elemanları:");
            for (String dil : arrayList) {
                System.out.println(dil);
            }

            // Belirli bir indeksteki elemanı silmek
            arrayList.remove("Python");

            // Elemanları ekrana yazdırmak
            System.out.println("\nSilinmiş ArrayList Elemanları:");
            for (String dil : arrayList) {
                System.out.println(dil);
            }

            // ArrayList'in boyutunu almak
            int boyut = arrayList.size();
            System.out.println("\nArrayList Boyutu: " + boyut);

            // ArrayList'teki elemanları kontrol etmek
            boolean javaVarMi = arrayList.contains("Java");
            System.out.println("\nJava ArrayList'te Var mı? " + javaVarMi);

            // ArrayList'i temizlemek
            arrayList.clear();

            // ArrayList'in boş olup olmadığını kontrol etmek
            boolean bosMu = arrayList.isEmpty();
            System.out.println("\nArrayList Boş mu? " + bosMu);
        }
    }
}

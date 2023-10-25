package day14_Arrays;

import java.util.Arrays;

public class C04_ArraysSort {
    public static void main(String[] args) {

        int[] arr1 = {3,9,0,1,12,87,4,6};

        System.out.println(Arrays.toString(arr1)); // [3, 9, 0, 1, 12, 87, 4, 6]

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1)); // [0, 1, 3, 4, 6, 9, 12, 87]

        String[] arr2 = {"İbrahim", "Hüseyin", "Hasan", "İsmail", "İshak", "israfil", "isa"};
        // [Hasan, Hüseyin, İbrahim, İsa, İshak, İsmail, İsrafil]

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));

        // ascii değerleri sebebiyle küçük harfler sıralamada
        // büyük harflerden sonra gelir

        // String'lerde sadece method çalışınca yapılan değişiklikler kalıcı olmaz
        // değişikliklerin kalıcı olması için atama yapmalıyız
        // Bu durum String'den kaynaklanan özel bir durumdur(immutable class)
        String isim = "Ali";
        isim.toUpperCase();
        System.out.println(isim); // Ali
    }
}

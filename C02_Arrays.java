package Day13_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayı = 10;

        int[] arr = {4,6,1,2};

        // Bu array'i yazdıralım

        System.out.println(sayı); // 10

        System.out.println(arr); // [I@58ceff1

        // Array'ler direk yazdırılamaz
        // direk yazdırmak isterseniz, array'i değil referansını yazdırır

        // Array'i yazdırmak için Arrays class'ından yardım almalıyız

        System.out.println(Arrays.toString(arr)); // [4, 6, 1, 2]

        String[] kelimeler = {"Ali", " okula", " gitti."};
        System.out.println(Arrays.toString(kelimeler)); // [Ali,  okula,  gitti.]


        // Array'in tüm elementlerini yazdırın
        System.out.println(arr[0]); // 4
        System.out.println(arr[1]); // 6
        System.out.println(arr[2]); // 1
        System.out.println(arr[3]); // 2
        System.out.println("===========");

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }// 4 6 1 2

        /*
            Biz ne zaman array'in tüm elementleri ile ilgili bir işlem yapmak isrersek
            bir dor loop oluşturup
                    arr[1]
            üzerinden istenen işlemleri yapabiliriz

         */


    }
}

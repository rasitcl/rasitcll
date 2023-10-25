package day06_Manipulations;

public class StringManipulations2 {
    public static void main(String[] args) {

        // Kullanıcıdan belirli bir formatta verdiği String fiyatları toplayıp yazdırın.
        // input1 : "15.35 €" , input2 : "11.40 €"
        // output : 26.75 €

        String fiyatstr1 = "15.35 €";
        String fiyatstr2 = "11.40 €";

        System.out.println(fiyatstr1 + fiyatstr2);

        int fiyat1 = Integer.parseInt(fiyatstr1.replaceAll("\\D",""));
        int fiyat2 = Integer.parseInt(fiyatstr2.replaceAll("\\D",""));

        System.out.println("Toplam fiyat : " + (double)(fiyat1+fiyat2)/100 + " €");
    }
}

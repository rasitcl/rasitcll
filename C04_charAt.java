package day06_Manipulations;

public class C04_charAt {
    public static void main(String[] args) {
        String str ="java gün geçtikçe güzelleşiyor.";
        //İLK HARFİ YAZDIRIN
        System.out.println(str.charAt(0));// J
        System.out.println(str.charAt(4));// space

        //str'da 31 karekter var
        //son karakter olan .'nın indeksi 30 olur

        //son karekteri yazdırın
        System.out.println(str.charAt(31 -1));// .

        //sondan 5. karekteri yazdırın
        System.out.println(str.charAt(31-5)); // i
        // str'daki olmayan bir indexi istersek
        // System.out.println(str.charAt(44));//StringIndexOutOfBoundsException
    }
}

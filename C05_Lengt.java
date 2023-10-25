package day06_Manipulations;

public class C05_Lengt {

    public static void main(String[] args) {

        String str = "java öğrenen işsiz kalma.";

        System.out.println(str.length()); // 26

        // sondan 2. karekteri yazın

        // System.out.println(str.charAt(26-2)); // z

        System.out.println(str.charAt(str.length()-2)); // v

        // kodlamada dinamik kod yazmak önemlidir dinamik kod bilgileri alıp

        // input değilse bile çalışmaya devam eden kod demektir

        // metinini son karekterini yazdırın

        System.out.println(str.charAt(str.length()-1));// a

        str = "java güzeldir.";

        System.out.println(str.charAt(str.length()-1));//.
    }
}

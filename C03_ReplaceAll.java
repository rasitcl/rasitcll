package day08_StringManipulations;

public class C03_ReplaceAll {
    public static void main(String[] args) {
        String a = "Arama sonucunda 1434 kelimeye ulasildi";
        a=a.replaceAll("\\D","");
        int sonuc=Integer.parseInt(a);
        if (sonuc>100){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

    }
}

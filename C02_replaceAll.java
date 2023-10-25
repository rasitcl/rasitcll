package day08_StringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String a = "J1a5v8******a_ +/can8------7dir";
        a=a.replaceAll("\\d", "");
        a=a.replaceAll("\\s","5");
        a=a.replaceAll("\\W", "");
        a=a.replaceAll("\\_","");
        a=a.replaceAll("5"," ");
        System.out.println(a);

    }
}

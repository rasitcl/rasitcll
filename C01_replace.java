package day08_StringManipulations;

public class C01_replace {
    public static void main(String[] args) {
        String a = "Arsen Lüpen";
        System.out.println(a.replace('e', 'q'));
        System.out.println(a.replace("Arsen", "Fabio"));
        System.out.println(a.replace("Lüpen", "X"));
        System.out.println(a.replace("x", "y"));
        System.out.println(a.replace("A", "e").replace("n", "r"));
        System.out.println(a.replace("n", "c").replace("c", "x"));
        System.out.println(a.replaceFirst("e", "o"));
    }
}

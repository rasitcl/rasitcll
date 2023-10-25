package Day07_StringManipulations;

public class indexOf {
    public static void main(String[] args) {
        String str = "java candır, selenium heyecan.";
        System.out.println(str.contains("selenium"));
        System.out.println(str.endsWith("selenium"));
        System.out.println(str.startsWith("selenium"));
        System.out.println(str.indexOf("selenium"));
        System.out.println(str.indexOf("x"));
        System.out.println(str.indexOf("q"));
        System.out.println(str.indexOf("a"));
        if (str.indexOf("java")==-1){
            System.out.println("false");
        }else {
            System.out.println("true");
        }
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("a", 2));
        System.out.println(str.indexOf("a", 4));
        if (str.indexOf("a",7)==-1){
            System.out.println("str sadece 3 tane a içeriyor");
        }else {
            System.out.println("4. a nın indexi : " +str.indexOf("a",7));
        }
        if (str.indexOf("a",28)== -1){
            System.out.println("str sadece 4 tane a içeriyor");
        }else {
            System.out.println("5. a nın indexi : "+ str.indexOf("a",28));
        }
    }
}

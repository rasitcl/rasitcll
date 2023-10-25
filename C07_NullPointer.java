package Day07_StringManipulations;

public class C07_NullPointer {
    public static void main(String[] args) {

        String a = null;
        System.out.println(a);
        // null değer atanmak üzere bırakmak için kullanılır
        a = "JAva";
        System.out.println(a);
        // JAva
       // null değeri atanan bir şey içi method kullanılmaz
    }
}

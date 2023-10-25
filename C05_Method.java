package Java_Dersleri1;

public class C05_Method {

    public  static void toplma(int a, int b, int c){
        System.out.println("Toplamları : "+ (a+b+c));
    }
    public  static void toplma(int a, int b){
        System.out.println("Toplamları : "+ (a+b));
    }
    public  static void toplma(int a, int b, int c, int d){
        System.out.println("Toplamları : "+ (a+b+c+d));
    }
public static void main(String[] args){
        toplma(3,4,5);
        toplma(2,4,8,90);
        toplma(755,824);
}
}

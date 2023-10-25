package day06_Manipulations;

public class C06_substring {

    public static void main(String[] args) {

        String str = "Java en güzel programlama dili";
        System.out.println(str.substring(5)); //en güzel programlama dili
        System.out.println(str.substring(0)); //Java en güzel programlama dili
        System.out.println(str.substring(1)); //ava en güzel programlama dili
        System.out.println(str.substring(str.length()-4));
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(8,13));
        String index6dakiHarf = str.substring(6,7);
        System.out.println(index6dakiHarf);
        System.out.println("baş indexi ve bitiş indexi aynı olursa:"+str.substring(5,5)+"____");

    }
}

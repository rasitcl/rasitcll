package Java_Dersleri1;

import java.util.ArrayList;

public class C20_ArrayList {
    public static void main(String[] args) {

        ArrayList<String>a=new ArrayList<String>();

        a.add("Tokat");
        a.add("Sivas");
        a.add("Şenyurt");

        System.out.println(a.size()); // 3

        System.out.println(a.remove("Sivas")); // true
        // TokatŞenyurt

        for (int i = 0; i < a.size() ; i++) {
            System.out.print(a.get(i));
            // TokatSivasŞenyurt
        }

    }
}

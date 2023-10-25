package Java_Dersleri1;

import java.util.ArrayList;

public class C11_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> groups = new ArrayList<String>();

        groups.add("Metallica");
        groups.add("İron Maiden");
        groups.add("Guns' n Roses");
        groups.add("Black Sabbath");


        System.out.println(groups.indexOf("Black Sabbath"));

        for (int i = 0; i < groups.size(); i++) {
            System.out.println("Eleman: "+ groups.get(i));

        }

    }
}

package replit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ENG_List_4 {

    /* Write a program that deletes the letters 'a' from the names in the list given as input.

    INPUT :
    list1={"Ali","Veli","Ayse","Fatma","Omer"}

    OUTPUT :

    [Veli,Omer]
    */

    public static void main(String[] args) {

        String[] list = {"Ali", "Veli", "Ayse", "Fatma", "Omer"};


        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {

            if (!list[i].toLowerCase().contains("a")) {

                yeniList.add(list[i]);
            }

        }
        System.out.println(yeniList);


    }

}

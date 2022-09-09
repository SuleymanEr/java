package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ENG_List_2 {

    /* Create a 10-element list. Swap the 8th element with the 3rd element.

    INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

     Output:
    [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]

*/


    public static void main(String[] args) {

        ArrayList <String> list=new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        Collections.swap(list,7,2);
        System.out.println(list);




    }


}

package replit;

import java.util.ArrayList;
import java.util.List;

public class ENG_List_7 {

    public static void main(String[] args) {

     /*   write a Java program to removes a specific element from an array and put
      the remaining elements in a new array and prints the new array

        Input :{1,2,3,4,5,6}

        element:6

        Output : [1,2,3,4,5]

        */

        int [] sayilar={1,2,3,4,5,6};
        int silinicekSayi=6;

        List<Integer> sayilar2= new ArrayList<>();

        for (int i = 0; i < sayilar.length ; i++) {

            sayilar2.add(sayilar[i]);
        }
        System.out.println(sayilar2);
        sayilar2.remove(sayilar2.indexOf(silinicekSayi));
        System.out.println(sayilar2);

        }



    }
/*

 public static void main(String[] args) {
        Integer[] number={1,2,3,4,5,6};
        int element=3;

       List<Integer> newList = new ArrayList<>();



        for (int i = 0; i < number.length ; i++) {
            if (number[i]!=element){
                newList.add(number[i]);
            }
        }

    }




 */

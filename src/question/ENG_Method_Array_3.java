package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ENG_Method_Array_3 {
    public static void main(String[] args) {

        /*Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

        input : ade1r4d3
        output : 8

       Hint :
        Use Character.isDigit()
        Integer.valueOf()

        */
        String str = "ade1r4d3";
        rakamBul(str);

    }

    public static void rakamBul(String str) {


        String [] arr=str.split("");
        System.out.println(Arrays.toString(arr));


        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(str.charAt(i))) {

             sum += Integer.valueOf(str.substring(i, i + 1)); // valueOf (String)
               //   sum = Integer.valueOf(str.substring(3,4));
               //   sum = Integer.valueOf(5);



            }

        }
        System.out.println("Input :" + str + "\nOutput :" + sum);


    }


}

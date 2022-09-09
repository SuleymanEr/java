package replit;

import java.util.Arrays;

public class ENG_Method_Array_8 {
    public static void main(String[] args) {
        /*
        Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

        Input1={1,2,3,4}

        Input2={5,6}
        Output={1,2,3,4,5,6}
        */

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        int[] birlestirilenArr = arryEkle(arr1, arr2);
        System.out.println("Input1 :"+Arrays.toString(arr1) +"\nInput2 :"+Arrays.toString(arr2) +"\nOutput :"+Arrays.toString(birlestirilenArr));
    }

    public static int[] arryEkle(int[] arr1, int[] arr2) {
        int[] yeniArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            yeniArr[i] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++) {

            yeniArr[arr1.length + i] = arr2[i];


        }
        return yeniArr;

    }
}
package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENG_List_1 {
    public static void main(String[] args) {

       /* Write a Java program to get a String from user as input and
        find the maximum occurring character in that string. (Ignore case sensitivity)

        Schreiben Sie ein Java-Programm, um einen String vom Benutzer als Eingabe zu erhalten und
        das maximal vorkommende Zeichen in diesem String zu finden. (Groß-/Kleinschreibung ignorieren)


 occurring character is
         input :
         Learning java is easy
         output:
         maximum occurring character is : a
         */

        String str = "Learning java is easy";
        str = str.toLowerCase().replaceAll("\\s", "");

        String[] arr = str.split("");
        Arrays.sort(arr);

        List<String> liste = new ArrayList<>();
        int sayac = 0;
        int max = 0;
        String maxArr = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1]) && !liste.contains(arr[i])) {

                liste.add(++sayac + arr[i]);

                if (sayac > max) {
                    max = sayac;
                    maxArr = arr[i];
                }
            } else {
                sayac = 0;
            }
        }
        //System.out.println("Harf sayisi"+(++max));
        System.out.println("Input : Learning java is easy");
        System.out.println("Output: " + maxArr);


    }


}


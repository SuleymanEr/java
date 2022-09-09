package replit;

import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_6 {

    public static void main(String[] args) {

       /* Ask user to type a name,
the length of name should be 3.
Then check if the name has same characters.
If the String has same characters
Print “String has duplicate characters” Else
Print “String has unique characters”
Please use ternary.
 Input :
    ala
    OutPut:
String has duplicate characters

        */
        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen isim giriniz");
        String name = scan.next().toLowerCase();

        if (name.length() > 3) {
            System.out.println("LÜtfen 3 harfli bir isim giriniz");
        } else {

            System.out.println(name.charAt(0) == name.charAt(1) || name.charAt(0) == name.charAt(2) ? "girdiginiz Strring ayni iki karakter iceriyor" :
                    name.charAt(1) == name.charAt(2) ? "girdiginiz String ayni iki karakter iceriyor" : "Girdiginiz String karakterleri hepsi farkli");

        }


    }
}

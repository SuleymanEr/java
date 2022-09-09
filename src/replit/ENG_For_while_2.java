package replit;

import java.util.Scanner;

public class ENG_For_while_2 {
    public static void main(String[] args) {


         /* Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

    Input :
     30 and 40

    Expected OutPut:

    GCD for 30 and 40 = 10
   LCM for 30 and 40 = 120


    */

        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen iki tane sayi giriniz");
        int sayi1 = scan.nextInt(), sayi2 = scan.nextInt();
        int ebob = 1;
        int ekok = 1;
        int max = sayi1 * sayi2;


        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {

            if (sayi1 % i == 0 && sayi2 % i == 0) {


                ebob = i;

            }

        }
        System.out.println(sayi1 + " ve " + sayi2 + "nin " + "ebob'u: " + ebob);

        for (int i = max; i > 0; i--) {

            if (i % sayi1 == 0 && i % sayi2 == 0) {

                ekok = i;


            }

        }
        System.out.println(sayi1 + " ve " + sayi2 + "nin " + "ekok'u: " + ekok);
    }
}




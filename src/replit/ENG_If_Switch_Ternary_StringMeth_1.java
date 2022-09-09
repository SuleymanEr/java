package replit;

import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_1 {
    public static void main(String[] args) {

      /*  Ask user to their weight and height and type a program with calculates mass index

   HINT : Body Mass Index = Weight (kg) / Square of height (m)
                Then give a message to user as following:

        If BMI is less than 18.5 , you re weak If BMI is between 18.5 and 25 ,
         your weight is ideal If BMI is between 25 and 30, you re fat If BMI is more than or equal to 30, obese

        EXAMPLE :

        INPUT:

        Weight : 71

        Height : 1,72

        OUTPUT :

        Your BMI is : 23.99945916711736 Your weight is ideal
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        int kilo = scan.nextInt();
        System.out.println("Lütfen boy uzunlugunuzu giriniz");
        double boy = scan.nextDouble();

        double index = kilo / boy*boy;

        if (index <= 18.5) {
            System.out.println(index+" zayif");
        } else if (index <= 25) {
            System.out.println(index+" ideal");

        } else if (index <= 30) {
            System.out.println(index+" fit");

        } else {
            System.out.println(index+" obez");


        }
    }
}
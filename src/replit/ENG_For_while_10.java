package replit;

public class ENG_For_while_10 {

    public static void main(String[] args) {

        /*

    Write a Program to find the sum of natural numbers from 1 to 100.

    OUTPUT : Sum of Natural Numbers 5050

*/
        int sayi = 1;
        int toplam = 0;

        while (sayi <= 100) {

            toplam += sayi;
            sayi++;

        }
        System.out.println(toplam);


    }
}

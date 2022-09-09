package replit;

public class ENG_varargs_1 {

    public static void main(String[] args) {

      /*  Write a return method that accepts more than one integer
        as parameter and prints the sum of integers Method name = sum if you call method like that
        sum(1,2,3) output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3
        */

        int sayi1 = 1;
        int sayi2 = 2;
        int sayi3 = 3;
        int sayi4 = 4;
        int sayi5 = 5;

        System.out.println("sum1: "+sayilariToplaa(sayi1, sayi2, sayi3, sayi4, sayi5));
        System.out.println("sum2: "+sayilariToplaa(sayi1,sayi2,sayi3,sayi4));
        System.out.println("sum3: "+sayilariToplaa(sayi1,sayi2,sayi3));


    }

    public static int sayilariToplaa(int... sayi) {

        int toplam = 0;

        for (int each : sayi
        ) {

            toplam += each;

        }
        return toplam;
    }
}

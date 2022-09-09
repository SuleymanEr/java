package replit;

public class ENG_Method_Array_1 {
    public static void main(String[] args) {

      /*  Write a return method to reverse number.

         Input : 12345

        Output : 54321
        */




        int input = 12345;
        tersTen(input);


    }

   public static int tersTen(int input) {
        int sayi = 12345;
        int temp = 0;

        while (sayi > 0) {

            temp = temp * 10 + sayi % 10;
            sayi = sayi / 10;


        }
        System.out.println(temp);

        return temp;

    }

}

package replit;

public class ENG_For_while_4 {
    public static void main(String[] args) {

        //  Write a return method that accepts an integer as input and calculates factorial and prints like output.

        //        Input : 6

        // Output: 6!=65432*1=720

        int input = 6;
        int sonuc = faktoryel(input);
        System.out.println(input + "!=" + sonuc);

    }

    public static int faktoryel(int input) {

        int sonuc = 1;
        for (int i = input; i >= 1; i--) {

            sonuc *= i;

        }
        return sonuc;

    }

}


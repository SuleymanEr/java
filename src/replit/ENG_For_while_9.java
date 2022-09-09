package replit;

public class ENG_For_while_9 {

    public static void main(String[] args) {

      /*  Write a java program to reverse the number which user entered.
                Input :1238
        Output :Reverse Of The Number: 8321
        */

        int sayi = 1238;
        int yeniSayi = 0;

        while (sayi > 0) {
            yeniSayi = yeniSayi * 10 + sayi % 10;
            sayi = sayi / 10;

        }
        System.out.println(yeniSayi);
    }
}

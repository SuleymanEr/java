package replit;

public class ENG_List_8 {
    public static void main(String[] args) {

      /*  Write a java program which accept a sentence as parameter, than reverses sentence
       by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.

        Input :
        I love Java.
        Output:
        Reversed sentence : avaJ evol I. It is not a palindrome"
        */
        String str = " I love Java.";
        StringBuilder sb = new StringBuilder(" I love Java.");
        sb.reverse();
        String strTersten = sb.toString();

        if (str.equals(strTersten)) {
            System.out.println("it is a palindrome");
        } else System.out.println("it is a not palindrome");


    }

}
 /*
  String cumle="Adanada";
        StringBuilder input = new StringBuilder(cumle.toLowerCase());

        //System.out.println(input);
       // System.out.println(input.reverse());


        if (input.toString().equals(input.reverse().toString())){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }






  */